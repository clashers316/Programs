import java.util.*;
import java.io.*;
public class PrimeAdam
{
    int m, n;
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int mm = sc.nextInt();
        int nn = sc.nextInt();
        if(mm<nn)
        {
            PrimeAdam obj = new PrimeAdam(mm, nn);
            obj.isPrime(mm, nn);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }

    PrimeAdam(int mm, int nn)
    {
        m = mm;
        n = nn;
    }

    void isPrime(int l, int u)
    {
        int freq = 0;
        int counter = 0;
        boolean adam = false;
        int arr[] = new int[u-l];
        for(int i = l;i<=u;i++)
        {
            adam = false;
            for(int j = 2;j<i/2;j++)
            {
                if(i%j == 0)
                {
                    counter++;
                }
            }
            if(counter == 0)
            {
                adam = this.isAdam(i);
            }
            if(adam == true)
            {
                freq++;
                arr[freq - 1] = i;
            }
            counter = 0;
        }
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for(int i = 0;i<freq;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGRS: "+freq);
    }

    boolean isAdam(int n)
    {
        String s = Integer.toString(n);
        String rs = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            rs = rs+s.charAt(i);
        }
        int rn = Integer.parseInt(rs);
        String ss = Integer.toString((int)Math.pow(n,2));
        String srs = Integer.toString((int)Math.pow(rn,2));
        if(ss.length() == srs.length())
        {
            for(int i = 0;i<ss.length();i++)
            {
                if(ss.charAt(i) == srs.charAt(srs.length()-1-i))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
 