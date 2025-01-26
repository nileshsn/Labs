import java.util.Scanner;

public class reversesubstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings:");
        String s1 = scanner.next();
        String s2 = scanner.next();

        int m = s1.length();
        int n = s2.length();

        int flag = -1;

        for (int i = 0; i <= m - n; i++) {
            boolean match = true; // Assume match until proven otherwise

            // Check if s2 matches the substring of s1 starting at index i
            for (int j = 0; j < n; j++) {
                if (s1.charAt(i + j) != s2.charAt(n - 1 - j)) { // Compare s1[i+j] with s2[n-1-j] (reverse comparison)
                    match = false;
                    break;
                }
            }

            if (match) {
                flag = i;
                break;
            }
        }

        if (flag != -1) {
            System.out.println("Reverse of substring found at index " + flag);
        } else {
            System.out.println("Reverse of substring not found");
        }

        scanner.close();
    }
}






// import java.util.Scanner;
// public class reversesubstr
// {
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter two srtrings");
//     String s1=sc.next();
//     String s2=sc.next();
//     int m=s1.length();
//     int n=s2.length();
//     String rev="";
//     for(int i=n-1;i>=0;i--){
//       rev+=s2.charAt(i);
//     }
//     int flag=0;
//     for(int i=0;i<=(m-n);i++)
//     {
//       if(s1.charAt(i)==rev.charAt(0))
//       {
//         int count=0;
//         for(int j=0;j<n;j++)
//         {
//           if(rev.charAt(j)!=s1.charAt(i+j)){
//             count=1;
//             break;
//           }
//         }
//         if(count==0)
//         {
//           flag=i;
//           break;
          
//         }
//       }
//     }
//     if(flag != 0){
//       System.out.println("match found at index "+flag);
//     }
//     else{
//       System.out.println("no match found");
//     }
//   }
// }