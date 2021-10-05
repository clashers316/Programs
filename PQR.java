import java.util.*;
public class PQR
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int P[] = new int[n];
        int Q[] = new int[m];
        int R[] = new int[n+m];
        int k = n+m;
        System.out.println("Enter values for P array");
        for(int i = 0, l = 0;i<n;i++,l++)
        {
            P[i] = sc.nextInt();
            R[l] = P[i];
        }
        System.out.println("Enter values for Q array");
        for(int j = 0, l = n;j<m;j++,l++)
        {
            Q[j] = sc.nextInt();
            R[l] = Q[j];
        }
        int counter=0;
        for(int i =0;i<k;i++)
        {
            counter=0;
            for(int j=0;j<=i;j++)
            {
                if(R[i]==R[j])
                {
                    counter++;
                }
            }
            if(counter==1)
            {
                System.out.println(R[i]);
            }
        }
    }
}

