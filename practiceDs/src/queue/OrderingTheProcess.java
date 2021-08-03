package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderingTheProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0; j < N; j++) {
            arr2[j] = scanner.nextInt();
        }

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue1.add(arr1[i]);
            queue2.add(arr2[i]);
        }
        int count = 0;
        while (!queue2.isEmpty()){
            if (queue2.peek().equals(queue1.peek())) {
                queue1.poll();
                queue2.poll();
                count++;
            } else {
                if(!queue1.isEmpty()) {
                    int val = queue1.poll();
                    queue1.add(val);
                    count++;
                }
            }
        }
        System.out.println(count);


    }



    }


