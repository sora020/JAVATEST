//Greatest of three numbers given as Command Line Argument
public class Greatest {
    public static void main(String args[]) {
        int a[] = new int[3];
        // array input
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        // array operation
        int max = a[0];
        for (int i = 0; i < 3; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The Greatest Number is: " + max);
    }
}