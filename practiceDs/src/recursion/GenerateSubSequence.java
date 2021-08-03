package recursion;

import java.util.Scanner;

public class GenerateSubSequence {
    static void printSubSeqRec(String str, int n, int index, String ans)
    {
        // base case
        if (index == n) {
            return;
        }
        if (ans != null && !ans.equals(""))
        {
            System.out.println(ans);
        }
        for (int i = index+1; i < n; i++) {
            ans += str.charAt(i);
            printSubSeqRec(str, n, i, ans);

            // backtracking
            ans = ans.substring(0, ans.length() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        String str = scanner.next();
        printSubSeqRec(str, str.length(), -1, "");
    }


}