package unit_2;

import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sentence = scanner.nextLine();

        String words[] =sentence.split(" ");
        System.out.println(words.length);
    }


}
