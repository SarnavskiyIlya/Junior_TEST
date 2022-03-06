package Task_2;

public class Cone extends Body {

    String Body_Name = "Конус";
    double R;
    double H;

    Cone(double r, double h) {

        this.R = r;
        this.H = h;
    }

    public double getVolume() {
        return (Math.PI * (R * R) * H) / 3;
    }

    public void print() {
        System.out.println("\nДанное тело - " + this.Body_Name);
        System.out.println("Площадь основания = " + Math.PI * (R * R));
        System.out.println("Высота = " + H);
        System.out.println("Объем V = " + getVolume());

    }
}
