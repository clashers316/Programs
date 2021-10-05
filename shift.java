import java.util.Scanner;
class shift
{
    int arr[][];
    int n;
    int m;
    shift(int mm,int nn)
    {
        n=nn;m=mm;
        arr = new int [m][n];
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns for a square matrix");
        int mm=sc.nextInt();
        int nn= sc.nextInt();
        shift p = new shift(mm,nn);
        p.input();
        p.cyclic(p);
        p.cyclic2(p);
        p.display();
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    void cyclic(shift p)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to shift of rows?");
        int t = sc.nextInt();
        int temp=0;
        while(t>0)
        {
            for(int i=0;i<m-1;i++)
            {
                for(int j=0;j<n;j++)//1 2 3
                {                   //4 5 6
                                    //7 8 9
                    temp=p.arr[i][j];
                    p.arr[i][j]=p.arr[i+1][j];
                    p.arr[i+1][j]=temp;
                }
            }
            t--;
        }
    }

    void cyclic2(shift p)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to shift of columns ?");
        int t = sc.nextInt();
        int temp=0;
        while(t>0)
        {
            for(int j = 0;j<n;j++)
            {
                temp = p.arr[j][0];
                for(int i = 0;i<m-1;i++)
                {
                    p.arr[j][i] = p.arr[j][i+1];
                }
                p.arr[j][m-1] = temp;
            }
            t--;
        }
    }

    void display()
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