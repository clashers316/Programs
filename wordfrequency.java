import java.util.Scanner;
class wordfrequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        s=s+" ";
        int counter=0;
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(ch==' ')
            {
                counter++;
            }
        }
        String arr[]= new String[counter];
        for(int i=0;i<counter;i++)
        {
            arr[i]="";
        }

        for(int i=0,j=0;i<counter&&j<s.length();j++)
        {
            char ch =s.charAt(j);
            if(ch==' ')
            {
                i++;
            }
            else
            {
                arr[i]=arr[i]+ch;
            }
        }
        int c=0;
        int n=0;
        for(int i=0;i<counter;i++)//hello hello bh bh ths 
        {
            for(int j=i;j<counter;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    for(int k=0;k<i;k++)
                    {
                        if(arr[i].equals(arr[k]))
                        {
                            n++;
                            c=0;
                            break;
                        }
                    }
                    if(n==0)
                        c++;
                }
            }
            if(c>0)
            {
                System.out.println(arr[i]+" : "+c);
            }
            c=0;
            n=0;
        }
    }
}