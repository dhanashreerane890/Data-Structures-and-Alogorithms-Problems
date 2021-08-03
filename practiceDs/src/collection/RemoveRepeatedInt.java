package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveRepeatedInt {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 40, 30};
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            int value= (int) iterator.next();
            System.out.println(value);
        }
    }
}
