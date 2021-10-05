import java.util.*;
public class Palindrome_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        String s = sc.next();
        int num = Integer.parseInt(s);
        int l = 0, c = 0;
        int i ;
        for( i =num+1;i<=2*num;i++)
        {
            int p =i;
            while(p!=0)
            {
                c=p%10;
                l = l*10+c;
                p= p/10;
            }

            if( l == i)
            {
                System.out.println(i);
                break;
            }      
            l=0;
        }
    }
}

