import java.util.*;

class point
{
  int x;
  int y;
}
public class postoffice
{
  public static void main(String[] args) {
    System.out.println("enter count of points");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    point p[]=new point[n];

    for(int i=0;i<n;i++){
      p[i]=new point();
      System.out.println("enter "+(i+1)+" point coordinates");
      p[i].x=sc.nextInt();
      p[i].y=sc.nextInt();
    }

    int min=Integer.MAX_VALUE;
    
    for(int i=0;i<n;i++){
      int sum=0;
      for(int j=0;j<n;j++)
      {
        double xi=(p[i].x-p[j].x)*(p[i].x-p[j].x);
        double yi=(p[i].y-p[j].y)*(p[i].y-p[j].y);
        double d=Math.sqrt(xi+yi);
        sum+=d;
        // min=(int)Math.min(d,min);
        
      }
      if(sum<min){
        min=(int)sum;
      }
    }
    System.out.println("minimum distance between two points : "+min);

  }
}
