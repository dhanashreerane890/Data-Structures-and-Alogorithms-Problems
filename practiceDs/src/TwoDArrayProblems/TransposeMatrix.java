package TwoDArrayProblems;
import java.util.Scanner;
public class TransposeMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0;i<cols ;i++){
            for (int j=0;j<rows;j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println(" ");
        }

    }
}
