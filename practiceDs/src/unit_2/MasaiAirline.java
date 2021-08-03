package unit_2;

import java.util.Scanner;
public class MasaiAirline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Passengers = scanner.nextInt();
        int arr1[] = new int[Passengers];
        for (int i = 0; i < Passengers; i++) {
            arr1[i] = scanner.nextInt();
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] <= 15) {
                    System.out.println("Boarding");
                } else {
                    System.out.println("Stop");
                }
            }
        }
    }
}
