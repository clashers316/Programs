import java.util.*;
public class Rev_String
{
    void rev(String s, int l)
    {
        if(l<s.length())
        {
            char ch = s.charAt(l);
            rev(s, ++l);
            System.out.println(ch);
        }
    }
}
            