package evaluation_practice;

import java.util.HashSet;
import java.util.Scanner;

public class RowGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int s = 0; s < N; s++) {

            HashSet<Integer> hashSet=new HashSet<>();
            int R = scanner.nextInt();
            int C = scanner.nextInt();
            int[][] matrix = new int[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int p;
            for (int i = 0; i < C; i++) {
                p = matrix[0][i];
                boolean check1 = true;
                for (int r = 1; r < R; r++) {
                    boolean check2 = false;
                    for (int c = 0; c < C; c++) {
                        if (p == matrix[r][c]) {
                            check2 = true;
                            break;
                        }
                    }
                    if (!check2) {
                        check1 = false;
                        break;
                    }
                }
                if (check1) {
                    hashSet.add(p);
                    arr[s]=hashSet.size();
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
