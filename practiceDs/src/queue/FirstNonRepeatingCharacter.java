package queue;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch= scanner.next();
        Queue<Character>queue=new LinkedList<>();
        for (int i = 0; i < ch.length(); i++) {
            if (queue.isEmpty()) {
                queue.add(ch.charAt(i));
                System.out.print(queue.peek()+" ");
            } else if (queue.peek() == ch.charAt(i)) {
                queue.remove();
                System.out.print("#"+" ");
            } else {
                System.out.print(queue.peek()+" ");
            }
        }
    }
}
