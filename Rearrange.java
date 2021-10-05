import java.util.*;
import java.io.*;
public class Rearrange
{
    String wrd;
    String newwrd;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Rearrange obj = new Rearrange();
        obj.readword();
        obj.freq_vow_con();
        obj.arrange();
        obj.display();
    }
    
    Rearrange()
    {
        wrd = "";
        newwrd = "";
    }
    
    void readword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word in UpperCase");
        wrd = sc.next();
    }
    
    void freq_vow_con()
    {
        int l = wrd.length();
        int countvow = 0;
        int countcons = 0;
        for(int i = 0;i<l;i++)
        {
            char ch = wrd.charAt(i);
            if(ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
            {
                countvow++;
            }
            else
            {
                countcons++;
            }
        }
        System.out.println("Number Of Vowels in the word = "+countvow);
        System.out.println("Number of Consonants in the word = "+countcons);
    }
    
    void arrange()
    {
        Scanner sc = new Scanner(System.in);
        int l = wrd.length();
        String vow = "";
        String cons = "";
        for(int i = 0;i<l;i++)
        {
            char ch = wrd.charAt(i);
            if(ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
            {
                vow = vow+ch;
            }
            else
            {
                cons = cons+ch;
            }
        }
        newwrd = vow+cons;
    }
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(wrd);
        System.out.println(newwrd);
    }
}
    
        