package Preparation_Ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WatingLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        int n= scanner.nextInt();
        for (int i=0; i<n; i++){
            String ch =scanner.next();
            if (ch.equals("E")){
                int x= scanner.nextInt();
                queue.add(x);
                System.out.println(queue.size());
            }else if(ch.equals("D")&& !queue.isEmpty() ){
                System.out.println(queue.remove()+ " " + queue.size());
            }
            else  {
                System.out.println("-1" + " "+ queue.size());
            }
        }
    }
}
