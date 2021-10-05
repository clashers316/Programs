import java.util.Scanner;
public class whilefactorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int result = 1;
        int n = sc.nextInt();
        while(n>0)
        {
        result*=n;
        n--;
        
        }
        System.out.println(result);
        
    }
}
        