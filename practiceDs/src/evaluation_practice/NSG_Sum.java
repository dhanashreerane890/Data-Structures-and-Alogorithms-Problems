package evaluation_practice;

import java.util.Scanner;

public class NSG_Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          int testcases= scanner.nextInt();
          for(int i=0;i<testcases;i++){
              int N= scanner.nextInt();
              int arr[]=new int[N];
              for(int j=0;j<N;j++){
                  arr[j]= scanner.nextInt();
              }
              int temp=0;
              int sum=0;
              for(int m=0;m<N;m++){
                  for(int n=m+1;n<N;n++){
                      if(arr[m]<arr[n]){
                          temp=n;
                          break;
                      }else {
                          sum=sum-1;
                          break;
                      }
                  }
                  for(int s= temp+1;s<N;s++){
                      if(arr[s]<arr[temp]){
                        sum+=arr[s];
                        break;
                      }
                  }
              }
              System.out.println(sum);
          }
    }
}
