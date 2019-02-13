import java.lang.Math;
public class ArmMain{
    public static void main(String[] args) {
        int  number, temp, order = 0, remainder, value = 0;
        number = Integer.parseInt(args[0]);
        temp = number;
        while(temp != 0)
        {
            temp /= 10;
            order++;
        }
        System.out.println("The order is: " + order);
        temp = number;
        while(temp != 0)
        {
            remainder = temp % 10;
            temp /= 10;
            value = (int)(value + Math.pow(remainder, order));
        }
        if(value == number)
        {
            System.out.println(number + " is an Armstrong Number");
        }
        else
            System.out.println(number + " is not an Armstrong Number");
    }
}