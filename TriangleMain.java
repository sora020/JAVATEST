import java.util.Scanner;
class Triangle
{   
    private
        double b, h;
    public
        void getData(double b, double h)
        {
            this.h = h;
            this.b = b;
        }
        double showData()
        {
            double res;
            res = 0.5 * h * b;
            return res;
        }
}

public class TriangleMain
{
    public static void main(String args[])
    {
        double h, b;
        Triangle t = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height of the traingle: ");
        h = sc.nextDouble();
        System.out.println("Enter Breadth of the traingle: ");
        b = sc.nextDouble();
        t.getData(h, b);
        System.out.println("Area of the Triangle is: " + t.showData());
        sc.close();
    }
}