import java.util.*;
public class ReduceTo1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coins = 0;
        if(n!=1)
        {
            while(n%3 == 0)
            {
                if(n%6==0)
                {
                    n = n/6;
                    coins++;
                    if(n==1)
                    {
                        System.out.println(coins);
                        break;
                    }
                }
                else
                {
                    coins++;
                    n = n*2;
                }
            }
            
        }
        else
        {
            System.out.println("0");
        }

        if(n%3 != 0&&n!=1)
        {
            System.out.println("-1");
        }
    }
}