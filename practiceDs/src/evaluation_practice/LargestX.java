package evaluation_practice;

import java.util.Scanner;

public class LargestX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int max = Integer.MIN_VALUE;
            boolean check = false;
            int temp;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i] == (-arr[j])) {
                        temp = arr[i];
                        if (temp > max) {
                            max = temp;
                            check = true;

                        }
                    }
                    if ((-arr[i] == arr[j])) {
                        temp = arr[j];
                        if (temp > max) {
                            check = true;
                            max = temp;
                            break;
                        }
                    }

                }

            }
            if (check) {
                System.out.println(max);
            } else {
                System.out.println("-1");
            }
        }
    }
}
