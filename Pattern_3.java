import java.util.*;
public class Pattern_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int k = 1;
        for(int j =1;j<=n;j++)
        {
            for(int counter = 1;counter<=j;counter++)
            {
                System.out.print(k+" ");
                if(counter == j)
                {
                    System.out.println(" ");
                }
                k++;
                if(k > n)
                {
                    break;
                }
            }
            if(k>n)
            {
                break;
            }
        }
    }
}
