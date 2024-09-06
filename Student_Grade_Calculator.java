import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter number of Subjects : ");
        int numOfSubject = sc.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < numOfSubject; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " : ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double avgPercentage = (double) (totalMarks / numOfSubject);
        char Grade;
        if (avgPercentage >= 90) {
            Grade = 'O';
        } else if (avgPercentage >= 80) {
            Grade = 'A';
        } else if (avgPercentage >= 70) {
            Grade = 'B';
        } else if (avgPercentage >= 60) {
            Grade = 'C';
        } else if (avgPercentage >= 50) {
            Grade = 'D';
        } else if (avgPercentage >= 40) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }

        System.out.println("Total Marks Scored is :" + totalMarks);
        System.out.println("Average Percentage :" + avgPercentage + "%");
        System.out.println("And Corresponding Grade :" + Grade);

    }

}
