public class StarPattern3
{
    public static void main(String args[])
    {
        int row = Integer.parseInt(args[0]);
        for(int i = row; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
