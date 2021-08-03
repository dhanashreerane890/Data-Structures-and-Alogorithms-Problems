package Preparation_Ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NewYearSelebration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<N;i++){
            int operations= scanner.nextInt();
            if(operations==1){
                int x= scanner.nextInt();
             queue.add(x);
            }else if(operations==2){
                int y= scanner.nextInt();
                stack.push(y);
            }else if(operations==3 &&!queue.isEmpty()){
                System.out.println(queue.peek());
            }  else if (queue.isEmpty()){
                System.out.println("-1");
            }
            else if(operations==4 && !stack.isEmpty()){
                System.out.println(stack.peek());
            }else if(stack.isEmpty()){
                System.out.println("-1");
            }
            else if(operations == 5){
              stack.push(queue.remove());
            }
        }
    }
}
