//2. Write an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle and uses a method circlePerimeter to calculate the perimeter of the circle

import java.util.*;
class Circle
{
    double r;
    double Area()
    {
        return (3.14)*r*r;
    }
    double Parameter()
    {
        return 2*(3.14)*r;
    }
}
class Circleobj
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter the radius: ");
        double Radius = in.nextDouble();
        c.r = Radius;
        System.out.println("Circle area: "+c.Area());
        System.out.println("Circle parameter: "+c.Parameter());

    }
}