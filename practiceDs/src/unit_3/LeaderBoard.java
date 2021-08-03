package unit_3;

import java.util.Scanner;

public class LeaderBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        String[] nameArray = new String[testCases];
        int[] numberArray = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            String temp = scanner.nextLine();
            String[] data = temp.split(" ");
            nameArray[i] = data[0];
            numberArray[i] = Integer.parseInt(data[1]);
        }
        for (int i = 0; i < testCases - 1; i++) {
            for (int j = i + 1; j < testCases; j++) {
                for (int k = 0; k < Math.min(nameArray[i].length(), nameArray[j].length()); k++) {
                    if (nameArray[i].charAt(k) > nameArray[j].charAt(k)) {
                        String localName = nameArray[i];
                        int localNumber = numberArray[i];
                        nameArray[i] = nameArray[j];
                        numberArray[i] = numberArray[j];
                        nameArray[j] = localName;
                        numberArray[j] = localNumber;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < testCases - 1; i++) {
            for (int j = i + 1; j < testCases; j++) {
                if (numberArray[i] < numberArray[j]) {
                    String localName = nameArray[i];
                    int localNumber = numberArray[i];
                    numberArray[i] = numberArray[j];
                    nameArray[i] = nameArray[j];
                    numberArray[j] = localNumber;
                    nameArray[j] = localName;
                }
            }
        }
        int rank = 1;
        System.out.println(rank + " " + nameArray[0]);
        for (int i = 1; i < testCases; i++) {
            if(numberArray[i - 1] == numberArray[i]) {
                System.out.println(rank+ " "+nameArray[i]);
            }else{
                rank=i+1;
                System.out.println(rank+" "+nameArray[i]);
            }
        }
    }

}
