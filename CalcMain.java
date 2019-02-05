import java.util.Scanner;
import java.lang.Math;
public class CalcMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a, b;
        char oper, ch;
        do{
            System.out.print("1. Addition  ::  '+'\n" + 
                            "2. Substraction  ::  '-'\n" + 
                            "3. Multiplication  ::  'x'\n" +
                            "4. Division  :: '/'\n" +
                            "5. Square  ::  '^'\n" +
                            "6. n Power of a Number  ::  'p'" +  
                            "7. Log10  ::  'l'\n" + 
                            "8. Natural Logarithm  ::  'n'\n" +
                            "9. Exponent 'exp'  ::  'e'\n" +
                            "10. sin()  ::  's'\n" +
                            "11. cos()  ::  'c'\n" +
                            "12. tan()  ::  't'\n"
                            );
            System.out.println("Enter Operator: ");
            oper = sc.next().charAt(0);
            if(oper == '^' || oper == 'l' || oper == 'n' || oper == 'e' || oper == 's' || oper == 'c' || oper == 't')
            {
                System.out.println("Enter a Number: ");
                a = sc.nextFloat();
                calculator c2 = new calculator(a, oper);
                System.out.println("Result: " + c2.result());
                System.out.println("Enter Y to run the program again or any other key to exit");
                ch = sc.next().charAt(0);
            }
            else{
                System.out.println("Enter First Number: ");
                a = sc.nextFloat();
                System.out.println("Enter Second Number: ");
                b = sc.nextFloat();
                calculator c1 = new calculator(a, oper, b);
                System.out.println("Result: " + c1.result());
                System.out.println("Enter Y to run the program again or any other key to exit");
                ch = sc.next().charAt(0);
            }
        }while(ch == 'y' || ch== 'Y');
        sc.close();
    }
}

class calculator
{
    private
        float a, b, res;
        char oper;
    public calculator(float x, char oper, float y)
    {
        a = x;
        b = y;
        this.oper = oper;
    }
    public calculator(float x, char oper)
    {
        a = x;
        this.oper = oper;
    }
    float result()
    {   
        calculator calculator = this;
		if(oper == '+')
        {
            res = calculator.add();
        }
        else if(oper == '-')
        {
            res = calculator.sub();
        }
        else if(oper == 'x')
        {
            res = calculator.multiply();
        }
        else if(oper == '/')
        {
            if(b != 0)
            {
                res = calculator.multiply();
            }
            else
            {    
                System.out.println("Error Overload");
            }
        }
        else if(oper == '^')
        {
            res = calculator.square();
        }
        else if(oper == 'p')
        {
            res = calculator.power();
        }
        else if(oper == 'l')
        {
            res = calculator.log10();
        }
        else if(oper == 'n')
        {
            res = calculator.log();
        }
        else if(oper == 'e')
        {
            res = calculator.exp();
        }
        else if(oper == 's')
        {
            res = calculator.sin();
        }
        else if(oper == 'c')
        {
            res = calculator.cos();
        }
        else if(oper == 't')
        {
            res = calculator.tan();
        }
        else
            System.out.println("Not a valid Operator");
        return res;
    }
    float add()
    {
        return a + b;
    }
    float sub()
    {
        return a - b;
    }
    float multiply()
    {
        return a * b;
    }
    float divide()
    {
        return a + b;
    }
    float square()
    {
        float square = (float) Math.pow(a, 2);
        return square;
    }
    float power()
    {
        float power = (float) Math.pow(a, b);
        return power;
    }
    float log10()
    {
        float log10 = (float)Math.log10(a);
        return log10;
    }
    float log()
    {
        float log = (float)Math.log(a);
        return log;
    }
    float exp()
    {
        float exp = (float)Math.exp(a);
        return exp;
    }
    float sin()
    {
        float sin = (float)Math.sin(a);
        return sin;
    }
    float cos()
    {
        float cos = (float)Math.cos(a);
        return cos;
    }
    float tan()
    {
        float tan = (float)Math.tan(a);
        return tan;
    }
}