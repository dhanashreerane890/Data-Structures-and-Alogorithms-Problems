package stack;
import java.util.Scanner;
import java.util.Stack;

public class PushPopTop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack =new Stack<>();
            int N= scanner.nextInt();
         for(int i=0;i<N;i++){
             int x= scanner.nextInt();
             if(x==1){
                 int y = scanner.nextInt();
                 stack.push(y);
             }else if(x==2 && !stack.isEmpty()){
                 stack.pop();
             }else {
                 if (!stack.isEmpty()){
                     System.out.println(stack.peek());
                 }else {
                     System.out.println("Empty");
                 }
             }
         }

    }
}

