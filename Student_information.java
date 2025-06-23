import java.util.Scanner;

public class Student_information
 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter how many subjects:");
        int n = s.nextInt();
        int total = 0;
        float averagePer;
        String grade;
        int[] marks = new int[n];

        System.out.println("Enter marks for " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + " (out of 100):");
            marks[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) { 
            total += marks[i]; 
        }

        averagePer = total / (float) n;

       
        if (averagePer > 90 && averagePer <= 100) {
            grade = "A+";
        } else if (averagePer > 80) {
            grade = "A";
        } else if (averagePer > 70) {
            grade = "B";
        } else if (averagePer > 60) {
            grade = "C";
        } else if (averagePer > 50) {
            grade = "D";
        } else if (averagePer > 40) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        
        System.out.printf("Total Marks: %d\nAverage Percentage: %.2f\nGrade: %s\n", total, averagePer, grade);

        s.close(); 
    }
}
