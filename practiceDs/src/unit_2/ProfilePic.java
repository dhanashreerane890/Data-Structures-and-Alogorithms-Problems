package unit_2;

import java.util.Scanner;
public class ProfilePic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int L= scanner.nextInt();
int W = scanner.nextInt();
int length= scanner.nextInt();
int width= scanner.nextInt();
 if(length<L){
    System.out.println("Increase Length");
}else if(width<W) {
     System.out.println("Increase Width");
 }
 else if(length>L&&width>W) {
     System.out.println("Upload");
 }
    }
}
