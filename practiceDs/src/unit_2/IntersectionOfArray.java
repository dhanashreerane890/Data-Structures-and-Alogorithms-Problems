package unit_2;

import java.util.Scanner;
class IntersectionOfArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scanner.nextInt();
        }
        for(int i=0; i< arr1.length;i++){
            for (int j=0; j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);

                }

            }
        }

    }

}
