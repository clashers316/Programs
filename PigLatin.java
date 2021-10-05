import java.util.*;
public class PigLatin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word in lowercase");
        String s = sc.next();
        int l = s.length();
        String s2 = "";
        String s3 = "";
        char A[] = s.toCharArray();
        for(int j = 0 ; j<l; j++)
        {
            if(A[j] == 'a' || A[j] == 'e' || A[j] == 'i' || A[j] == 'o' || A[j] == 'u')
            {
                break;
            }
            else
            {
                s2 = s.substring(0, j+1);
                s3 = s.substring(j+1,l);
            }
        }
        System.out.println(s3+s2+"ay");
    }
}
