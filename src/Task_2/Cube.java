package Task_2;

/**
 * Класс Куб
 * Наследуется от абстрактного класса 'Тело'
 */
public class Cube extends Body {

    /**
     * Переменные названия тела и стороны куба
     */
    String BodyName = "Куб";
    double A;

    /**
     * Конструктор класса, принимающий в качестве параметра длину стороны
     */
    Cube(double a) {
        this.A = a;
    }

    /**
     * Метод, возвращающий объем тела
     */
    public double getVolume() {
        return A * A * A;
    }

    /**
     * Метод, выводящий основную информацию о теле
     */
    public void print() {
        System.out.println("\nДанное тело - " + this.BodyName);
        System.out.println("Сторона A = " + A);
        System.out.println("Объем V = " + getVolume());
    }
}
