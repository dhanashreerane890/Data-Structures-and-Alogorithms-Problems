package unit_2;

import java.util.Scanner;
    public class MakeLeaderBoard  {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int testCases = Integer.parseInt(scanner.nextLine());
//            String[] nameArr = new String[testCases];
//            int[] numberArray = new int[testCases];
//
//            for (int i = 0; i < testCases; i++) {
//                String temp = scanner.nextLine();
//                String[] data = temp.split(" ");
//                nameArr[i] = data[0];
//                numberArray[i] = Integer.parseInt(data[1]);
//            }
//            for (int i = 0; i < testCases - 1; i++) {
//                for (int j = i + 1; j < testCases; j++) {
//                    for (int k = 0; k < Math.min(nameArr[i].length(), nameArr[j].length()); k++) {
//                        if (nameArr[i].charAt(k) > nameArr[j].charAt(k)) {
//                            String presentName = nameArr[i];
//                            int presentNum = numberArray[i];
//                            nameArr[i] = nameArr[j];
//                            numberArray[i] = numberArray[j];
//                            nameArr[j] = presentName;
//                            numberArray[j] = presentNum;
//                            break;
//                        }
//                    }
//                }
//            }
//            for (int i = 0; i < testCases - 1; i++) {
//                for (int j = i + 1; j < testCases; j++) {
//                    if (numberArray[i] < numberArray[j]) {
//                        String presentName = nameArr[i];
//                        int presentNum = numberArray[i];
//                        numberArray[i] = numberArray[j];
//                        nameArr[i] = nameArr[j];
//                        numberArray[j] = presentNum;
//                        nameArr[j] = presentName;
//                    }
//                }
//            }
//            int rank = 1;
//            System.out.println(rank + " " + nameArr[0]);
//            for (int i = 1; i < testCases; i++) {
//                if(numberArray[i - 1] == numberArray[i]) {
//                    System.out.println(rank+ " "+nameArr[i]);
//                }else{
//                    rank=i+1;
//                    System.out.println(rank+" "+nameArr[i]);
//                }
//            }
//        }
//    }
}
