public class Subjects {
    public static void main(String args[]) {
        float sum = 0f, avg = 1.0f;
        int n = Integer.parseInt(args[0]);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            sum = sum + a[i];
        }
        avg = sum / n;
        System.out.println("\nThe Total marks is: " + sum + " out of " + n * 100);
        System.out.println("The Average is: " + avg + "%");
        System.out.print("The Grade is: ");
        if (avg > 90) {
            System.out.println("O\n");
        } else if (avg > 80) {
            System.out.println("E\n");
        } else if (avg > 70) {
            System.out.println("A\n");
        } else if (avg > 60) {
            System.out.println("B\n");
        } else if (avg > 50) {
            System.out.println("C\n");
        } else if (avg > 40) {
            System.out.println("D\n");
        } else
            System.out.println("F\n");
    }
}