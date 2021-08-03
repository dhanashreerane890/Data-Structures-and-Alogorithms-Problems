package unit_2;

import java.util.Scanner;
public class MatchScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nzTotalScore = scanner.nextInt();
        int nzSuperScore = scanner.nextInt();
        int nzFourScore = scanner.nextInt();
        int engTotalScore = scanner.nextInt();
        int engSuperScore = scanner.nextInt();
        int engFourScore = scanner.nextInt();
        if (nzTotalScore < engTotalScore) {
            System.out.println("England");
        } else if(nzTotalScore >engTotalScore){
            System.out.println("New zealand");
        }
       else if (nzTotalScore == engTotalScore && nzSuperScore < engSuperScore) {
            System.out.println("England");
        } else if(nzTotalScore == engTotalScore && nzSuperScore >engSuperScore){
            System.out.println("New Zealand");
        }
        else if (nzTotalScore == engTotalScore && nzSuperScore == engFourScore && nzFourScore > engFourScore) {
            System.out.println("New Zealand");
        } else {
            System.out.println("England");
        }
    }
}
