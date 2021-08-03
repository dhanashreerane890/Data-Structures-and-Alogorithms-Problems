package unit_2;

import java.util.Scanner;
class Till42{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i]== 42) {
                result =true;
                break;
            }else{
                sum += a[i];
            }
        }
        if (result){
            System.out.println(sum + 42);
        }else{
            System.out.println(sum);
        }
    }

}
