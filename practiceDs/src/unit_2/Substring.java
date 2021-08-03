package unit_2;

import java.util.Scanner;
class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String arr=scanner.next();
        int count=0;
        for(int i=0;i<arr.length();i++){
            for(int j=i;j<arr.length();j++){
                String initialSum= "";

                for(int k=i;k<=j;k++){
                    initialSum+=arr.charAt(k);
                }
                String Z = " ";

                for(int m=initialSum.length()-1;m>=0;m--){

                    Z = Z + initialSum.charAt(m);
                }
                if(initialSum.equals(Z)){
                    if(initialSum.length()>count){
                        count=initialSum.length();
                    }
                }
            }
        }
        System.out.println(count);
    }
}
