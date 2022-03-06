package Task_2;

public class Triangle extends Figure { // производный класс треугольника

    String Figure_Name = "Треугольник";
    int tops = 3;
    double AB;
    double BC;
    double CA;

    Triangle(double ax, double ay, double bx, double by, double cx, double cy) {  // конструктор с обращением к конструктору класса Figure

        this.AB = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        this.BC = Math.sqrt(Math.pow((cx - bx), 2) + Math.pow((cy - by), 2));
        this.CA = Math.sqrt(Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2));
    }

    public double getPerimeter() {

        return AB + BC + CA;
    }

    public double getTops() {

        return tops;
    }

    public double getSquare() {

        return Math.sqrt((getPerimeter() / 2) * (getPerimeter() / 2 - AB) * (getPerimeter() / 2 - BC) * (getPerimeter() / 2 - CA));
    }

    public void print() {
        System.out.println("\nДанная фигура - " + this.Figure_Name);
        System.out.println("Сторона AB = " + AB);
        System.out.println("Сторона BC = " + BC);
        System.out.println("Сторона CA = " + CA);
        System.out.println("Периметр P = " + getPerimeter());
        System.out.println("Площадь  S = " + getSquare());
    }
}
