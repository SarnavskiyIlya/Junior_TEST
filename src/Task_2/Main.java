package Task_2;

//import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("\n      Программа 'Вычисление площади и объема у объектов'\n");
        Input input = new Input();
        input.InputObjectType();
        switch (input.getMenuSelection()) {
            case 1 -> {

                input.InputFigureType();
                switch (input.getMenuSelection()) {
                    case 1 -> {

                        Square square = new Square(input.InputSides());
                        square.print();
                    }
                    case 2 -> {

                        Trapezoid trapezoid = new Trapezoid(0, 0, 3, 3, 6, 3, 9, 0);
                        trapezoid.print();
                    }
                    case 3 -> {

                        Triangle triangle = new Triangle(-1, 4, -1, 2, -7, 3);
                        triangle.print();
                    }
                }
            }
            case 2 -> {

                input.InputBodyType();
                switch (input.getMenuSelection()) {
                    case 1 -> {

                        Cone cone = new Cone(2, 5);
                        cone.print();
                    }
                    case 2 -> {

                        Cube cube = new Cube(5);
                        cube.print();
                    }
                    case 3 -> {

                        Cylinder cylinder = new Cylinder(4, 6);
                        cylinder.print();
                    }
                }
            }
        }
    }
}
