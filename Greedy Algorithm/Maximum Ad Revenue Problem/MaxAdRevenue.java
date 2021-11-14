import java.util.*;

public class MaxAdRevenue 
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    
    int n=in.nextInt();
    int ar1[]= new int[n];
    int ar2[]= new int[n];
    int c=0;
    for(int i=0;i<n;i++)
    {
      ar1[i]=in.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      ar2[i]=in.nextInt();
    }
    Arrays.sort(ar1);
    Arrays.sort(ar2);
    
    for(int i=0;i<ar1.length;i++)
    {
      c=c+(ar1[i]*ar2[i]);
    }
       System.out.println(c);
  }

}