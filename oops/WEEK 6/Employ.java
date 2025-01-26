// /*3. Write an application to create a super class Employee with information first 
// name & last name and methods getFirstName(), getLastName() derive the sub-classes ContractEmployee 
// and RegularEmployee with the information about department, designation & method displayFullName(), 
// getDepartment(), getDesig() to print the salary and to set department name & designation of the 
// corresponding sub-class objects respectively.*/

class emp {
    String first_name;
    String last_name;

    void getfirstname(String first) {
        first_name = first;
        System.out.println("First name is: " + first_name);
    }

    void getlastname(String last) {
        last_name = last;
        System.out.println("Last name is: " + last_name);
    }
}

class contractemp extends emp {
    String department;
    String designation;

    void displayfullname() {
        System.out.println("Fullname of contractemp is: " + first_name + " " + last_name);
    }

    void setDepartment(String dept) {
        department = dept;
        System.out.println("Department of contractemp is: " + dept);
    }

    void setDesignation(String desig) {
        designation = desig;
        System.out.println("Designation of contractemp is: " + desig);
    }
}

class regularemp extends emp {
    String department;
    String designation;

    void displayfullname() {
        System.out.println("Full name of regularemp is: " + first_name + " " + last_name);
    }

    void setDepartment(String dept) {
        department = dept;
        System.out.println("Department of regularemp is: " + dept);
    }

    void setDesignation(String desig) {
        designation = desig;
        System.out.println("Designation of regularemp is: " + desig);
    }
}

public class Employ {
    public static void main(String args[]) {
        contractemp c1 = new contractemp();
        c1.getfirstname("Enugandhula");
        c1.getlastname("Nilesh");
        c1.displayfullname();
        c1.setDepartment("Management");
        c1.setDesignation("Businessman");

        regularemp r1 = new regularemp();
        r1.getfirstname("Narwade");
        r1.getlastname("Dhananjay");
        r1.displayfullname();
        r1.setDepartment("Medicine");
        r1.setDesignation("Doctor");
    }
}
























// import java.util.Scanner;

// class emp {
//     String first_name;
//     String last_name;

//     void getfirstname() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter first name: ");
//         first_name = in.nextLine();
//         System.out.println("First name is: " + first_name);
//     }

//     void getlastname() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter last name: ");
//         last_name = in.nextLine();
//         System.out.println("Last name is: " + last_name);
//     }
// }

// class contractemp extends emp {
//     String department;
//     String designation;

//     void displayfullname() {
//         System.out.println("Fullname of contractemp is: " + first_name + " " + last_name);
//     }

//     void setDepartment() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter department for contractemp: ");
//         department = in.nextLine();
//         System.out.println("Department of contractemp is: " + department);
//     }

//     void setDesignation() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter designation for contractemp: ");
//         designation = in.nextLine();
//         System.out.println("Designation of contractemp is: " + designation);
//     }
// }

// class regularemp extends emp {
//     String department;
//     String designation;

//     void displayfullname() {
//         System.out.println("Full name of regularemp is: " + first_name + " " + last_name);
//     }

//     void setDepartment() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter department for regularemp: ");
//         department = in.nextLine();
//         System.out.println("Department of regularemp is: " + department);
//     }

//     void setDesignation() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter designation for regularemp: ");
//         designation = in.nextLine();
//         System.out.println("Designation of regularemp is: " + designation);
//     }
// }

// public class Employ {
//     public static void main(String args[]) {
//         contractemp c1 = new contractemp();
//         c1.getfirstname();
//         c1.getlastname();
//         c1.displayfullname();
//         c1.setDepartment();
//         c1.setDesignation();

//         regularemp r1 = new regularemp();
//         r1.getfirstname();
//         r1.getlastname();
//         r1.displayfullname();
//         r1.setDepartment();
//         r1.setDesignation();
//     }
// }
