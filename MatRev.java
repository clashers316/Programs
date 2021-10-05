import java.util.*;
public class MatRev
{
    int m, n;
    int arr[][];
    MatRev(int mm, int nn)
    {
        m=mm;
        n=nn;
        arr = new int [m][n];
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int mm = sc.nextInt();
        System.out.println("Enter no. of columns");
        int nn = sc.nextInt();

        MatRev obj = new MatRev(mm,nn);
        obj.fillarray();
        obj.revMat(obj);
        obj.show();
    }

    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    int reverse(int x)//450
    {
        int s=0,c=0;
        while(x!=0)
        { 
            c=x%10;
            s=s*10 + c;
            x=x/10;
        }
        return s;
    }

    void revMat( MatRev P)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = reverse(P.arr[i][j]);
            }
        }
    }

    void show( )
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}