package stack;

import java.util.Scanner;
import java.util.Stack;

public class SolveFinancialProblm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer>stack=new Stack<>();
        int testcases= scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N= scanner.nextInt();
            int arr[]= new int[N];
            for(int j=0;j<N;j++){
                arr[j]= scanner.nextInt();
            }

            for(int m=0;m<N;m++){
                if(!stack.isEmpty()) {
                    if (stack.peek() > arr[m]){
                            System.out.print( 1 + " ");
                            stack.push(arr[m]);

                        } else if(stack.peek()<arr[m]){
                                System.out.print(m +" ");
                                stack.push(arr[m]);
                            }
                        } else if(stack.isEmpty()) {
                    System.out.print("1" +" ");
                    stack.push(arr[m]);
                }
            }

        }
    }
}







