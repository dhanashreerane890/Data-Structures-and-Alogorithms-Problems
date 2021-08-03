package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuyTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        Queue<Integer>queue =new LinkedList<>();
        for(int i=0;i<N;i++){
            String ch= scanner.next();
            if(ch.equals("E")){
                int x= scanner.nextInt();
                queue.add(x);
                System.out.println(queue.size());

            }
            else if(!queue.isEmpty() && ch.equals("D")){
                System.out.println(queue.remove() +" " +queue.size());
            }
            else {
                System.out.println("-1" +" " +queue.size());
            }
        }
    }
}
