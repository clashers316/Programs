import java.util.*;
public class Mixer
{
    int arr[];
    int n;
    public static void main(String args[])
    {
        
    }

    Mixer(int nn)
    {
        n=nn;
        arr = new int[n];
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in ascending order");
        for(int i =0 ;i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    Mixer mix(Mixer A)
    {
        Mixer B = new Mixer();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = (A.arr[i] + B.arr[i]);
        }
        
    }

    void display()
    {
    }
}
