package recursion;
import java.util.Scanner;
public class SquareRootInteger {

    static long squareRoot(long low, long high, long N)
    {
        if (low <= high) {

            long mid = (low + high) / 2;

            if ((mid * mid <= N) && ((mid + 1) * (mid + 1) > N)) {
                return mid;
            }
            else if (mid * mid < N) {
                return squareRoot(mid + 1, high, N);
            }
            else {
                return squareRoot(low, mid - 1, N);
            }
        }
        return low;
    }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int testCase= scanner.nextInt();
            for (int t=0;t<testCase;t++) {
                long num = scanner.nextLong();
                System.out.println(squareRoot(0, num, num));
            }
        }

}
