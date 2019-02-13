public class StarPattern5
{
    public static void main(String args[])
    {
        int row = Integer.parseInt(args[0]);
        for(int i = 1; i <= row; i++)
        {
            for(int k = 1; k <= row - i; k++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*   ");
            }
            System.out.println();
        }
        for(int i = row - 1; i >= 1; i--)
        {
            for(int k = row - i; k >= 1; k--)
            {
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--)
            {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
