import java.lang.Math;
import java.util.Scanner;

class Shape {
    public double volume(double radsphere) {
        return (4.19047514 * Math.pow(radsphere, 3));
    }

    double volume(double radius, double height) {
        return (1.04761905 * height * Math.pow(radius, 2));
    }

    double volume(double length, double breadth, double height) {
        return (length * breadth * height);
    }

}

public class ShapeMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Shape a = new Shape();
        char ch;
        do {
            System.out.println("Enter\n 1. for Volume of Sphere\n 2. for Volume of Cone\n 3. for volume of Box");
            char ch1 = sc.next().charAt(0);
            if (ch1 == '1') {
                System.out.println("Enter value of Radius of a Sphere");
                double r = sc.nextDouble();
                System.out.println("The Result is: " + a.volume(r));
            } else if (ch1 == '2') {
                System.out.println("Enter value of Radius of the Cone");
                double r = sc.nextDouble();
                System.out.println("Enter value of Height of the Box");
                double h = sc.nextDouble();
                System.out.println("The Result is: " + a.volume(r, h));
            } else if (ch1 == '3') {
                System.out.println("Enter value of Length of the Box");
                double l = sc.nextDouble();
                System.out.println("Enter value of Breadth of the Box");
                double b = sc.nextDouble();
                System.out.println("Enter value of Height of the Box");
                double h = sc.nextDouble();
                System.out.println("The Result is: " + a.volume(l, b, h));
            } else
                System.out.println("Wrong Choice");
            System.out.println("Enter 'y' or 'Y' to run the program again");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}
