package Task_2;

/**
 * Класс Трапеция
 * Наседуется от абстрактного класса 'Фигура'
 */
public class Trapezoid {

    /**
     * Переменные, содержащие
     * Имя фигуры
     * Сторону A
     * Сторону B
     * Сторону C
     * Сторону D
     */
    String FigureName = "Трапеция";
    double A;
    double B;
    double C;
    double D;

    /**
     * Конструктор класса, принимающий в качестве параметров XY координаты вершин
     */
    Trapezoid(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
        this.A = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        this.B = Math.sqrt(Math.pow((cx - bx), 2) + Math.pow((cy - by), 2));
        this.C = Math.sqrt(Math.pow((dx - cx), 2) + Math.pow((dy - cy), 2));
        this.D = Math.sqrt(Math.pow((ax - dx), 2) + Math.pow((ay - dy), 2));
    }

    /**
     * Метод, возвращающий периметр фигуры
     */
    public double getPerimeter() {
        return A + B + C + D;
    }

    /**
     * Метод, возвращающий площадь фигуры
     */
    public double getSquare() {
        return (((B + D) / Math.abs(B - D)) * Math.sqrt((getPerimeter() / 2 - B) * (getPerimeter() / 2 - D) * (getPerimeter() / 2 - B - C) * (getPerimeter() / 2 - B - C)));
    }

    /**
     * Метод, выводящий основную информацию о фигуре
     */
    public void print() {
        System.out.println("\nДанная фигура - " + this.FigureName);
        System.out.println("Сторона A = " + A);
        System.out.println("Сторона B = " + B);
        System.out.println("Сторона C = " + C);
        System.out.println("Сторона D = " + D);
        System.out.println("Периметр P = " + getPerimeter());
        System.out.println("Площадь  S = " + getSquare());
    }
}
