package Task_3;

import java.util.ArrayList;

/**
 * Класс для типа данных 'Вектор'
 * Простые операции для этого класса производятся тут же
 *
 * Посколько от типа операции координаты меняются, ввод дополнительных координат
 * происходит после выбора операции!
 */
public class Vectors extends Main {

    /**
     * coordinates - список с координатами точек
     * variables - объект генерик класса с его методами
     */
    ArrayList<Double> coordinates = new ArrayList<>();
    Variables<Double> variables = new Variables<>();

    /**
     * Сложение
     */
    public void addition() {
        variables.setX(Math.sqrt((Math.pow((coordinates.get(2) - coordinates.get(0)), 2)) + (Math.pow((coordinates.get(3) - coordinates.get(1)), 2))));
        variables.setY(Math.sqrt((Math.pow((coordinates.get(6) - coordinates.get(4)), 2)) + (Math.pow((coordinates.get(7) - coordinates.get(5)), 2))));
        variables.setA(Math.sqrt((Math.pow((coordinates.get(6) - coordinates.get(0)), 2)) + (Math.pow((coordinates.get(7) - coordinates.get(1)), 2))));
    }

    /**
     * Вычитание
     */
    public void subtraction() {
        variables.setX(Math.sqrt((Math.pow((coordinates.get(2) - coordinates.get(0)), 2)) + (Math.pow((coordinates.get(3) - coordinates.get(1)), 2))));
        variables.setY(Math.sqrt((Math.pow((coordinates.get(6) - coordinates.get(4)), 2)) + (Math.pow((coordinates.get(7) - coordinates.get(5)), 2))));
        variables.setA(Math.sqrt((Math.pow((coordinates.get(2) - coordinates.get(6)), 2)) + (Math.pow((coordinates.get(3) - coordinates.get(7)), 2))));
        System.out.println("х = " + variables.getX());
    }

    /**
     * Умножение. То же самое, что и сложение)
     */
    public void multiplication() {
        addition();
    }

    /**
     * Деление. То же самое, что и вычитание)
     */
    public void division() {
        subtraction();
    }

    public void print() {
        System.out.println("Длина вектора AB = " + variables.getX());
        System.out.println("Длина вектора BC = " + variables.getY());
        System.out.println("Результат вычисления AC = " + variables.getA());
    }
}
