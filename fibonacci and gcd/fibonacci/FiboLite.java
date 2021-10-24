import java.util.*;
class FiboLite {
    public static void main(String[] args) {
        int n = 5;
        int [] t = new int [n];
        t[0]=0;
        t[1]=1;
        for(int i=2;i<t.length;i++){
            t[i]=t[i-1]+t[i-2];
        }
        System.out.println(t[n-1]);
    }
}