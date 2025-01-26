/*2. Create an abstract class Employee with methods getAmount() which displays 
the amount paid to employee. Reuse this class to calculate the amount to be paid 
to WeeklyEmployeed and HourlyEmployee according to no. of hours and total 
hours for HourlyEmployee and no. of weeks and total weeks for 
WeeklyEmployee. */
import java.util.*;
abstract class Employ
{
    abstract void getAmount(int m, int Wage);
}
class hourlyEmp extends Employ
{
    public void getAmount(int m, int Wage)
    {
        System.out.println("Amount paid to hourly employee: "+(m*Wage));
    }
}
class weeklyEmp extends Employ
{
    public void getAmount(int m, int Wage)
    {
        System.out.println("Amount paid to weekly employee: "+(m*Wage));
    }
}
class Abstract1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of hours: ");
        int a = in.nextInt();
        System.out.println("Enter wage per hour: ");
        int b = in.nextInt();
        System.out.println("Enter no of weeks: ");
        int c = in.nextInt();
        System.out.println("Enter wage per week: ");
        int d = in.nextInt();
        Employ emp1 = new hourlyEmp();
        Employ emp2 = new weeklyEmp();
        emp1.getAmount(a, b);
        emp2.getAmount(c, d); 
    }
}