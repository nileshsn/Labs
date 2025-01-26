//b. Call by object
class Object 
{
    int num = 25;
    void change_num(Object obj)
    {
        num = num + 10; //changes will be done in the local variable only
        System.out.println("num in local: "+num);
    }
    public static void main(String[] args)
    {
        Object obj = new Object();
        System.out.println("num before change: "+obj.num);
        obj.change_num(obj); // passing object through called method
        System.out.println("num after change: "+obj.num);
    }
}