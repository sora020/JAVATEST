//Temperature converter with inputs given as Command Line Argument
public class Temp {
    public static void main(String args[]) {
        float ans, v;
        char ch;
        ch = args[0].charAt(0);
        v = Float.parseFloat(args[1]);
        if (ch == 'f' || ch == 'F') {
            ans = (v - 32f) * 5 / 9;
            System.out.println("Celsius: " + ans);
        } else if (ch == 'c' || ch == 'C') {
            ans = v * 1.8f + 32f;
            System.out.println("Fahrenheit" + ans);
        } else
            System.out.println("Wrong Operator");
    }
}