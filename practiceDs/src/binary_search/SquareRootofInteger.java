package binary_search;


import java.util.Scanner;
public class SquareRootofInteger {

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
//,int pos

//  if (head == null){
//          return head;
//          }
//
//          Node temp = head;
//
//          if (pos == 0)
//          {
//          head = temp.next;
//          return head;
//          }
//
//          for (int i=0; temp!=null && i<pos-1; i++){
//        temp = temp.next;
//        }
//
//        if (temp == null || temp.next == null){
//        return head;
//        }
//
//        Node next = temp.next.next;
//
//        temp.next = next;
//        return head;

