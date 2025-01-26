//1. Write a Java program to find Area and Circle of different shapes using polymorphism concept
import java.util.*;
class Shape
{
    void area(double x)
    {
        System.out.println("The area of the Square: "+x*x+"sq.units");
    }
    void area(double x, double y)
    {
        System.out.println("The area of the Rectangle: "+x*y+"sq.units");
    }
    void Area(double x)
    {
        double z = 3.14*x*x;
        System.out.println("The area of the Circle: "+z+"sq.units");
    }
    void Area(int x, int y)
    {
        double r = (x*y)/2;
        System.out.println("The area of the Triangle: "+r+"sq.units");
    }
}
class CalShape
{
    public static void main(String[] args) 
    {
        Shape S = new Shape();
        S.area(10);
        S.area(10, 20);
        S.Area(5);
        S.Area(2, 5);
    }
}