package stackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {
    Queue<Integer>queue1=new LinkedList<>();
    Queue<Integer>queue2=new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        StackUsingQueue stackUsingQueue=new StackUsingQueue();
//        stackUsingQueue.push(1);
//        stackUsingQueue.push(2);
//        stackUsingQueue.push(3);
//        stackUsingQueue.push(6);
//        stackUsingQueue.push(7);

//        System.out.println(stackUsingQueue.peek());
//        stackUsingQueue.pop();
//        System.out.println(stackUsingQueue.peek());
//        stackUsingQueue.pop();
//        System.out.println(stackUsingQueue.peek());
//        stackUsingQueue.pop();
//        System.out.println(stackUsingQueue.peek());
//        stackUsingQueue.pop();


        for (int i=0;i<n;i++) {
            int condition = scanner.nextInt();
            if (condition == 0) {
                int value = scanner.nextInt();
                stackUsingQueue.push(value);
            } else if (condition == 1) {
                System.out.println(stackUsingQueue.peek());
            } else if (condition == 2) {
                stackUsingQueue.pop();
            }
        }

    }

    public void push(int data){
        while (!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.remove();
        }
        if (queue1.isEmpty()){
            queue1.add(data);
        }else {
            queue2.add(data);
        }
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.remove();
        }
    }
    public void pop(){
        if(!queue2.isEmpty()){
            queue2.remove();
        }
    }
    public int peek(){
        if (!queue2.isEmpty()){
            return queue2.peek();
        }
        return 0;
    }
}

