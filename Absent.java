import java.util.*;
public class Absent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N-1];
        String s1 = sc.next();
        String s2 = sc.nextLine();
        String s = s1 + s2;
        s = s + " ";
        String w ="";
        int l = s.length();
        char c[] = new char[s.length()];
        int R[] = new int[N];
        for(int i = 0;i<N;i++)
        {
            R[i] = 0;
        }
        for(int i = 0,j = 0 ;i<N-1 && j<l ;j++)
        {
            char ch = s.charAt(j);
            if(ch==' ')
            {
                int p=Integer.parseInt(w);
                R[p-1]=1;
                w="";
                i++;
            }
            else
            {
                w=w+ch;
            }
        }
        for(int i=0;i<N;i++)
        {
            if(R[i]==0)
            System.out.println(i+1);
        }       
    }
}
 