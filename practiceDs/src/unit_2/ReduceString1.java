package unit_2;

import java.util.Scanner;

public class ReduceString1 {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input = scanner.next();
        StringBuilder stringBuffer = new StringBuilder();
        for(int i=0;i<input.length();i++){
           char ch = input.charAt(i);
            stringBuffer.append(ch);
        }
        System.out.println(stringBuffer);
    }
}
