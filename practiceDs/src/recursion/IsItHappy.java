package recursion;

import java.util.Scanner;

public class IsItHappy {


    static boolean isHappy(String s) {
        if (s.equals("1")) {
            return true;

        }
        else if(s.length()<=1){
            return false;
        }
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val=power(Integer.parseInt(String.valueOf(ch)),2);
            sum+=val;
        }
        return isHappy(String.valueOf(sum));

    }

    static int power(int n,int p){
        if (p==0){
            return 1;
        }
        int prevPower=power(n,p-1);
        return n*prevPower;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int k = 0; k < testcases; k++) {
            String s = scanner.next();
            if (isHappy(s)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
