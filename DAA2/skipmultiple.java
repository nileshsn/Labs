// import java.util.Scanner;
// public class skipmultiple{
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
//             System.out.println((i+j+a));
//           }
//           a+=(j+1);
//         }
//         if(count==n)
//         {
//           flag=i;
          
//         }
//       }
//     }
//     if(flag != 0 || s1.charAt(flag)==s2.charAt(0) ){
//       System.out.println("\nmatch found from index "+flag);
//     }
//     else{
//       System.out.println("no match found");
//     }
    
    
//   }
// }









import java.util.Scanner;

public class skipmultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = sc.next();
        String s2 = sc.next();
        int m = s1.length();
        int n = s2.length();
        int flag = -1;
        for (int i = 0; i < m; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int count = 0;
                int a = 0;
                for (int j = 0; j < n; j++) {
                    if ((i + j + a) < m && s2.charAt(j) == s1.charAt(i + j + a)) {
                        count++;
                    } else {
                        break;
                    }
                    a += j;
                }
                if (count == n) {
                    flag = i;
                    break;
                }
            }
        }
        if (flag != -1) {
            System.out.println("Match found from index " + flag);
        } else {
            System.out.println("No match found");
        }
    }
}
