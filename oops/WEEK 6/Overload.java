//Overloading
class Overloading
{
    void Rupees(int a, char b)
    {
        //ASCII value of 'k' is 107. So, (20 + 'k') is equivalent to (20 + 107), resulting in 127
        System.out.println("I have rupees: "+(a+b)); 
        System.out.println("I have rupees: "+a+b);
    }
    void Rupees(char b)
    {
        System.out.println("I have rupees of a: "+b);
    }
    void Rupees(int a)
    {
        System.out.println("I have rupees of b: "+a*a);
    }
}
class Overload
{
    public static void main(String[] args)
    {
        Overloading O = new Overloading();
        O.Rupees(20,'k');
        O.Rupees('k');
        O.Rupees(20);
    }
}