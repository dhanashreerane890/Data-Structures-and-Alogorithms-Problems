package holidays_practice;

import java.util.HashSet;
import java.util.Scanner;

public class MaxLengthSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr1 = new int[N];
        for (int j = 0; j < N; j++) {
            for (int k = j; k < N; k++) {
                arr1[j] += arr[k];
                int[] arr2 = new int[N];
                for (int s = j; s <= k; s++) {
                    arr2[j] += arr1[s];

                }
            }
        }

    }
}

//        or
//      boolean check=false;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for (int j=i;j<arr.length;j++){
//                sum+=arr[j];
//                if(sum==0){
//                    check=true;
//                    break;
//                }
//            }
//            if(check)
//                break;
//        }
//        System.out.println(check);
//
//

//        OR
//        boolean check=false;
//       HashSet<Integer> hashSet=new HashSet<>()  ;
//        int sum=0;
//        for (int i=0;i<N;i++) {
//            hashSet.add(sum);
//            sum+=arr[i];
//            if(hashSet.contains(sum)){
//                check=true;
//                break;
//            }
//        }
//        System.out.println(check);
//    }
//}
