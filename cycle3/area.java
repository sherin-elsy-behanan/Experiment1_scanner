import java.util.*;
public class areas
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle /2.Rectangle / 3.Triangle");
        System.out.println("Select an option(1/2/3) :");
        int a = sc.nextInt();
        areas obj = new areas();
        if (a==1)
        {
            System.out.println("Enter the radius :");
            int r =sc.nextInt();
            obj.area(r);
        }
        else if (a==2)
        {
            System.out.println("Enter the length :");
            int l =sc.nextInt();
            System.out.println("Enter the breadth :");
            int b =sc.nextInt();
            obj.area(l,b);
        }
        else if (a==3) 
        {
            System.out.println("Enter the base :");
            double x =sc.nextDouble();
            System.out.println("Enter the height :");
            double y =sc.nextDouble();
            obj.area(x,y);
        }
        else 
            System.out.println("Error");
        sc.close();
    }
    void area(int a)
    {
        System.out.println("Area of circle is:"+(3.14*a*a));
    }
    void area(int n,int m)
    {
        System.out.println("Area of Rectangle is:"+(n*m));
    }
    void area(double c,double d)
    {
        System.out.println("Area of triangle is:"+(0.5*c*d));
    }
}
