/*1. Create an abstract class Shape which calculate the area and volume of 2-d and
3-d shapes with methods getArea() and getVolume(). Reuse this class to calculate
the area and volume of square,circle ,cube and sphere.*/
import java.util.*;
abstract class Shape
{
    abstract void getArea(int r, int a);
    abstract void getVolume(int r, int a);
}
class Calci extends Shape
{
    public void getArea(int r, int a)
    {
        System.out.println("Area of the Circle: "+(3.14*r*r));
        System.out.println("Surface area of the Cube: "+(6*a*a));
        System.out.println("Surface area of the Sphere: "+(4*3.14*r*r));
    }
    public void getVolume(int r, int a)
    {
        System.out.println("Volume of the Cube: "+(a*a*a));
        System.out.println("Volume of the Sphere: "+((4/3)*3.14*r*r*r));
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of r: ");
        int R = in.nextInt();
        System.out.println("Enter value of a: ");
        int A = in.nextInt();
        Shape sh = new Calci();
        sh.getArea(R, A);
        sh.getVolume(R, A);
    }
}