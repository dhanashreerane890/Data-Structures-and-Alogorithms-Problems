package unit_2;

import java.util.Scanner;
public class WeightedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int first = scanner.nextInt();
            int arr[] = new int[first];
            for (int j = 0; j < first; j++) {
                arr[j] = scanner.nextInt();
            }
            int sum=0;
            for(int k=0;k<first;k++){
                int s=(k+1);
                sum =sum+(arr[k])*(s);
            }
            System.out.println(sum);
        }

    }
}
