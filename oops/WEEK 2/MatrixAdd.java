import java.util.Scanner;

class Matrix {
    void matrix_add() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of m1: ");
        int m1 = in.nextInt();
        System.out.print("Enter size of n1: ");
        int n1 = in.nextInt();

        System.out.print("Enter size of m2: ");
        int m2 = in.nextInt();
        System.out.print("Enter size of n2: ");
        int n2 = in.nextInt();

        if (m1 != m2 || n1 != n2) {
            System.out.println("Matrices cannot be added.");
            return;
        }

        System.out.println("Enter elements for matrix A:");
        int a[][] = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("Enter element (" + (i + 1) + "," + (j + 1) + "): ");
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter elements for matrix B:");
        int b[][] = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Enter element (" + (i + 1) + "," + (j + 1) + "): ");
                b[i][j] = in.nextInt();
            }
        }

        int c[][] = new int[m1][n1];
        System.out.println("Matrix addition result:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("\t");
        }

        in.close();
        
    }
}

class MatrixAdd {
    public static void main(String[] args) {
        Matrix add = new Matrix();
        add.matrix_add();
    }
}





























/*class Matrix
{
    void matrix_add()
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int c[][] = new int[3][3];
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
class MatrixAdd
{
    public static void main(String[] args)
    {
        Matrix add = new Matrix();
        add.matrix_add();
    }
}*/