import java.util.Scanner;
public class switchcase
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter two numbers");
       double d1 = sc.nextDouble();
       double d2 = sc.nextDouble();
       System.out.println("enter +,-,*,/");
       char ch=sc.next().charAt(0);
       double result = 0.0;
       switch(ch)
       {
           case '+':
           result=d1+d2;
           break;
           case '-':
           result=d1-d2;
           break;
           case '*':
           result=d1*d2;
           break;
           case '/':
           result=d1/d2;
           break;
           default:
           System.out.println("system failure ");
           System.out.println("self destruction in ");
           System.out.println("10");
           System.out.println("9 ");
           System.out.println("8 ");
           System.out.println("7 ");
           System.out.println("6 ");
           System.out.println("just kidding ");
        }        
       System.out.println(+result);
    }
}
           
           