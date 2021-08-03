package recursion;

import java.util.Scanner;

public class GPandRecursion {
    public static double GP(int n,int r){
        if(n<0){
            return 0;
        }
       float value= (float) ((1/power(r,n)) + GP(n-1,r));
        return value;
    }
    static  float power(int n,int p){
        if(p==0){
            return 1;
        }
        float prePower=power(n,p-1);
        return n*prePower;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        int r= scanner.nextInt();
        System.out.format("%.4f",GP(n,r) );
    }
}
