import java.util.*;
public class LuckyNumber
{
    public static void main(String args[])
    {
        
    }
    
    void declare()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }        
    }

    int[] remove(int n, int arr[])
    {
        int size = arr.length/n+arr.length%n;
        int new_arr[] = new int[size];
        int counter = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(n>arr.length)
            {
                return arr;
            }
            if(i%n == 0)
            {
                continue;
            }
            else
            {
                new_arr[counter] = arr[i];
                counter++;
            }
        }
        return remove(n+1, new_arr);
    }
}
