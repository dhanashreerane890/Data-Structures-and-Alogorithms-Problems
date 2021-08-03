import java.util.Arrays;
import java.util.Scanner;

public class MaximizeTheSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int max =Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                max=Integer.max(max,arr[i]);
            }
            System.out.println(max);

        }


    }

}
