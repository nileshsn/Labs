/*3.Create an Interface payable with method getAmount().Calculate the amount 
to be and Employee by implementing Interface.paid to Invoice*/
import java.util.*;
interface Payable
{
    void getAmount(int m, int n);
}
class Calci implements Payable
{
    public void getAmount(int m, int n)
    {
        System.out.println("Amount paid to employee: "+(m*100));
        System.out.println("Invoice or Bill: "+((m*100)+n)); // invoice includes employee payment and extra charges
    }
}
class Interface
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int a = in.nextInt();
        System.out.println("Enter Extra charges: ");
        int b = in.nextInt();
        Payable pay = new Calci();
        pay.getAmount(a, b);
    }
}