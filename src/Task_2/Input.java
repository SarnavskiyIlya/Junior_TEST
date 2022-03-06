package Task_2;

import java.util.Scanner;

public class Input {
   /**
    Переменная, в которой содержится число, соответсвующее пункту в меню
    */
   private int MenuSelection;
  // private int ObjectSelection;

   public void InputObjectType() {
      Scanner ScanNumber = new Scanner(System.in);
      System.out.println("Выберите, с каким объектом вы будете работать");
      System.out.println("1 - Фигуры");
      System.out.println("2 - Тела");
      System.out.print("Ввод: ");
      if (ScanNumber.hasNextInt()) {
         MenuSelection = ScanNumber.nextInt();
         if (MenuSelection < 1 || MenuSelection > 2) {
            System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            InputObjectType();
         }
      } else {
         System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
         System.out.println("Введите число, соответствоющее пункту в меню");
         InputObjectType();
      }
   }


   public void InputBodyType() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Выберите тело, площадь которого вы хотите вычислить.");
      System.out.println("1 - Конус");
      System.out.println("2 - Куб");
      System.out.println("3 - Цилиндр");
      System.out.print("Ввод: ");
      if (scanner.hasNextInt()) {
         MenuSelection = scanner.nextInt();
         if (MenuSelection < 1 || MenuSelection > 3) {
            System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            InputBodyType();
         }
      } else {
         System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!\n");
         System.out.println("Введите число, соответствоющее пункту в меню");
         InputBodyType();
      }
   }

   public void InputFigureType() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nВыберите, фигуру, чью площадь и периметр вы хотите вычислить.");
      System.out.println("1 - Квадрат");
      System.out.println("2 - Трапеция");
      System.out.println("3 - Треугольник");
      System.out.print("Ввод: ");
      if (scanner.hasNextInt()) {
         MenuSelection = scanner.nextInt();
         if (MenuSelection < 1 || MenuSelection > 3) {
            System.out.println("\nОШИБКА ВВОДА! Ваше число не соответствует ни одному пункту в меню!\n");
            System.out.println("Введите число, соответствоющее пункту в меню");
            InputFigureType();
         }
      } else {
         System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!");
         System.out.println("Введите число, соответствоющее пункту в меню");
         InputFigureType();
      }
   }

   public double InputSides() {
      double side = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nВведите длину стороны");
      System.out.print("Ввод: ");
      if (scanner.hasNextDouble()) {
         side = scanner.nextDouble();
      } else {
         System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!");
         InputSides();
      }
      return side;
   }

   public double InputTops(int numberOfTops) {
      double [] array = new double[numberOfTops * 2];
      Scanner scanTop = new Scanner(System.in);
      for (int i = 0; i < numberOfTops ;i+=2){
         System.out.println("Поочередно введите координаты "+ (i+1) + "вершины");
         System.out.print("Введите x: ");
         if (scanTop.hasNextDouble()) {
            array[i] = scanTop.nextDouble();
         } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!");
            System.out.println("Повторите ввод");
            i-=2;
         }
         System.out.print("Введите y: ");
         if (scanTop.hasNextDouble()) {
            array[i+1] = scanTop.nextDouble();
         } else {
            System.out.println("\nОШИБКА ВВОДА! Вы ввели не число!");
            System.out.println("Повторите ввод");
            i-=2;
         }
      }
      return array [numberOfTops * 2];
   }


   public int getMenuSelection() {
      return MenuSelection;
   }

   public void setMenuSelection(){

   }
}
