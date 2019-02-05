import java.util.Scanner;
import java.lang.Math;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner a= new Scanner(System.in);
        char ch;
        float r, area;
        do{
            System.out.print("Enter the Radius: ");
            r = a.nextFloat(); 
            area = (float) (3.142857142857f * Math.pow(r, 2));
            System.out.print("\nArea of circle is : " + area);
            System.out.println("\nPress 'y' or 'Y' to run the program again: ");
            ch = a.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        a.close();
    }
}
