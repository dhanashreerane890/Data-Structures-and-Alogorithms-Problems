package unit_2;

import java.util.Scanner;
public class LongestRepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.next();
        int maximum =1;
        int count =1;
        for (int i=1;i<arr.length();i++){
            if(arr.charAt(i)!=arr.charAt(i-1)){
                count=1;
            }else {
                count++;
            }
            if(count>maximum){
                maximum=count;
            }
        }
        System.out.println(maximum);

    }



}
