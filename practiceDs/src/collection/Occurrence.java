package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {//10
                int count = hashMap.get(arr[i]) ;//10
                hashMap.put(arr[i], count + 1);//10,2
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        boolean check=true;
        for(Map.Entry<Integer,Integer> map:hashMap.entrySet()){
            if(map.getValue()==2){
                System.out.println(map.getKey());
                check=false;
            }
        }
        if(check){
            System.out.println("not found");
        }
    }
}
