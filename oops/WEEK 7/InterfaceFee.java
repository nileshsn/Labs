/*6. Create an Interface StudentFee with method getAmount() ,getFirstName() 
,getLastName(), getAddress(), getContact(). Calculate the amount paid by the 
Hostler and NonHostler student by implementing interface Student Fee*/

interface StudentFee {
    void getAmount(int Fee);

    void getFirstName(String fName);

    void getLastName(String lName);

    void getAddress(String address);

    void getContact(int contact);
}

class Hostler implements StudentFee {
    final int Hstl_Fee = 5000; // Fixed hostel fee for all hostlers

    public void getAmount(int Fee) {
        int totalFee = Fee + Hstl_Fee;
        System.out.println("Fee paid by hostler: " + totalFee);
    }

    public void getFirstName(String fName) {
        System.out.println("First name of the student: " + fName);
    }

    public void getLastName(String lName) {
        System.out.println("Last name of the student: " + lName);
    }

    public void getAddress(String address) {
        System.out.println("Address of the student: " + address);
    }

    public void getContact(int contact) {
        System.out.println("Contact number of the student: " + contact);
    }
}

class NonHostler implements StudentFee {
    public void getAmount(int Fee) {
        System.out.println("Fee paid by non-hostler: " + Fee);
    }

    public void getFirstName(String fName) {
        System.out.println("First name of the student: " + fName);
    }

    public void getLastName(String lName) {
        System.out.println("Last name of the student: " + lName);
    }

    public void getAddress(String address) {
        System.out.println("Address of the student: " + address);
    }

    public void getContact(int contact) {
        System.out.println("Contact number of the student: " + contact);
    }
}

class InterfaceFee {
    public static void main(String args[]) {
        StudentFee h = new Hostler();
        h.getAmount(25000);
        h.getFirstName("Enugandhula");
        h.getLastName("Nilesh");
        h.getAddress("Penchikalphad, Nirmal, Telangana");
        h.getContact(504109);

        System.out.println();

        StudentFee nonH = new NonHostler();
        nonH.getAmount(20000);
        nonH.getFirstName("Gagerla");
        nonH.getLastName("Revanth");
        nonH.getAddress("Priyanagar, Nirmal, Telangana");
        nonH.getContact(504105);
    }
}





































// import java.util.Scanner;

// interface StudentFee {
//     int getAmount();

//     String getFirstName();

//     String getLastName();

//     String getAddress();

//     String getContact();
// }

// class Hostler implements StudentFee {
//     private String firstName;
//     private String lastName;
//     private String address;
//     private String contact;

//     public Hostler(String firstName, String lastName, String address, String contact) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.address = address;
//         this.contact = contact;
//     }

//     public int getAmount() {
//         // Implement the logic for calculating fee for Hostler
//         // For example:
//         return 5000; // Dummy amount, replace with your actual logic
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public String getContact() {
//         return contact;
//     }
// }

// class NonHostler implements StudentFee {
//     private String firstName;
//     private String lastName;
//     private String address;
//     private String contact;

//     public NonHostler(String firstName, String lastName, String address, String contact) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.address = address;
//         this.contact = contact;
//     }

//     public int getAmount() {
//         // Implement the logic for calculating fee for Non-Hostler
//         // For example:
//         return 3000; // Dummy amount, replace with your actual logic
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public String getContact() {
//         return contact;
//     }
// }

// public class InterfaceFee {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Input details for Hostler
//         System.out.println("Enter Hostler's First Name:");
//         String hFirstName = sc.next();
//         System.out.println("Enter Hostler's Last Name:");
//         String hLastName = sc.next();
//         System.out.println("Enter Hostler's Address:");
//         String hAddress = sc.next();
//         System.out.println("Enter Hostler's Contact:");
//         String hContact = sc.next();

//         // Input details for Non-Hostler
//         System.out.println("Enter Non-Hostler's First Name:");
//         String nhFirstName = sc.next();
//         System.out.println("Enter Non-Hostler's Last Name:");
//         String nhLastName = sc.next();
//         System.out.println("Enter Non-Hostler's Address:");
//         String nhAddress = sc.next();
//         System.out.println("Enter Non-Hostler's Contact:");
//         String nhContact = sc.next();

//         // Creating Hostler and Non-Hostler objects
//         StudentFee hostler = new Hostler(hFirstName, hLastName, hAddress, hContact);
//         StudentFee nonHostler = new NonHostler(nhFirstName, nhLastName, nhAddress, nhContact);

//         // Displaying details and fee for Hostler
//         System.out.println("\nHostler Details:");
//         displayDetailsAndFee(hostler);

//         // Displaying details and fee for Non-Hostler
//         System.out.println("\nNon-Hostler Details:");
//         displayDetailsAndFee(nonHostler);
//     }

//     private static void displayDetailsAndFee(StudentFee student) {
//         System.out.println("First Name: " + student.getFirstName());
//         System.out.println("Last Name: " + student.getLastName());
//         System.out.println("Address: " + student.getAddress());
//         System.out.println("Contact: " + student.getContact());
//         System.out.println("Amount Paid: " + student.getAmount());
//     }
// }
