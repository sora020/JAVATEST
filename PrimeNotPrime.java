import java.util.Scanner;
public class PrimeNotPrime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        int i, j, l, u, prime = 1;
        do{
            System.out.println("Enter the Lower Range: ");
            l = sc.nextInt();
            System.out.println("Enter the Upper Range: ");
            u = sc.nextInt();
            System.out.println("\n");
            for(i = l+1; i <= u; i++)
            {
                if(i==1)
                {
                    System.out.println(i + " is neither Prime nor Composite Number");
                }
                for(j = 2; j <= i/2; j++)
                {
                    if(i % j == 0)
                    {
                        prime = 0;
                        break;
                    }
                    else
                        prime = 1;   
                }
                if(prime == 1)
                {
                    System.out.println(i + " is a Prime Number");
                }
                else   
                {
                    System.out.println(i + " is Not a Prime Number");
                }
            }
            System.out.println("Press 'y' or 'Y' to run the program again: ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}