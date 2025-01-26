/*1. Write a program to display details of the required employee based on his Id. 
The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation, Emp_salary, Emp_Address etc.,*/
import java.util.*;

class Employee 
{
    String id;
    String name;
    int age;
    int salary;
    String gender;
    String designation;
    String address;

    void display() 
    {
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nSalary: " + salary + "\nGender: " + gender + "\nAddress: " + address + "\nDesignation: " + designation);
    }
}
public class EmployeeManagement 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = in.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) 
        {
            emp[i] = new Employee();

            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            emp[i].name = in.next();

            System.out.print("ID: ");
            emp[i].id = in.next();

            System.out.print("Age: ");
            emp[i].age = in.nextInt();

            System.out.print("Salary: ");
            emp[i].salary = in.nextInt();

            System.out.print("Gender: ");
            emp[i].gender = in.next();

            System.out.print("Address: ");
            emp[i].address = in.next();

            System.out.print("Designation: ");
            emp[i].designation = in.next();
        }

        System.out.print("Enter the ID to search: ");
        String searchId = in.next();

        for (int i = 0; i < 3; i++) 
        {
            if (emp[i].id.equals(searchId)) 
            {
                emp[i].display();
                break;
            }
        }
        in.close();
    }
}
