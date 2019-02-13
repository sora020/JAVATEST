class Fact
{  
    static int factorial(int n)
    {
        int res = 1; 
        if(n == 1)
            return 1;
        res = factorial(n-1) * n;
        return res;
    }

}
public class FactorialMain
{
    public static void main(String args[])
    {
        int  n = Integer.parseInt(args[0]);
        System.out.println("The factorial of the given Number is: " + Fact.factorial(n));
    }
}   
 