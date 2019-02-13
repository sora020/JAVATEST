public class StarPattern2
{
    public static void main(String args[])
    {
        int row = Integer.parseInt(args[0]);
        for(int i = 1; i <= row; i++)
        {
            int n = 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
