package recursion;


import java.util.Scanner;

public class EtoPwerX {
        static double ex(int n,int r){
            if (r==0){
                return 1;
            }
            double value=(power(n,r)/factorial(r))+ex(n,r-1);
            return value;
        }

        static int factorial(int n){
            if (n==1){
                return 1;
            }
            int prevFact=factorial(n-1);
            return n*prevFact;
        }

        static double power(int n,int r){
            if (r==0){
                return 1;
            }
            double prevPower=power(n,r-1);
            return n*prevPower;
        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();
            int r= scanner.nextInt();
            double val=ex(n,r);
            System.out.format("%.4f",val);

    }
}
