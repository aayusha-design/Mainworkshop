import java.util.Scanner;

public class GPAToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Invalid GPA! Please enter between 0.0 and 4.0.");
        } else {
            String grade;

            if (gpa >= 3.7) grade = "A";
            else if (gpa >= 3.3) grade = "B+";
            else if (gpa >= 3.0) grade = "B";
            else if (gpa >= 2.7) grade = "C+";
            else if (gpa >= 2.0) grade = "C";
            else grade = "F";

            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}