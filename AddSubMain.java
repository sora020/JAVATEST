class Calculation {
    private int a, b, c, d;

    public Calculation(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
	this.c = c;
	this.d = d;
    }

    public int add() {
        return (a + b);
    }

    public int sub() {
        return (c - d);
    }
}

class MyCalculation extends Calculation {
    public MyCalculation(int a, int b, int c, int d) {
        super(a, b, c, d);
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
