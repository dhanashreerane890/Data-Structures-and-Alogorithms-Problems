package stack;
import java.util.Scanner;
import java.util.Stack;
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
       for(int i=0;i<n;i++){
           int x= scanner.nextInt();
           if(x==2){
               int y= scanner.nextInt();
               stack.push(y);
           }else if(x==1 && !stack.isEmpty() ){
               System.out.println(stack.pop());
           }else if(stack.isEmpty())
               System.out.println("No Food");
           }
       }
    }