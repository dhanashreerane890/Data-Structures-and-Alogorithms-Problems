package sorting_unit3;
import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] =new int[num];
        for(int k=0;k<num;k++)
            arr[k] = scanner.nextInt();
            int swap ;
            for(int i =0;i<num-1;i++ ){
                for(int j=0;j<num-i-1;j++){
                    if(arr[j]>arr[j+1]){
                    swap =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=swap;
                    }
                }
            }
        for(int k=0;k<num;k++)
            System.out.print(arr[k] + " ");
        }

    }
//    0, 1, 2, 0, 1, 2

