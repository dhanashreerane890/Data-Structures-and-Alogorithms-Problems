package Preparation_Ds;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectPalindrome2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int t=0;t<testcases;t++){
            int N= scanner.nextInt();
            String name= scanner.next();

            LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();
            for(int i=0;i<name.length();i++){
                if(hashMap.containsKey(name.charAt(i))){
                    int count = hashMap.get(name.charAt(i));
                    hashMap.put(name.charAt(i),count+1);
                }else {
                    hashMap.put(name.charAt(i), 1);
                }
            }
            int count=0;
            int count2=0;
            int count3=0;
            for(Map.Entry<Character,Integer> map:hashMap.entrySet()){
                if(map.getValue()==1){
                    count++;
                    if(count==2){
                        count3++;
                        System.out.println("Not Possible!");
                        break;
                    }
                }else  if(map.getValue()%2==1){
                    count2++;
                }

            }
            if(count2>0 && count3==0){
                System.out.println("Not Possible!");
            }else if(count<2){
                System.out.println("Possible!");
            }
        }
    }
}
