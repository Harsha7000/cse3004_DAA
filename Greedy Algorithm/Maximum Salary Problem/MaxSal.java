import java.util.*;
public class MaxSal {

  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the no.of numbers : ");
      int n=in.nextInt();
      int array[]=new int[n];
      System.out.println("Enter the numbers : ");
      for (int i = 0; i < array.length; i++) {
          array[i]=in.nextInt();
      }

      String Str[]=new String[array.length];
      for(int i=0;i<array.length;i++) {
        Str[i]=array[i]+"";
      }
      
      Arrays.sort(Str, new  Comparator<String>() {
  
        @Override
        public int compare(String n1, String n2) {
          
          String n12=n1+n2;
          String n21=n2+n1;
          if(n12.compareTo(n21)>0)
            return -1;
          else
            return 1;
        }
        
      });

      System.out.println("Possible maximum salary : ");

      for(int i=0;i<Str.length;i++)
        System.out.print(Str[i]);
  
    }
  
  }