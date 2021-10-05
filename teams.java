import java.util.*;
import java.io.*;
public class teams
{
    public static void main(String args[])throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextLine();
        }
        int max = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-1-i;j++)
            {
                if(arr[j+1].length()>arr[j].length())
                {
                    max = arr[j+1].length();
                }
                else
                {
                    max = arr[j].length();
                }
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<max;j++)
            {
                char ch = arr[i].charAt(j);
                if(isNullorE)
                {
                    continue;
                }
                else
                {
                    arr[i] = arr[i] + ' ';
                }
            }
        }
        int k = 0;
        while(k<n)
        {
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<max;j++)
                {
                    System.out.print(arr[i].charAt(j)+"\t\t");
                }
            }
            System.out.println();
        }
    }
}

