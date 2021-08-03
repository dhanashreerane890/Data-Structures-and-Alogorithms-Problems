package holidays_practice;

import java.util.Scanner;

public class MoveNegativeNumFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int t = 0; t < N; t++) {
            arr[t] = scanner.nextInt();
        }

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                stringBuilder.append(arr[i]+" ");
            } else if(arr[i] > 0) {
                stringBuilder1.append(arr[i]+" ");
            }

        }
        System.out.println(stringBuilder+ "" +stringBuilder1);
    }
}

