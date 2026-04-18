class Patient {

    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;

    Patient(String name, int age, int days, double charge) {
        patientName = name;
        this.age = age;
        daysAdmitted = days;
        dailyCharge = charge;
    }

    double calculateTotalBill() {
        double total = daysAdmitted * dailyCharge;

        if (daysAdmitted > 7) {
            total = total - (total * 0.10); 
        }

        return total;
    }

    void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: Rs. " + dailyCharge);
        System.out.println("Total Bill: Rs. " + calculateTotalBill());
        System.out.println("......");
    }
}