/*
   Question - Print the elements of a square array in spiral form i.e, clockwise.
   Input  - array size; array elements
*/
import java.util.*;
import java.io.*;
public class SpiralOutput
{
    public static void main(String args[])throws IOException 
    {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            int i = 0;
            int j = 0;
            int counter = 0;
            for(int k = 0;k<n;k++)
            {
                for(int l = 0;l<n;l++)
                {
                    arr[k][l] = sc.nextInt();
                }
            }
            while(counter<=(n/2))
            {
                for(j = 0+counter;j<=n-1-counter;j++)//left to right
                {
                    i = 0+counter;
                    System.out.print(arr[i][j]+" ");
                }
                for(i = 1+counter;i<=n-1-counter;i++)//top to bottom
                {
                    j = n-1-counter;
                    System.out.print(arr[i][j]+" ");
                }
                for(j = n-2-counter;j>=0+counter;j--)//right to left
                {
                    i = n-1-counter;
                    System.out.print(arr[i][j]+" ");
                }
                for(i = n-2-counter;i>0+counter;i--)//bottom to top
                {
                    j = 0+counter;
                    System.out.print(arr[i][j]+" ");
                }
                counter++;
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}