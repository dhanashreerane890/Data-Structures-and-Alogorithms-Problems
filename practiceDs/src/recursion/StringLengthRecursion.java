package recursion;

import java.util.Scanner;

public class StringLengthRecursion {

    static int stringLen(String s){
      if(s.equals("")){
          return 0;
      }
      int val=stringLen(s.substring(1));
     return val+1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        System.out.println(stringLen(s));
        }
    }



