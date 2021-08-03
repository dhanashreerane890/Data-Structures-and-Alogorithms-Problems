package recursion;

import java.util.Scanner;

public class FamousSumByRecursion {
    static int  famousSum(String s,int sum) {
        if (s=="") {
            return 0;
        }
        char ch = s.charAt(0);
        sum += Integer.parseInt(String.valueOf(ch));

        int pre = famousSum(s.substring(1), 0);
        return sum + pre;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
      String s= scanner.next();
        long N= scanner.nextLong();
        String newString="";
        for(int i=0;i<N;i++){
           newString += s;
        }
        int result= famousSum(newString,0);
        int result1= famousSum(String.valueOf(result),0);
        System.out.println(famousSum(String.valueOf(result1),0));
    }
}
