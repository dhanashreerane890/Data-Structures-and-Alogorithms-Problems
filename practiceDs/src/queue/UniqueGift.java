package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UniqueGift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            String val = scanner.next();
            Queue<Character> queue1 = new LinkedList<>();
            Queue<Character> queue2 = new LinkedList<>();
            for (int i = 0; i < val.length(); i++) {
                if (queue1.isEmpty()) {
                    queue1.add(val.charAt(i));
                    System.out.print(queue1.peek() + " ");

                } else {
                    if (queue1.peek() == val.charAt(i)) {
                        queue1.poll();
                        if (!queue2.isEmpty()) {
                            queue1.add(queue2.peek());
                            queue2.poll();
                            System.out.print(queue1.peek() + " ");
                        } else {
                            System.out.print("#" + " ");
                        }

                    } else {
                        queue2.add(val.charAt(i));
                        System.out.print(queue1.peek() + " ");
                    }

                }
            }
            System.out.println();
        }
    }
}
