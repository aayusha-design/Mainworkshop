public class CollegeTest {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(101, "Ram Sharma", 50000, "Math", 10000);

        Staff s1 = new Staff(201, "Sita Rai", 30000, 160, 200);

        System.out.println("Teacher Annual Salary: Rs. " + t1.calculateAnnualSalary());

        System.out.println("Staff Salary: Rs. " + s1.calculateSalary());

        System.out.println("College Name: " + Person.collegeName);
    }
}