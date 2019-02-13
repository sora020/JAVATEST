public class StarPattern5
{
    public static void main(String args[])
    {
        int row = Integer.parseInt(args[0]);
        for(int i = 1; i <= row; i++)
        {
            for(int k = 1; k <= row - i; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i1 = row - 1; i1 >= 1; i1--)
        {
            for(int k1 = row - i1; k1 >= 1; k1--)
            {
                System.out.print(" ");
            }
            for(int j1 = i1; j1 >= 1; j1--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
