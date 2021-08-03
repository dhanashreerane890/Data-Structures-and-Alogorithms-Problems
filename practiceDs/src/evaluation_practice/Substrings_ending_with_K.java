package evaluation_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Substrings_ending_with_K {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N= scanner.nextInt();
            String input= scanner.next();
            String K= scanner.next();
            int count=0;
            for(int m=0;m<N;m++){
                for(int n=m;n<N;n++){
                    String substring="";
                    for(int s=m;s<=n;s++){
                        substring+=input.charAt(s);

                    }
                    HashSet<String>hashSet=new HashSet<>();
                    for(int h=0;h<substring.length();h++){
                        hashSet.add(substring);
                    }
                    Iterator iterator = hashSet.iterator();
                    for (int s=0;iterator.hasNext();s++) {

                        String value = (String) iterator.next();
//                        System.out.println(value);
                        if (value.charAt(value.length()-1)==K.charAt(0)){
                            count++;

                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
