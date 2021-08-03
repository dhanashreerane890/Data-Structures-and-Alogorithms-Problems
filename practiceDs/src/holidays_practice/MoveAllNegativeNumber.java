package holidays_practice;

import java.util.Scanner;

public class MoveAllNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer=new StringBuffer();
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }

        for(int i=0;i<N;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }else if(arr[i]>=0){
                stringBuffer.append(arr[i]+" ");

            }
        }
        System.out.print(stringBuffer+" ");

    }
}
