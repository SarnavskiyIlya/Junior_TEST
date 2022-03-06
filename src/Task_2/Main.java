package Task_2;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {

    /**
     * Переменная, в которой содержится число, соответствующее выбранному пункту меню
     */
    private static int MenuSelection;

    /**
     * Метод мейн, в котором производится вызов остальных методов
     */
    public static void main(String[] args) {

        System.out.println("\n      Программа 'Вычисление площади и объема у объектов'\n");
        InputObjectType();
        switch (MenuSelection) {
            case 1 -> {

                InputFigureType();
                switch (MenuSelection) {
                    case 1 -> {

                        Square square = new Square(5.5);
                        square.print();
                    }
                    case 2 -> {

                        Trapezoid trapezoid = new Trapezoid(0, 0, 3, 3, 6, 3, 9, 0);
                        trapezoid.print();
                    }
                    case 3 -> {

                        Triangle triangle = new Triangle(-1, 4, -1, 2, -7, 3);
                        triangle.print();
                    }
                }
            }
            case 2 -> {

                InputBodyType();
                switch (MenuSelection) {
                    case 1 -> {

                        Cone cone = new Cone(2, 5);
                        cone.print();
                    }
                    case 2 -> {

                        Cube cube = new Cube(5);
                        cube.print();
                    }
                    case 3 -> {

                        Cylinder cylinder = new Cylinder(4, 6);
                        cylinder.print();
                    }
                }
            }
        }
    }

    /**
     * Метод, в котором определяется тип объекта для работы
     * Т.е. Фигура или тело
     * Также в методе реализована проверка на корректный ввод с клавиатуры
     */
    public static void InputObjectType() {
        Scanner ScanNumber = new Scanner(System.in);
        System.out.println("Выберите, с каким объектом вы будете работать");
        System.out.println("1 - Фигуры");
        System.out.println("2 - Тела");
        System.out.print("Ввод: ");
        if (ScanNumber.hasNextInt()) {
            MenuSelection = ScanNumber.nextInt();
            if (MenuSelection < 1 || MenuSelection > 2) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("Введите число, соответствоющее пункту в меню");
                InputObjectType();
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            InputObjectType();
        }
    }

    /**
     * Метод, вкотором определяется тип Тела для дальнейшей работы
     * Также в методе реализована проверка на корректный ввод с клавиатуры
     */
    public static void InputBodyType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите тело, площадь которого вы хотите вычислить.");
        System.out.println("1 - Конус");
        System.out.println("2 - Куб");
        System.out.println("3 - Цилиндр");
        System.out.print("Ввод: ");
        if (scanner.hasNextInt()) {
            MenuSelection = scanner.nextInt();
            if (MenuSelection < 1 || MenuSelection > 3) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("Введите число, соответствоющее пункту в меню");
                InputBodyType();
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            InputBodyType();
        }
    }

    /**
     * Метод, в котором определяется тип Фигуры для дальнейшей работы
     * Также в методе реализована проверка на корректный ввод с клавиатуры
     */
    public static void InputFigureType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите фигуру, чью площадь и периметр вы хотите вычислить.");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Трапеция");
        System.out.println("3 - Треугольник");
        System.out.print("Ввод: ");
        if (scanner.hasNextInt()) {
            MenuSelection = scanner.nextInt();
            if (MenuSelection < 1 || MenuSelection > 3) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("Введите число, соответствоющее пункту в меню");
                InputFigureType();
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!");
            System.out.println("Введите число, соответствоющее пункту в меню");
            InputFigureType();
        }
    }
}
