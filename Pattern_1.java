import java.util.Scanner;
public class Pattern_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i , n;
        n = sc.nextInt();
        for(i=1; i <= n; i++)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int k=n-1; k>0; k--)
        {
            for(int l =1;l<=k; l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}

