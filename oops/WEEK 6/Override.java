//2. Write a Java program which can give example of Method overloading and overriding
//overriding
class Overriding
{
    void R1()
    {
        System.out.println("you must study MBA");
    }
    void R2()
    {
        System.out.println("MBA is better to you");
    }
}
class Override extends Overriding 
{
    void R1()
    {
        System.out.println("i will studty Btech");
    }
    void R2()
    {
        System.out.println("Btech also better for me");
    }
    public static void main(String[] args)
    {
        Override O = new Override();
        O.R1();
        O.R2();
    }
}