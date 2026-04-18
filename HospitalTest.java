public class HospitalTest {
    public static void main(String[] args) {

        Patient p1 = new Patient("Ram Sharma", 45, 5, 1500.0);
        Patient p2 = new Patient("Sita Rai", 60, 10, 2000.0);

        p1.displayDetails();
        p2.displayDetails();
    }
}