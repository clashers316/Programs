import java.util.*;
public class SelectionSort
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]= {5,3,8,4,9,2,1,12,90,15};
        int i, j, small, pos, tmp;
        for(i=0; i<10;i++)
        {
            small= A[i];
            pos= i ;
            for(j=i+1;j<10;j++)
            {
                if(A[j]<small)
                {
                    small=A[j];
                    pos = j ; 
                }
            }
            tmp=A[i];
            A[i]=A[pos];
            A[pos] = tmp;
        }
        for( i=0;i<10;i++)
        {
            System.out.println(A[i]);
        }
    }
}
        

        