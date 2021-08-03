package unit_2;

import java.util.Scanner;
public class DistinctAgain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        int sum=arr[0];
        int temp=arr[0];
        for(int i=0;i<N;i++){
            if(temp!=arr[i]){
                sum=sum+arr[i];
                temp=arr[i];
            }

        }
        System.out.println(sum);

    }
}
//import java.util.Scanner;
//class unit_2.DistinctAgain{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int N=s.nextInt();
//        int array=0;
//        int sum=0;
//        int[] arr=new int[N];
//        for(int i=0;i<N;i++){
//            arr[i]=s.nextInt();
//
//            if (i==0){
//                array = arr[i];
//                sum = sum + arr[i];
//            }else if (arr[i]!=array){
//                array = arr[i];
//                sum = sum + arr[i];
//            }else if (arr[i]==array){
//                continue;
//            }
//        }
//
//        System.out.println(sum);
//    }
//
//}
