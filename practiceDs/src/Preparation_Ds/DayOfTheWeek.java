package Preparation_Ds;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day=scanner.next();
        int num= scanner.nextInt();
          int val=  num%7;
        String Arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
          for(int i=0;i< Arr.length;i++){
              if(Arr[i].equals(day)){
                  System.out.println(Arr[i+val]);
              }

          }
    }
}
