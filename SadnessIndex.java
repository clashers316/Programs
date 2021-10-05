import java.util.*;
public class SadnessIndex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C[] = new int[N];
        String s1 = sc.next();
        String s2 = sc.nextLine();
        String s = s1 + s2;
        s=s+' ';
        String w ="";
        int sadIndex = 0;
        for(int i = 0, j = 0; i<N;j++)
        {
            char ch = s.charAt(j);
            if(ch==' ')
            {
                C[i]=Integer.parseInt(w);
                w="";
                i++;
            }
            else
            {
                w=w+ch;
            }
        }
        int counter =0;
        for(int i = 1; i<N;i++)
        {
            for(int j = 0 ;j<i;j++)
            {
                if(C[i] < C[j])
                {
                    sadIndex++;
                }
            }
        }
        System.out.println(sadIndex);
    }
}