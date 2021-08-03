package unit_2;

import java.util.Scanner;
public class CountConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence =scanner.nextLine();
        int count =0;
        for(int i=0;i<sentence.length();i++){
            char ch =sentence.charAt(i);
            if(ch =='a'||ch=='e'||ch =='i'||ch=='o'||ch =='u'){
                System.out.println("");
            }else if(ch!=' '){
                count++;
            }
        }
        System.out.println(count);
    }


}
