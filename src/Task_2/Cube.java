package Task_2;

public class Cube extends Body {

    String Body_Name = "Куб";
    double A;

    Cube(double a) {

        this.A = a;
    }

    public double getVolume() {
        return A * A * A;
    }

    public void print() {
        System.out.println("\nДанное тело - " + this.Body_Name);
        System.out.println("Сторона A = " + A);
        System.out.println("Объем V = " + getVolume());

    }
}
