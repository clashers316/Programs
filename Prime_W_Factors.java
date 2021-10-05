import java.util.*;
public class Prime_W_Factors
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 1;i<=n;i++)
        {
            if(n%i == 0)
            {
                counter++;
            }
        }
        if(counter == 2)
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println( n+" is not a Prime number");
        }
        int arr[] = new int[counter];
        for(int i = 1,j=0;i<=n;i++)
        {
            if(n%i == 0)
            {
                arr[j]= i;
                j++;
            }
        }
        System.out.println("The number of factors of " + n + " is " + counter);
        System.out.print(" They are: ");
        for(int i = 0;i<counter;i++)
        {
            
            
                System.out.print( arr[i]+ " ");
            
        }
    }
}

