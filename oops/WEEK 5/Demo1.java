//5. Write Java program for the following 
//a. Example for this operator and the use of this keyword.
class ThisOp
{
    ThisOp(int x, int y, int z)
    {
        this(x, y);
        System.out.println("Value of z: "+z);
    }
    ThisOp(int x, int y)
    {
        this(x);
        System.out.println("Value of y: "+y);
    }
    ThisOp(int x)
    {
        System.out.println("Value of z: "+x);
    }
}
class Demo1
{
    public static void main(String[] args)
    {
        ThisOp t = new ThisOp(10, 20, 30);
    }
}