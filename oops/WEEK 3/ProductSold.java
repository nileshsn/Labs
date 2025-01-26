/*2.A mail-order house sells five products whose retail prices are as follows : Product
1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
and Product 5 : Rs. 40.49 . Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an application that reads a series of pairs of
numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product.
it should calculate and display the total retail value of all products sold.*/

import java.util.*;
class Product
{
    int proId;
    String proName;
    double proPrice;

    Product (int pro_id, String pro_name, double pro_price)
    {
        proId = pro_id;
        proName = pro_name;
        proPrice = pro_price;
    }
}
class ProductSold
{
    public static void main(String[] args)
    {
        Product pro1 = new Product(1, "Product 1", 99.90);
        Product pro2 = new Product(2, "Product 2", 20.20);
        Product pro3 = new Product(3, "Product 3", 6.87);
        Product pro4 = new Product(4, "Product 4", 45.50);
        Product pro5 = new Product(5, "Product 5", 40.49);

        double totalValue = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of pairs: ");
        int pairs = in.nextInt();
        
        for (int i=0; i<pairs; i++)
        {
            System.out.println("Enter Product Id: ");
            int proId = in.nextInt();
            System.out.println("Enter Qty Sold: ");
            int qtySold = in.nextInt();

            switch (proId)
            {
                case 1:
                totalValue += pro1.proPrice*qtySold;
                break;
                case 2:
                totalValue += pro2.proPrice*qtySold;
                break;
                case 3:
                totalValue += pro3.proPrice*qtySold;
                break;
                case 4:
                totalValue += pro4.proPrice*qtySold;
                break;
                case 5:
                totalValue += pro5.proPrice*qtySold;
                break;
                default:
                System.out.println("Invalid product Id: "+proId);
            }
        }
        System.out.println("Total Retail Value of all products sold: Rs. "+totalValue);
    }
}




































// import java.util.*;

// class Product
// {
//     int proId;
//     String proName;
//     double proPrice;

//     Product(int pro_id, String pro_name, double pro_price)
//     {
//         proId = pro_id;
//         proName = pro_name;
//         proPrice = pro_price;
//     }
// }
// class ProductSold
// {
//     public static void main(String[] args)
//     {
//         Product pro1 = new Product(1, "Product1", 99.90);
//         Product pro2 = new Product(2, "Product2", 20.20);
//         Product pro3 = new Product(3, "Product3", 6.87);
//         Product pro4 = new Product(4, "Product4", 45.50);
//         Product pro5 = new Product(5, "Product5", 40.49);

//         double totalValue = 0;
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the pairs: ");
//         int pairs = in.nextInt();
//         for (int i=0; i<pairs; i++)
//         {
//             System.out.println("Enter the Product Id: ");
//             int proId = in.nextInt();
//             System.out.println("Enter the Product Qty: ");
//             int proQty = in.nextInt();

//             switch(proId)
//             {
//                 case 1:
//                     totalValue+=pro1.proPrice*proQty;
//                     break;
//                 case 2:
//                     totalValue+=pro2.proPrice*proQty;
//                     break;
//                 case 3:
//                     totalValue+=pro3.proPrice*proQty;
//                     break;
//                 case 4:
//                     totalValue+=pro4.proPrice*proQty;
//                     break;
//                 case 5:
//                     totalValue+=pro5.proPrice*proQty;
//                     break;
//                 default:
//                     System.out.println("Invalid product: "+proId);
                
//             }
//         }
//         System.out.println("Total Retail Value of all products sold: Rs. "+totalValue);
//     }
// }
