import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        char choice, ch;
        int i, r;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Press 1 for side by side or Press 2 for up down\n or Press any other key to exit: ");
            choice = sc.next().charAt(0);
            System.out.println("\nEnter the Range: ");
            r = sc.nextInt();
            if (choice == '1') {
                System.out.println("Odd         Even");
                for (i = 1; i <= r; i++) {
                    System.out.print(i + "           ");
                    if (i % 2 == 0) {
                        System.out.print("\n");
                    }
                }
            } else if (choice == '2') {
                System.out.println("Even Number: ");
                for (i = 2; i <= r; i+=2) {
                    System.out.print(i + "\t");
                }
                System.out.println("\nOdd Number: ");
                for (i = 1; i <= r; i=i+2) {
                    System.out.print(i + "\t");
                }
            }
            System.out.println("Press 'y' or 'Y' to run the program again: ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');  
        sc.close();  
    }
}