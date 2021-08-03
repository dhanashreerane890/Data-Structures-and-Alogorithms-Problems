package dseval_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FootballTounament {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        String [] input = new String[N];
        LinkedHashMap<String,Integer>hashMap=new LinkedHashMap<>();
        for(int i=0;i<input.length;i++){
            input[i]= scanner.next();
            if(hashMap.containsKey(input[i])){
                hashMap.put(input[i],hashMap.get(input[i])+1);
            }else {
                hashMap.put(input[i],1);
            }
        }
        String output="";
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer>map:hashMap.entrySet()){
            if(map.getValue()>max){
                max=map.getValue();
                output=map.getKey();
            }
        }
        System.out.println(output);
    }

}
