import java.util.Scanner;

public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Invalid GPA! Please enter between 0.0 and 4.0.");
        } else {

            if (gpa >= 3.5) {
                System.out.println("Eligible for Full Scholarship");
            } else if (gpa >= 3.0) {
                System.out.println("Eligible for Partial Scholarship");
            } else {
                System.out.println("Not Eligible for Scholarship");
            }
        }

        sc.close();
    }
}