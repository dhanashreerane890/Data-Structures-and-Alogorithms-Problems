package recursion;

import java.util.Scanner;

public class FamousSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
       long K= scanner.nextLong();
       long val;
       long val1;
       long result;
        val=N%9;
        val1=val*K;
      if(val1>9){
         result= val1%9;
         if(result==0) {
             System.out.println("9");
         }else {
             System.out.println(result);
         }
       }else {
          System.out.println(val1);
      }

       }
}
