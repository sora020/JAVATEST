import java.util.Scanner;
public class SimpleInterest {
    public static

    void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        char ch;
        double p,r,t,si;
        do{
            System.out.print("Enter the Principal Amount: ");
            p=sc.nextDouble();
            System.out.print("\nEnter The rate of Interest: ");
            r=sc.nextDouble();
            System.out.print("\nEnter the Time Period: ");
            t=sc.nextDouble();
            si=(p*r*t)/100;
            System.out.println("\nThe Simple Interest is: " + si);
            System.out.println("Press 'y' or 'Y' to run the program again: ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}