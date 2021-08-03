package unit_2;

import java.util.Scanner;
public class HelpElevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for (int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        for(int i=0;i<N;i++){
            if(arr[i]>=85){
                System.out.println("Beep");
            }else {
                System.out.println("Enter");
            }
        }
    }
}
