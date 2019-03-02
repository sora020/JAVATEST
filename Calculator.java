//Calculator two numbers with it's operator given as Command Line Argument
public class Calculator {
    public static void main(String args[]) {
        double a, b;
        char op;
        a = Double.valueOf(args[0]);
        b = Double.valueOf(args[2]);
        op = args[1].charAt(0);
        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == 'x') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if(b != 0){
                System.out.println("Result: " + (a / b));
            }
            else
                System.out.println("!Overload");
        } else {
            System.out.println("Wrong Operator choose from '+, -, x, /'");
        }
    }
}
