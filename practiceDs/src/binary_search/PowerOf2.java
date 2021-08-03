package binary_search;

import java.util.Scanner;

public class PowerOf2 {
    static boolean sqrtSearch(float low, float high)
    {
        if (low <= high) {
            float mid = (low + high) / 2;
            if (mid==1){
                return true;
            }
            else if (mid%2==0){

                return sqrtSearch(0,mid);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i=0;i<n;i++){
            float k= scanner.nextFloat();
            if (sqrtSearch(0,k)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }

}