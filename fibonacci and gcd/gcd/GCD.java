import java.util.*;
public class GCD
{
    public static void main(String[] args)   
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number x : ");
    int x = in.nextInt();
    System.out.println("Enter the number y : ");
    int y = in.nextInt();
    int gcd = 1;  
    for(int i = 1; i <= x && i <= y; i++)  
    {  
    if(x%i==0 && y%i==0)   
    gcd = i;  
    }   
    System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
    }  
}