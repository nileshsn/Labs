import java.util.*;

public class  BruteForce
{
   public static int BruteForce(String T, String P)
   {
      int i, j, m, n;

      n = T.length();
      m = P.length();

      i = 0;
      j = 0;
   
      for ( i = 0; i < n-m; i++ )
      {
         printState(T, P, i, 0);		// Show progress....

         if ( P.equals( T.substring(i, i+m) )  )
         {
            System.out.println("**** Found !");
	    return( i );
   
         }
         else
         {
            System.out.println("**** Mismatch: slide P");
         }
      }

      return(-1);
   }



   public static void main(String[] args)
   {
      int i, r;
      String T, P;
      Scanner in;
      int[] f;


      in = new Scanner( System.in );

      System.out.println("Sample input:");
      System.out.println("T = tomxatexatomatoxxx");
      System.out.println("P = tomato");
      System.out.println();

      System.out.print("T = ");
      T = in.nextLine();

      System.out.print("P = ");
      P = in.nextLine();

      System.out.println();
      System.out.println("Matching....");
      System.out.println();

      r = BruteForce(T, P);

      if ( r == -1 )
	 System.out.print("No match found...");
      else
      {
	 System.out.println("Match found at position " + r);
	 System.out.println();
	 System.out.println("0123456789012345678901234567890123456789");
	 System.out.println(T);

	 for (i = 0; i < r; i++ )
	    System.out.print(" ");
	 System.out.println(P);
	 System.out.println();
      }
   }


   /* =====================================================
      Variables and Methods to make the algorithm visual
      ===================================================== */
   public static String T_ruler, P_ruler;

   public static String ruler(int n)
   {
      String out = "";
      char   x = '0';

      for ( int i = 0; i < n; i++ )
      {
         out = out + x;
	 x++;
	 if ( x > '9' )
	    x = '0';
      }

      return out;
   }

   public static void printState(String T, String P, int i, int j)
   {
      if ( T_ruler  == null )
         T_ruler = ruler( T.length() );

      if ( P_ruler  == null )
         P_ruler = ruler( P.length() );

      System.out.println("=====================================");
      System.out.println("Matching: i = " + i + ", j = " + j);

      System.out.println("   " + T_ruler );
      System.out.println("   " + T);
      System.out.print("   ");
      for ( int k = 0; k < i-j; k++)
         System.out.print(" ");
      System.out.println(P);

      System.out.print("   ");
      for ( int k = 0; k < i-j; k++)
         System.out.print(" ");
      System.out.println( P_ruler );

      System.out.print("   ");
      for ( int k = 0; k < i; k++)
         System.out.print(" ");
      System.out.println("^");

      System.out.print("   ");
      for ( int k = 0; k < i; k++)
         System.out.print(" ");
      System.out.println("|");
      System.out.println();
   }

}

