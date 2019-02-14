class Calculation {
    private int a, b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add() {
        return (a + b);
    }

    int sub() {
        return (a - b);
    }
}

class MyCalculation extends Calculation {
    public MyCalculation(int a, int b, int c, int d) {
        super(a, b);
    }

    int Result() {
        return (add() * sub());
    }
}

public class AddSubMain {
    public static void main(String args[]) {
        MyCalculation mc = new MyCalculation(Integer.parseInt(args[0]), Integer.parseInt(args[1]),
                Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        System.out.println("The result is: " + mc.Result());
    }
}