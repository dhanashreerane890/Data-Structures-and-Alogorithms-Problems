package unit_2;

import java.util.Scanner;
public class DivisionTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0){
            System.out.println("-1");
            return;
        }
        int x=32/n;
        if(x==0){
            System.out.println("Too Low");
        }else{
            System.out.println(x);
        }

    }
}
