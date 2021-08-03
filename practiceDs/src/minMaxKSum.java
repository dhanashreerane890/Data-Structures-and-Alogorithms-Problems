import java.util.Scanner;

public class minMaxKSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k= scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum=0;
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                if( arr.length>k){
                sum+=arr[j];
                break;
            }
        }
        }
        System.out.println(sum);
    }
}
