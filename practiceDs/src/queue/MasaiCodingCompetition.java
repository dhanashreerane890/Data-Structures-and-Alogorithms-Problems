package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MasaiCodingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queueOne = new LinkedList<>();
        Queue<Integer> queueTwo = new LinkedList<>();
        Queue<Integer> queueThree = new LinkedList<>();
        Queue<Integer> queueFour = new LinkedList<>();
        Queue<Integer> queueMaster = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String ch = scanner.next();
            if (ch.equals("E")) {
                int Group = scanner.nextInt();
                int Roll_no = scanner.nextInt();
                if (Group == 1) {
                    queueOne.add(Roll_no);
                    if (!queueMaster.contains(Group)) {
                        queueMaster.add(Group);
                    }
                } else if (Group == 2) {
                    queueTwo.add(Roll_no);
                    if (!queueMaster.contains(Group)) {
                        queueMaster.add(Group);
                    }
                } else if (Group == 3) {
                    queueThree.add(Roll_no);
                    if (!queueMaster.contains(Group)) {
                        queueMaster.add(Group);
                    }
                } else if (Group == 4) {
                    queueFour.add(Roll_no);
                    if (!queueMaster.contains(Group)) {
                        queueMaster.add(Group);
                    }
                }

                }else if(ch.equals("D")){
                if(!queueMaster.isEmpty()) {
                    if (queueMaster.peek() == 1) {
                        System.out.println("1" + " " + queueOne.remove());
                        if (queueOne.isEmpty()) {
                            queueMaster.remove();
                        }
                    } else if (queueMaster.peek() == 2) {
                        System.out.println("2" + " " + queueTwo.remove());
                        if (queueOne.isEmpty()) {
                            queueMaster.remove();
                        }

                    } else if (queueMaster.peek() == 3) {
                        System.out.println("3" + " " + queueThree.remove());
                        if (queueOne.isEmpty()) {
                            queueMaster.remove();
                        }

                    } else if (queueMaster.peek() == 4) {
                        System.out.println("4" + " " + queueFour.remove());
                        if (queueOne.isEmpty()) {
                            queueMaster.remove();
                        }

                    }
                }
            }
            }
        }
    }

//        6
//        E 1 1
//        E 2 1
//        E 1 2
//        D
//        D
//        D