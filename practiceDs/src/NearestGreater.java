import java.util.Scanner;
import java.util.Stack;

public class NearestGreater {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while (!stack.isEmpty()) {
                if (stack.peek() > arr[i]) {
                    System.out.print(stack.peek() + " ");
                    stack.push(arr[i]);
                    break;
                }
                    stack.pop();

            }
            if(stack.isEmpty()){
                System.out.print("-1"+" ");
                stack.push(arr[i]);
            }
        }
    }

}
