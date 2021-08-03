package TwoDArrayProblems;
import java.util.Scanner;
public class ConditionalMatrixSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows= scanner.nextInt();
        int cols= scanner.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        int sum=0;
//        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]%3==0){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
