//c. Example for static variables and methods
class Demo3
{
    static
    {
        System.out.println("Your are in Static");
    }
    static void display()
    {
        System.out.println("I am Static method");
    }
    static int a = 5;
    public static void main(String[] args)
    {
        System.out.println(Demo3.a);
        Demo3.display();
    }
}