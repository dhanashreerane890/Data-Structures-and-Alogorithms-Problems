package practice;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();
        System.out.println(name.substring(0,1));

        for(int i=0;i< name.length();i++){
            for(int j=i+1;j<=name.length();j++){
                    System.out.println(name.substring(i,j));
                }
            }
        }
}
