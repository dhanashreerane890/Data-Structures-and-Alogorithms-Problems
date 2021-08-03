package recursion;
import java.util.Scanner;


public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int start = low;
        int end = high;
        while (start < end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, low, end);
        return end;
    }

        static void quickSort(int[] arr, int low, int high) {
        if (low < high)
        {
            int Pivot = partition(arr, low, high);
            quickSort(arr, low, Pivot - 1);
            quickSort(arr, Pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int j=0;j<N;j++){
            arr[j]= scanner.nextInt();
        }
        quickSort(arr, 0, N - 1);
        for (int i = 0; i < N; ++i){
            System.out.print(arr[i] + " ");
        }

    }

}
