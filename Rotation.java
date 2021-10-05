import java.util.*;
public class Rotation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int [m][n];
        System.out.println("Enter elements");
        for(int i = 0 ; i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //new i = old j, new j = |old i-m-1|//should convert - to +
                      // old i <m-1
                      // old i = -1*(old i -m-1)
           for(int i = 0 ; i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                int b=j;
            }
        }
            for(int i = 0 ; i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                int a;
                if(i<m-1)
                a= -1*(i-m-1);
                else
                a=i-(m-1);
            }
        }       
    }
}
        