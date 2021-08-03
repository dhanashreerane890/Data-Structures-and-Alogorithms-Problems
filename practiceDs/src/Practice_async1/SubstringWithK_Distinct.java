package Practice_async1;

import java.util.HashSet;
import java.util.Scanner;

public class SubstringWithK_Distinct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int K= scanner.nextInt();
        String input=scanner.next();
        int count=0;
        if(K<=26) {
            for (int i = 0; i < input.length(); i++) {
                for (int j= i; j < input.length(); j++) {
                    String subString = "";
                    for (int k = i; k <= j; k++) {
                        subString += input.charAt(k);
//                        System.out.print(subString +" ");
                    }
                    HashSet<Character> hashSet= new HashSet<>();
                    for(int p=0;p<subString.length();p++){
                        hashSet.add(subString.charAt(p));
                    }
                    if((hashSet.size()==K)&&subString.length()==hashSet.size()){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }else System.out.println(count);}
                    }



