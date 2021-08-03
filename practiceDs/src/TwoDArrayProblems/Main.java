package TwoDArrayProblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int testCases= scanner.nextInt();
        int [] array= new int[testCases];
        for(int i=0;i<testCases;i++){
            array[i]= scanner.nextInt();
        }

        LinkedHashMap<Integer, Integer> hashMap= new LinkedHashMap<>();
        for(int i=0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }else {
                hashMap.put(array[i],1);
            }
        }
        boolean p=true;
        for(int i=0;i<array.length;i++){
            if(hashMap.get(array[i])==1){
                p=false;
                System.out.println(array[i]);
                break;
            }
        }
        if(p){
            System.out.println(-1);
        }
    }
}