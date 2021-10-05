import java.util.*;
public class Perimeter
{
    double a;
    double b;
    Perimeter(double length, double breadth)
    {
        a = length;
        b = breadth;
    }
    double Calculate()
    {
        return 2*(a+b);
    }
    void show()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Calculate());
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Perimeter obj = new Perimeter(length, breadth);
        obj.Calculate();
        obj.show();
    }
}
class Area extends Perimeter
{
    double h;
    double area;
    Area(double height, double length, double breadth)
    {
        super(length, breadth);
        h = height;        
    }
    void doarea()
    {
        area = super.Calculate();
    }
    void show()
    {
        super.show();
        System.out.println(area);
    } 
    public static void main(String args[])
    {
        super.();
        Area obj = new Area(height, length, breadth);
        obj.doarea();
        obj.show();
    }
}
    

        