//3. Write a Java program to implement calculator operations

import java.util.Scanner;
import java.lang.Math;

class Calci {
    double num1, num2;
    double result;
    double add(double num1, double num2) {
        result = num1 + num2;
        return result;
    }
    double sub(double num1, double num2) {
        result = num1 - num2;
        return result;
    }
    double multi(double num1, double num2) {
        result = num1 * num2;
        return result;
    }
    double divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
            return result;
        } 
        else {
            System.out.println("Error");
            return Double.NaN;
        }
    }
}
public class Calciobj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calci calci = new Calci();

        System.out.println("Simple Calculator");
        System.out.print("Enter first & second number: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Enter the Operator: ");
        char operator = sc.next().charAt(0);

        double result = 0;
    
        switch (operator) {
            case '+':
                result = calci.add(num1, num2);
                break;
            case '-':
                result = calci.sub(num1, num2);
                break;
            case '*':
                result = calci.multi(num1, num2);
                break;
            case '/':
                result = calci.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
