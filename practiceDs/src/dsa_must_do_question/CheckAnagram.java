package dsa_must_do_question;

import java.util.Arrays;
import java.util.Scanner;
//TC =O(NlogN)
//SP =O(1)
public class CheckAnagram {
    public static  boolean equalArray(char[]arr1 ,char[]arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
    public static boolean CheckIsAnagram(String first ,String second){
        char []arr1 =first.toCharArray();
        char []arr2=second.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return equalArray(arr1,arr2);



    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second =scanner.next();
        if(CheckIsAnagram(first,second)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
