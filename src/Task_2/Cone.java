package Task_2;

/**
 * Класс Конус
 * Наследуется от абстрактного класса 'Тело'
 */
public class Cone extends Body {

    /**
     * Переменные, содержащие
     * Имя тела
     * Радиус основания
     * Высоту конуса
     */
    String BodyName = "Конус";
    double R;
    double H;

    /**
     * Конструктор класса, принимающий в качестве параметров
     * радиус основания и высоту конуса
     */
    Cone(double r, double h) {
        this.R = r;
        this.H = h;
    }

    /**
     * Метод, возвращающий объем конуса
     */
    public double getVolume() {
        return (Math.PI * (R * R) * H) / 3;
    }

    /**
     * Метод, выводящий основную информацию о теле
     */
    public void print() {
        System.out.println("\nДанное тело - " + this.BodyName);
        System.out.println("Площадь основания = " + Math.PI * (R * R));
        System.out.println("Высота = " + H);
        System.out.println("Объем V = " + getVolume());
    }
}
