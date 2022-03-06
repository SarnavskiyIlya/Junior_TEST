package Task_2;

public class Trapezoid { // производный класс треугольника

    String Figure_Name = "Трапеция";
    int tops = 4;
    double A;
    double B;
    double C;
    double D;

    Trapezoid(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {  // конструктор с обращением к конструктору класса Figure

        this.A = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        this.B = Math.sqrt(Math.pow((cx - bx), 2) + Math.pow((cy - by), 2));
        this.C = Math.sqrt(Math.pow((dx - cx), 2) + Math.pow((dy - cy), 2));
        this.D = Math.sqrt(Math.pow((ax - dx), 2) + Math.pow((ay - dy), 2));
    }

    public double getPerimeter() {

        return A + B + C + D;
    }

    public double getTops() {

        return tops;
    }

    public double getSquare() {

        return (((B + D) / Math.abs(B - D)) * Math.sqrt((getPerimeter() / 2 - B) * (getPerimeter() / 2 - D) * (getPerimeter() / 2 - B - C) * (getPerimeter() / 2 - B - C)));
    }

    public void print() {
        System.out.println("\nДанная фигура - " + this.Figure_Name);
        System.out.println("Сторона A = " + A);
        System.out.println("Сторона B = " + B);
        System.out.println("Сторона C = " + C);
        System.out.println("Сторона D = " + D);
        System.out.println("Периметр P = " + getPerimeter());
        System.out.println("Площадь  S = " + getSquare());
    }
}
