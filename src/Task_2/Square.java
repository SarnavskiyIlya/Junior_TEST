package Task_2;

/**
 * Класс квадрат
 * Наследуется от абстрактного класса 'Фигура'
 */
public class Square extends Figure {

    /**
     * Переменные, содержащие
     * Имя фигуры
     * Велечину стороны
     */
    String FigureName = "Квадрат";
    double side;

    /**
     * Конструктор класса, принимающий в качестве параметра длину стороны
     */
    Square(double side) {
        this.side = side;
    }

    /**
     * Метод, возвращающий периметр фигуры
     */
    public double getPerimeter() {
        return side * 4 +1;
    }

    /**
     * Метод, возвращающий площадь фигуры
     */
    public double getSquare() {
        return side * side;
    }

    /**
     * Метод, выводящий основную информацию о фигуре
     */
    public void print() {
        System.out.println("\nДанная фигура - " + this.FigureName);
        System.out.println("Сторона = " + side);
        System.out.println("Периметр P = " + getPerimeter());
        System.out.println("Площадь  S = " + getSquare());
    }
}
