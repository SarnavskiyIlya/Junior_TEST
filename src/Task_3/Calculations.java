package Task_3;

/**
 * Класс, в котором производятся вычисления для основных типов данных
 * В методах реализовано переключение switch, для корректной работы с разными типами данных
 *
 * Параметр number в методах передается при вызове этих методов
 */
public class Calculations implements Operations {

    /**
     * Создание объектов разных типов с методами Генерик класса
     */
    static Variables<Integer> integers = new Variables<>();
    static Variables<Double> doubles = new Variables<>();
    static Variables<String> strings = new Variables<>();

    /**
     * Сложение
     */
    @Override
    public void addition(int number) {
        switch (number) {
            case 1 -> integers.setA(integers.getX() + integers.getY());
            case 2 -> doubles.setA(doubles.getX() + doubles.getY());
            case 3 -> strings.setA(strings.getX() + strings.getY());
        }
        System.out.println("Ответ =  ");
    }

    /**
     * Вычитание
     */
    @Override
    public void subtraction(int number) {
        switch (number) {
            case 1 -> integers.setA(integers.getX() - integers.getY());
            case 2 -> doubles.setA(doubles.getX() - doubles.getY());
            case 3 -> stringSubtraction();
        }
        System.out.println("Ответ =  ");
    }

    /**
     * Умножение (Для строк то же самое, что и сложение)
     */
    @Override
    public void multiplication(int number) {

        switch (number) {
            case 1 -> integers.setA(integers.getX() * integers.getY());
            case 2 -> doubles.setA(doubles.getX() * doubles.getY());
            case 3 -> strings.setA(strings.getX() + strings.getY());
        }
    }

    /**
     * Деление (Для строк то же самое, что и вычитание)
     */
    @Override
    public void division(int number) {

        switch (number) {
            case 1 -> integers.setA(integers.getX() / integers.getY());
            case 2 -> doubles.setA(doubles.getX() / doubles.getY());
            case 3 -> stringSubtraction();
        }
    }

    /**
     * Вычитание для строк
     * Вторая строка с конца перекрывает посимвольно первую строку с конца
     * Пример :
     * 1 строка - 12345
     * 2 строка - day
     * Результат - 12day
     */
    public void stringSubtraction() {
        int number1 = strings.getX().length(); // Переменная, содержащая длину 1 строки
        int number2 = strings.getY().length(); // Переменная, содержащая длину 2 строки
        char[] FirstString = strings.getX().toCharArray();  // Строка 1 -> массив символов 1
        char[] SecondString = strings.getY().toCharArray(); // Строка 2 -> массив символов 2

        if (number2 > number1) {
            for (int i = 1; i <= number1; i++) {
                FirstString[number1 - i] = SecondString[number2 - i];
            }
        } else if (number2 < number1) {
            for (int i = 1; i <= number2; i++) {
                FirstString[number1 - i] = SecondString[number2 - i];
            }
        } else {
            System.arraycopy(SecondString, 0, FirstString, 0, number1);
        }
        strings.setA(String.valueOf(FirstString));
    }

    /**
     * Метод, в котором выводятся значения переменных и результаты вычеслений
     * для простых типов данных (int, double, string)
     */
    public void print(int number) {

        System.out.println("\nРезультат работы программы:");
        switch (number) {
            case 1 -> {
                System.out.println("1 переменная = " + integers.getX());
                System.out.println("2 переменная = " + integers.getY());
                System.out.println("Результат вычисления = " + integers.getA());
            }
            case 2 -> {
                System.out.println("1 переменная = " + doubles.getX());
                System.out.println("2 переменная = " + doubles.getY());
                System.out.println("Результат вычисления = " + doubles.getA());
            }
            case 3 -> {
                System.out.println("1 переменная = " + strings.getX());
                System.out.println("2 переменная = " + strings.getY());
                System.out.println("Результат вычисления = " + strings.getA());
            }
        }
        System.out.println("Завершение работы программы");
    }
}
