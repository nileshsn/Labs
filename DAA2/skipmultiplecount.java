// import java.util.Scanner;
// public class skipmultiplecount{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter two strings");
//     String s1=sc.next();
//     String s2=sc.next();
//     int m=s1.length();
//     int n=s2.length();
//     int flag=0;
//     for(int i=0;i<m;i++)
//     {
//       if(s1.charAt(i)==s2.charAt(0))
//       {
//         int count=0;
//         int a=0;
//         for(int j=0;j<n;j++)
//         {
//           if(s2.charAt(j)==s1.charAt(i+j+a)){
//             count++;
//           }
//           a+=(j+1);
//         }
//         if(count==n)
//         {
//           flag++;
          
//         }
//       }
//     }
//     System.out.println("count of substr in mainstr : "+flag);
    
    
    
//   }
// }





import java.util.Scanner;

public class skipmultiplecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = sc.next();
        String s2 = sc.next();
        int m = s1.length();
        int n = s2.length();
        int flag = 0;
        
        for (int i = 0; i <= m - n; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int count = 0;
                int a = 0;
                for (int j = 0; j < n; j++) {
                    if (s2.charAt(j) == s1.charAt(i + j + a)) {
                        count++;
                    } else {
                        break;
                    }
                    a += j;
                }
                if (count == n) {
                    flag++;
                }
            }
        }
        System.out.println("Count of substrings in main string: " + flag);
    }
}
