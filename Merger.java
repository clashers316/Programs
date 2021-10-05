import java.util.*;
public class Merger
{
    long n1, n2;
    long mergNum;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Merger obj = new Merger();
        obj.readNum();
        obj.joinNum();
        obj.show();
    }
    
    Merger()
    {
        n1 = 0;
        n2 = 0;
        mergNum = 0;
    }
    
    void readNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the First Number");
        n1 = sc.nextLong();
        System.out.println("Enter the value for the Second Number");
        n2 = sc.nextLong();
    }
    
    void joinNum()
    {
        String s1 = Long.toString(n1);
        String s2 = Long.toString(n2);
        String s3 = s1+s2;
        mergNum = Long.parseLong(s3);       
    }
    
    void show()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number is: " + n1);
        System.out.println("Second Number is: " + n2);
        System.out.println("Merged Number is: " + mergNum);
    }
}