import java.util.Arrays;
import java.util.Scanner;

public class ArrangeAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.next();
        char []aar=input.toCharArray();
          Arrays.sort(aar);
        for(int i=0;i<aar.length;i++) {
                System.out.println(aar[i]);

        }

    }
}
