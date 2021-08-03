package sorting_unit3;
import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for (int k = 0; k < num; k++)
            arr[k] = scanner.nextInt();

        for (int i = 0; i < num - 1; i++) {
            int min = i;
            int temp;
            for (int j = i+1; j < num; j++) {
                if (arr[j] < arr[min]) {
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < num; k++)
            System.out.print(arr[k]+ " ");

    }
}
