package Task_2;

/**
 * Класс Треугольнк
 * Наследуется от абстрактного класса 'Фигура'
 */
public class Triangle extends Figure { // производный класс треугольника

    /**
     * Переменные, содержащие
     * Название фигуры
     * сторону AB
     * сторону BC
     * сторону CA
     */
    String FigureName = "Треугольник";
    double AB;
    double BC;
    double CA;

    /**
     * Конструктор класса, принимающийй в качестве параметров XY координаты вершин
     */
    Triangle(double ax, double ay, double bx, double by, double cx, double cy) {  // конструктор с обращением к конструктору класса Figure
        this.AB = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        this.BC = Math.sqrt(Math.pow((cx - bx), 2) + Math.pow((cy - by), 2));
        this.CA = Math.sqrt(Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2));
    }

    /**
     * Метод, возвращающий периметр фигуры
     */
    public double getPerimeter() {
        return AB + BC + CA;
    }

    /**
     * Метод, возвращающий площадь фигуры
     */
    public double getSquare() {
        return Math.sqrt((getPerimeter() / 2) * (getPerimeter() / 2 - AB) * (getPerimeter() / 2 - BC) * (getPerimeter() / 2 - CA));
    }

    /**
     * Метод, выводящий основную информацию о фигуре
     */
    public void print() {
        System.out.println("\nДанная фигура - " + this.FigureName);
        System.out.println("Сторона AB = " + AB);
        System.out.println("Сторона BC = " + BC);
        System.out.println("Сторона CA = " + CA);
        System.out.println("Периметр P = " + getPerimeter());
        System.out.println("Площадь  S = " + getSquare());
    }
}
