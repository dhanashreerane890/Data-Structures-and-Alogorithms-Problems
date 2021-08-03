package holidays_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i=0; i<N-1;i++){
            for (int j=i+1;j<N;j++){
                set.add(arr[i]*arr[j]);

            }
        }
        int max=Integer.MIN_VALUE;
        Iterator iterator=set.iterator();
        for (int k=0; iterator.hasNext();k++) {
            int value = (int) iterator.next();
            if (value>max){
                max=value;
            }
        }
        System.out.println(max);

    }
}
