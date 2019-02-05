import java.util.Scanner;
class Calculate{
    private
        float length, breadth, height;
    public
        Calculate(float l)
        {
           length = breadth = height = l;
        }
    public
        Calculate(float l, float b, float h)
        {
            length = l;
            breadth = b;
            height = h;
        }
    float result()
    {
        return length*breadth*height;
    }
}

public class RectSquare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float l, b, h;
        char ch;
        do{
            System.out.print("Enter value of Length: ");
            l = sc.nextFloat();
            System.out.print("Enter value of Breadth: ");
            b = sc.nextFloat();
            System.out.print("Enter value of Height: ");
            h = sc.nextFloat();
            if(l==b && l==h){
                Calculate c1 = new Calculate(l);
                System.out.println("It is a Square and the Result is: " + c1.result());
            }
            else{
                Calculate c2 = new Calculate(l, b, h);
                System.out.println("It is a Rectangle and the result is: " + c2.result());
            }
            System.out.println("Enter 'Y' or 'y' to run the program again or Press any other key to exit: ");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');   
        sc.close();
    } 
}