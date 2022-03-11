package Task_3;

import java.util.Scanner;

/**
 * Основной класс, в котором производится запуск программы
 */
public class Main {

    /**
     * Создание объекта класса с вычислениями
     */
    static Calculations calculations = new Calculations();
    /**
     * Переменная, в которой содержится число, соответствующее выбранному пункту меню
     */
    private static int MenuSelection;

    /**
     * - Метод мейн, в котором производится вызов остальных методов
     * - В мейне реализовано двойное меню (Выбор типа данных, выбор типа операции)
     * - Переменные заносятся в case c соответствующим типом данных
     * - При выборе типа данных 'Вектор' создается объект класса вектор и вызываются его методы
     */
    public static void main(String[] args) {

        System.out.println("\n      Программа 'Математические вычисления'\n");

        switch (MenuSelectionCheck()) {

            case 1 -> {
                Calculations.integers.setX(4); // 1 переменная типа int
                Calculations.integers.setY(2); // 2 переменная типа int

                switch (OperationChoice()) {
                    case 1 -> calculations.addition(1);
                    case 2 -> calculations.subtraction(1);
                    case 3 -> calculations.multiplication(1);
                    case 4 -> calculations.division(1);
                }
                calculations.print(1);
            }
            case 2 -> {
                Calculations.doubles.setX(12.1); // 1 переменная типа double
                Calculations.doubles.setY(6.05); // 1 переменная типа double

                switch (OperationChoice()) {
                    case 1 -> calculations.addition(2);
                    case 2 -> calculations.subtraction(2);
                    case 3 -> calculations.multiplication(2);
                    case 4 -> calculations.division(2);
                }
                calculations.print(2);
            }
            case 3 -> {
                Calculations.strings.setX("12345"); // 1 переменная типа string
                Calculations.strings.setY("qwe");   // 2 переменная типа string

                switch (OperationChoice()) {
                    case 1 -> calculations.addition(3);
                    case 2 -> calculations.subtraction(3);
                    case 3 -> calculations.multiplication(3);
                    case 4 -> calculations.division(3);
                }
                calculations.print(3);
            }
            case 4 -> {
                Vectors vector = new Vectors();
                vector.coordinates.add(0.0); //  X первой точки первого вектора [0]
                vector.coordinates.add(0.0); //  Y первой точки первого вектора [1]
                vector.coordinates.add(3.0); //  X второй точки первого вектора [2]
                vector.coordinates.add(3.0); //  Y второй точки первого вектора [3]

                switch (OperationChoice()) {
                    case 1 -> {
                        vector.coordinates.add(3.0); //  X первой точки второго вектора [4]
                        vector.coordinates.add(3.0); //  Y первой точки второго вектора [5]
                        vector.coordinates.add(6.0); //  X второй точки второго вектора [6]
                        vector.coordinates.add(0.0); //  Y второй точки второго вектора [7]
                        vector.addition();
                    }
                    case 2 -> {
                        vector.coordinates.add(0.0);  //  X первой точки второго вектора [4]
                        vector.coordinates.add(0.0);  //  Y первой точки второго вектора [5]
                        vector.coordinates.add(3.0);  //  X второй точки второго вектора [6]
                        vector.coordinates.add(-3.0); //  Y второй точки второго вектора [7]
                        vector.subtraction();
                    }
                    case 3 -> vector.multiplication();
                    case 4 -> vector.division();
                }
                vector.print();
            }
        }
    }

    /**
     * Метод, в котором проверяется корректный ввод в консоль
     * в меню выбора данных
     */
    public static int MenuSelectionCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите, с каким типом данных будете работать");
        System.out.println("1 - Целые числа");
        System.out.println("2 - Дробные числа");
        System.out.println("3 - Строки");
        System.out.println("4 - Вектора");
        System.out.print("Ввод: ");
        if (scanner.hasNextInt()) {
            MenuSelection = scanner.nextInt();
            if (MenuSelection < 1 || MenuSelection > 4) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("Введите число, соответствоющее пункту в меню");
                MenuSelectionCheck();
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            MenuSelectionCheck();
        }
        return MenuSelection;
    }

    /**
     * Метод, в котором проверяется корректный ввод в консоль
     * в меню выбора типа операции
     */
    public static int OperationChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите тип вычисления");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.print("Ввод: ");
        if (scanner.hasNextInt()) {
            MenuSelection = scanner.nextInt();
            if (MenuSelection < 1 || MenuSelection > 4) {
                System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
                System.out.println("Введите число, соответствоющее пункту в меню");
                OperationChoice();
            }
        } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            OperationChoice();
        }
        return MenuSelection;
    }
}
