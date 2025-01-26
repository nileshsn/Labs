//3. Write a JAVA program for the following 
//a. Call by value
class Value
{
    int num= 25;
    void change_num(int num)
    {
        num = num + 10; //changes will be done in local variable only
        System.out.println("num in local: "+num);
    }
    public static void main(String[] args)
    {
        Value val = new Value();
        System.out.println("num before change: "+val.num);
        val.change_num(10);
        System.out.println("num after change: "+val.num);
    }
}