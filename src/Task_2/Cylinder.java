package Task_2;

/**
 * Класс цилиндр
 * Наследуется от абстрактного класса 'Тело'
 */
public class Cylinder extends Body {

    /**
     * Переменные, содержащие в себе
     * Имя тела
     * Радиус цилиндра
     * Высоту цилиндра
     */
    String BodyName = "Цилиндр";
    double R;
    double H;

    /**
     * Конструктор класса
     * Принимающий в качестве параметров радиус и высоту цилиндра
     */
    Cylinder(double r, double h) {
        this.R = r;
        this.H = h;
    }

    /**
     * Метод, возвращающий объем цилиндра
     */
    public double getVolume() {
        return Math.PI * (R * R) * H;
    }

    /**
     * Метод, выводящий оснвную информацию о теле
     */
    public void print() {
        System.out.println("\nДанное тело - " + this.BodyName);
        System.out.println("Площадь основания = " + Math.PI * (R * R));
        System.out.println("Высота = " + H);
        System.out.println("Объем V = " + getVolume());
    }
}
