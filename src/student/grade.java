package student;

import java.util.Scanner;


public class grade {

    public static void main(String[] args) {

        int marks[] = new int[3];

        int i;

        float total = 0;

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < marks.length; i++) {
            System.out.print("Enter Mark of Subject [" + (i + 1) + "] :");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }

        printStudentGrade(total, marks);

    }

    public static void printStudentGrade(float total, int marks[]) {

        float avg;

        avg = total / marks.length;

        System.out.print("The student Grade is: ");

        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
     }

    }

