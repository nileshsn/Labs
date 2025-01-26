/*4. Create a class Account with an instance variable balance (double). It shouldcontain a constructor 
that initializes the balance, ensure that the initial balance is greater than 0.0. Acct details : Acct_Name, Acct_acctno, Acct_Bal, 
Acct_Address. Create two methods namely credit and debit, getBalance. The Credit adds the amount (passed as parameter) 
to balance and does not return any data. Debit method withdraws money from an Account. GetBalance displays the 
amount. Ensure that the debit amount does not exceed the Account’s balance. In that case the balance should be 
left unchanged and the method should print a message indicating “Debit amount exceeded account balance”.*/
import java.util.*;
class Account
{
    String accName;
    int accNum;
    double amount, withdraw, deposit;
    Account(String acc_name, int acc_num, double a, double w, double d)
    {
        accName = acc_name;
        accNum = acc_num;
        amount = a;
        withdraw = w;
        deposit = d;
    }
    void debit(double w)
    {
        if (amount > w)
        {
            amount = (amount-w);
            System.out.println("Balance after withdrawal: "+withdraw+"is: "+amount);
            double CB = (amount - withdraw)+deposit;
            System.out.println("Current Balance: "+CB);
        }
        else
        {
            System.out.println("Insufficient Balance "+amount);
        }
    }
    void credit(double d)
    {
        amount = (amount+d);
        System.out.println("Account Name: "+accName);
        System.out.println("Account Number: "+accNum);
        System.out.println("Balance after deposit "+deposit+"is: "+amount);
    }
}
class Bank
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account Name: ");
        String name = in.nextLine();
        System.out.println("Enter Account Number: ");
        int num = in.nextInt();
        System.out.println("Enter Amount: ");
        double a = in.nextDouble();
        System.out.println("Enter Deposit Amount: ");
        double d = in.nextDouble();
        System.out.println("Enter Withdraw Amount: ");
        double w = in.nextDouble();
        System.out.println("Account Details: ");
        Account AC = new Account(name, num, a, w, d);
        AC.credit(d);
        AC.debit(w);
    }
}
