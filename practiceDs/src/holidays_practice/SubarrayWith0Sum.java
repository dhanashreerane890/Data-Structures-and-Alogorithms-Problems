package holidays_practice;

import java.util.Scanner;

public class SubarrayWith0Sum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        boolean isCheck=false;
        int []arr1=new int[N];
        for(int j=0;j<N;j++){
            for(int k=j;k<N;k++){
                arr1[j]+=arr[k];
                int[]arr2=new int[N];
                for(int s=j;s<=k;s++){
                    arr2[j]+=arr1[s];
                    for(int m=0;m<N;m++) {
                        if (arr2[j] == 0) {
                            isCheck=true;
                                break;
                        }
                    }
                }
            }
        }if(isCheck){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
//3 4 -7 3 1 3 1 -4 -2 -2
