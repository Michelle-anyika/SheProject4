//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Triangle");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Circle
                    Circle c = new Circle();
                    System.out.print("Enter radius: ");
                    int r = sc.nextInt();
                    c.area(r);
                    System.out.println("Circle Area: " + c.calculateArea());
                    break;

                case 2: // Rectangle
                    Rectangle R = new Rectangle();
                    System.out.print("Enter length: ");
                    int length = sc.nextInt();
                    System.out.print("Enter width: ");
                    int width = sc.nextInt();
                    R.area(length, width);
                    System.out.println("Rectangle Area: " + R.calculateArea());
                    break;

                case 3: // Triangle
                    Triangle t = new Triangle();
                    System.out.print("Enter base: ");
                    int base = sc.nextInt();
                    System.out.print("Enter height: ");
                    int height = sc.nextInt();
                    t.area(base, height);
                    System.out.println("Triangle Area: " + t.calculateArea());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }


        }
        while(choice !=4);
        sc.close();

    }
}