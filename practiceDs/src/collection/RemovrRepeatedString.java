package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemovrRepeatedString {
    public static void main(String[]args) {
        String [] arr={"Masai","School","is","Awesome","but","Masai","is","intense"};
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        for(int i= 0;i< arr.length; i++) {
            hashSet.add(arr[i]);
        }
        Iterator iterator= hashSet.iterator();
        while(iterator.hasNext()){
            String data=(String) iterator.next();
            System.out.println(data);
        }
    }
}
