package recursion;

import java.util.Scanner;

public class MrRobotEliate {

    static void mrRobort(String s, int left, int right) {
        if(left>right){
            return;
        }
        int mid=(right+left)/2;

        char ans=s.charAt(mid);
        System.out.print(ans);
        mrRobort(s,left,mid-1);
        mrRobort(s,mid+1,right);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N=scanner.nextInt();
            String s= scanner.next();
            mrRobort(s,0,N-1);
            System.out.println();
        }


    }
}
//3
//        3
//        abc
//        4
//        abcd
//        11
//        abcdefghijk
//fcabdeighjk