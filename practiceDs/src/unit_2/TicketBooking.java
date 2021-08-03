package unit_2;

import java.util.Scanner;
public class TicketBooking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int price1 = scanner.nextInt();
        int price2 = scanner.nextInt();
        int price3 = scanner.nextInt();
        int ticket1 = scanner.nextInt();
        int ticket2 = scanner.nextInt();
        int ticket3 = scanner.nextInt();
        int priceOfAllTickets =((price1*ticket1)+
                (price2*ticket2)+(price3*ticket3));
        System.out.println(priceOfAllTickets);
    }
}
