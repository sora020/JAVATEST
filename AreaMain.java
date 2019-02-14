import java.util.Scanner;

class AreaRectSquare {
    private double l, b;

    public AreaRectSquare(double l) {
        this.l = l;
        this.b = l;
    }

    public AreaRectSquare(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double Result() {
        return l * b;
    }
}

public class AreaMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter 1. for Area of Square\n 2. for Area of Rectangle");
            int ch1 = sc.nextInt();
            if (ch1 == 1) {
                System.out.println("Enter value of Side of a Square");
                double s = sc.nextDouble();
                AreaRectSquare a = new AreaRectSquare(s);
                System.out.println("The Result is: " + a.Result());
            } else if (ch1 == 2) {
                System.out.println("Enter value of Length of a Rectangle");
                double l = sc.nextDouble();
                System.out.println("Enter value of Breadth of a Rectangle");
                double b = sc.nextDouble();
                AreaRectSquare a1 = new AreaRectSquare(l, b);
                System.out.println("The Result is: " + a1.Result());
            } else
                System.out.println("Wrong Choice");
            System.out.println("Enter 'y' or 'Y' to run the program again");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}