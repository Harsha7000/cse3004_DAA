import java.util.*;
public class CarFuel{
        
        public static int carFueling(int dist,int miles,int n,int gas_stations[]){
           
         int numRefills = 0;
         int currentPosition = 0 ;
           if(gas_stations[0]<=miles || gas_stations[n-1]<=miles){
           while(currentPosition+1 < n){ 
            int lastPosition = currentPosition ;
           while((currentPosition+1)<n && (gas_stations[currentPosition+1]-gas_stations[lastPosition]) <= miles) {     
              currentPosition++; 
           } 
           if (currentPosition == lastPosition) 
            return -1;
           if (currentPosition <= n) 
            numRefills ++; 
           
           }
           
           return numRefills;
        }
        else
        return -1;
                    
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the destination : ");
            int destination = in.nextInt();
            System.out.println("Enter the range : ");
            int range = in.nextInt();
            System.out.println("Enter the no.of stops : ");
            int n = in.nextInt() ;
            System.out.println("Enter the stops : ");
            int [] arr = new int [n];
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
            }
            int result=carFueling(destination, range, n,arr);
            if(result==-1)
            System.out.println("Path out of range");
            else
            System.out.println("Minimum no.of times to fill the car : " + result);
            in.close();
        }
        
    }



