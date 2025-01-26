/*2. Write a Java program that prints all real and imaginary solutions to the quadratic
equation ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula */

import java.util.Scanner;
class Roots {
    int a, b, c;

    public void findRoots(int a, int b, int c) {
        int d = (b * b) - 4 * a * c;
        double sqrtD = Math.sqrt(d);

        if (d > 0) {
            System.out.println("ROOT 1: " + (-b + sqrtD) / (2 * a));
            System.out.println("ROOT 2: " + (-b - sqrtD) / (2 * a));
        } else if (d == 0) {
            System.out.println("REAL AND IDENTICAL ROOTS: " + (-b) / (2 * a));
        } else {
            System.out.println("IMAGINARY ROOTS");
        }
    }
}
class Quad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roots root = new Roots();

        System.out.println("Enter coefficients a, b, c: ");
        root.a = sc.nextInt();
        root.b = sc.nextInt();
        root.c = sc.nextInt();

        root.findRoots(root.a, root.b, root.c);
        sc.close();
    }
}























