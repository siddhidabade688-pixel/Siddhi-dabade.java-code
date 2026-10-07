import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter siddhi: ");
        String name = sc.nextLine();
        System.out.println("Enter marks out of 100:");
        System.out.print("Marathi:");
        int m1 = sc.nextInt();
        System.out.print("Science:");
        int m2 = sc.nextInt();
        System.out.print("English:");
        int m3 = sc.nextInt();
        System.out.print("Maths:");
        int m4 = sc.nextInt();
        System.out.print("Hindi:");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 50;
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n==RESULT");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (percentage >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
