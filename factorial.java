import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        char ch;
        int n, factorial = 1;
        do{
            System.out.println("Enter a number to find it's factorial");
            n = sc.nextInt();
            for(int x = n; x >= 1; x--)
            {
                factorial = factorial * x;
            }
            System.out.println("The Factorial of the number is: " + factorial); 
            System.out.println("Press 'y' or 'Y' to run the program again: ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}