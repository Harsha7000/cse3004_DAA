import java.util.*;
import java.math.*;
public class Fibo 
{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Enter the number of terms : ");
    n = in.nextInt();
    BigInteger[] fibo = new BigInteger[n];
    fibo[0]=BigInteger.valueOf(0);
    fibo[1]=BigInteger.valueOf(1);
    for(int i=2;i<n;i++)
    {
        fibo[i] = fibo[i-1].add(fibo[i-2]);
    }
    System.out.println(fibo[n-1]);
}
}