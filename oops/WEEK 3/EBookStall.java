// /*5. Implement the following case study using OOP concepts in Java.
// E-Book stall :
// Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
// Every Customer is having properties as : Customer_Id, Customer_Name,
// Customer_Address and he can buy Books from E-Book stall.
// Write a Program which will display the text book name and the remaining count of text
// books when a customer buys a text book*/

import java.util.*;

class Book {
    String name, author;
    int count;

    public Book(String name, String author, int count) {
        this.name = name;
        this.author = author;
        this.count = count;
    }
    public void sell(int n) {
        if (n <= count) {
            count = count-n;
            System.out.println("Sold " + n + " copies of " + name + ". Remaining copies: " + count);
        } 
        else {
            System.out.println("Stock not available");
        }
    }
}

class Customer {
    String name, address;
    int cid;

    public Customer(String name, String address, int cid) {
        this.name = name;
        this.address = address;
        this.cid = cid;
    }
    public void buy(Book b, int n) {
        System.out.println(name+ " is buying a book");
        b.sell(n);
    }
}

class EBookStall {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int numBooks = in.nextInt();
        Book[] b = new Book[numBooks];
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter book details (name, author, count): ");
            b[i] = new Book(in.next(), in.next(), in.nextInt());
        }

        System.out.print("Enter number of customers: ");
        int numCustomers = in.nextInt();
        Customer[] c = new Customer[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter customer details (name, address, cid): ");
            c[i] = new Customer(in.next(), in.next(), in.nextInt());
        }

        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter book index and Number of copies for " + c[i].name + ": ");
            int bookIndex = in.nextInt();
            int numCopies = in.nextInt();
            
            if (bookIndex >= 1 && bookIndex <= numBooks) {
                c[i].buy(b[bookIndex - 1], numCopies);
            } else {
                System.out.println("Invalid book index.");
            }
        }
        in.close();
        // Book b1=new Book("OOP","Mounika",10); 
        // customer c1=new customer("CSE","rgukt_basar",10); 
        // c1.buy(b1,2); 
        // Book b2=new Book("SL","Radhika",20); 
        // customer c2=new customer("CSE","rgukt_basar",20); 
        // c2.buy(b2,10); 
    }
}
