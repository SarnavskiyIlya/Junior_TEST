package Task_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Task1_FileCopy {

    static String file_path;
    static String file_copy_path;
    static int number;

    public static void main(String[] args) {

        System.out.println("\n      Программа 'Копирование файлов'\n");
        System.out.println("Выберите, каким способом будет скопирован файл");
        switch_enter_check();

        switch (number) {
            case 1 -> {
                File_Copy file_copy_io = new File_Copy_IO();
                file_copy_io.file_path();
                file_copy_io.file_copy_path();
                file_copy_io.paths_check();
                file_copy_io.file_copy();
            }
            case 2 -> {
                File_Copy file_copy_nio = new File_Copy_NIO();
                file_copy_nio.file_path();
                file_copy_nio.file_copy_path();
                file_copy_nio.paths_check();
                file_copy_nio.file_copy();
            }
            case 3 -> {
                File_Copy file_copy_nio2 = new File_Copy_NIO2();
                file_copy_nio2.file_path();
                file_copy_nio2.file_copy_path();
                file_copy_nio2.paths_check();
                file_copy_nio2.file_copy();
            }
        }
    }

    static void switch_enter_check() {
        Scanner scan_number = new Scanner(System.in);
        System.out.println("1 - классический способ (Пакет IO)");
        System.out.println("2 - используя channels (Пакет NIO)");
        System.out.println("3 - используя класс Files (Пакет NIO2)");
        System.out.print("Ввод: ");
        if (scan_number.hasNextInt()) {
            number = scan_number.nextInt();
            if (number < 1 || number > 3) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("Введите число, соответствоющее пункту в меню");
                switch_enter_check();
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!");
            System.out.println("Введите число, соответствоющее пункту в меню");
            switch_enter_check();
        }
    }

    static void enter_file_path() {

        System.out.println("\nВведите в консоли путь к копируемому файлу");
        System.out.println("Пример: C:\\Users\\ilyas\\IdeaProjects\\Junior_TEST\\src\\Task_1\\file.txt");
        System.out.print("Ввод:   ");
        Scanner scanner_input = new Scanner(System.in);
        file_path = scanner_input.nextLine();
    }

    static void enter_file_copy_path() {

        System.out.println("\nВведите в консоли путь, где будет лежать копия файла");
        System.out.println("Пример: C:\\Users\\ilyas\\IdeaProjects\\Junior_TEST\\src\\Task_1\\file_copy.txt");
        System.out.print("Ввод:   ");
        Scanner scanner_output = new Scanner(System.in);
        file_copy_path = scanner_output.nextLine();
    }

    static void enter_paths_check() {
        if (file_path.equals(file_copy_path)) {
            System.out.println("\n                          Ошибка ввода!");
            System.out.println("Пути первоначального файла и его копии совпадают, введите пути заново!");
            enter_file_path();
            enter_file_copy_path();
        }
    }

    static void file_check() {

        int choice_number;
        Scanner scan_file = new Scanner(System.in);
        File file = new File(file_copy_path);

        if (file.exists()) {
            System.out.println("\nФайл по этому пути уже существует, хотите перезаписать его ?");
        } else {
            System.out.println("\nФайла по этому пути не существует, хотите создать новый ?");
        }
        System.out.println("1 - ДА");
        System.out.println("2 - НЕТ");
        System.out.print("Ввод: ");
        if (scan_file.hasNextInt()) {
            choice_number = scan_file.nextInt();
            if (choice_number < 1 || choice_number > 2) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("\nВведите число, соответствующее пункту в меню");
                file_check();
            } else {
                if (choice_number == 2) {
                    System.out.println("\nКонец работы программы");
                } else {
                    System.out.print("\nКопирование файла успешно выполнено!");
                }
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
            System.out.println("\nВведите число, соответствующее пункту в меню");
            file_check();
        }
    }

    interface File_Copy {

        void file_path();

        void file_copy_path();

        void paths_check();

        void file_copy();
    }

    static class File_Copy_IO implements File_Copy {

        public void file_path() {
            enter_file_path();
        }

        public void file_copy_path() {
            enter_file_copy_path();
        }

        public void paths_check() {
            enter_paths_check();
            file_check();
        }

        public void file_copy() {
            try (FileInputStream inputStream = new FileInputStream(file_path)) {

                try (FileOutputStream outputStream = new FileOutputStream(file_copy_path)) {

                    byte[] bytes = new byte[inputStream.available()];
                    int length;

                    while ((length = inputStream.read(bytes)) > 0) {
                        outputStream.write(bytes, 0, length);
                    }
                } catch (IOException exception) {
                    System.out.println(exception.getMessage());
                }
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    static class File_Copy_NIO implements File_Copy {

        public void file_path() {
            enter_file_path();
        }

        public void file_copy_path() {
            enter_file_copy_path();
        }

        public void paths_check() {
            enter_paths_check();
            file_check();
        }

        public void file_copy() {
            try (FileChannel inputChannel = new FileInputStream(file_path).getChannel()) {


                try (FileChannel outputChannel = new FileOutputStream(file_copy_path).getChannel()) {

                    outputChannel.transferFrom(inputChannel, 0, inputChannel.size());

                } catch (IOException exception) {
                    System.out.println(exception.getMessage());
                }

            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    static class File_Copy_NIO2 implements File_Copy {

        public void file_path() {
            enter_file_path();
        }

        public void file_copy_path() {
            enter_file_copy_path();
        }

        public void paths_check() {
            enter_paths_check();
            file_check();
        }

        public void file_copy() {
            try {
                Files.copy(Paths.get(file_path), Paths.get(file_copy_path), StandardCopyOption.REPLACE_EXISTING);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
