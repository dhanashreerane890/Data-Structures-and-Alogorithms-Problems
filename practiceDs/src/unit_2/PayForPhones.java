package unit_2;

import java.util.Scanner;
public class PayForPhones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mob1 = scanner.nextInt();
        int mob2 = scanner.nextInt();
        int mob3 = scanner.nextInt();
        int mob4 = scanner.nextInt();
        int count1=scanner.nextInt();
        int count2=scanner.nextInt();
        int count3=scanner.nextInt();
        int count4=scanner.nextInt();
      int total_amt=((mob1*count1)+(mob2*count2)+(mob3*count3)+(mob4*count4));
      if(total_amt<=150000){
          System.out.println("Possible");
      }else {
          System.out.println("Not Possible");
      }

    }
}
