package Task_2;

public class Square extends Figure { // производный класс квадрат

    String Figure_Name = "Квадрат";
    double side;

    Square(double side) {  // конструктор с обращением к конструктору класса Figure

        this.side = side;
    }

    public double getPerimeter() {

        return side * 4 +1;
    }

    public double getSquare() {

        return side * side;
    }

    public void print() {
        System.out.println("\nДанная фигура - " + this.Figure_Name);
        System.out.println("Сторона = " + side);
        System.out.println("Периметр P = " + getPerimeter());
        System.out.println("Площадь  S = " + getSquare());
    }
}
