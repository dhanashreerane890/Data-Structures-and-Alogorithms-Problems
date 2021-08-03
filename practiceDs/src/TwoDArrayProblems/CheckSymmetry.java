package TwoDArrayProblems;

import java.util.Scanner;

//3
//        4
//        *.*.
//        .*.*
//        *.*.
//        .*.*
//        3
//        .*.
//        *.*
//        *.*
//        .*.
//        3
//        ..*
//        **.
//        ..*
//NO
//BOTH
//HORIZONTAL
public class CheckSymmetry {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int testcases = scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N= scanner.nextInt();
           String arr[]=new String[N];
            for(int m=0;m<N;m++){
                    arr[m] = scanner.nextLine();
                }
            boolean checkHorizontal=true;
            boolean checkVertical=true;
            for(int j=0;j<N/2-1;j++){
                if(arr[j].equals(arr[N-1-j]))
                {checkHorizontal=false;
                break;
                }
            }
            for(int k=0;k<N;k++){
                for(int j=0;j<arr[k].length()/2-1;j++){
                    if((arr[k].charAt(j))!=(arr[k].charAt(N-1-j))){
                        checkVertical=false;
                        break;
                    }
                }
                if(!checkVertical){
                    break;
                }
            }
            if(checkHorizontal&&checkVertical){
                System.out.println("Both");
            }else if(checkVertical){
                System.out.println("Vertical");
            }else  if(checkHorizontal){
                System.out.println("Horizontal");
            }else System.out.println("No");
        }
    }

}
