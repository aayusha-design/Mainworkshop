class Person {

    int id;
    String name;
    double basicSalary;

    static String collegeName = "Nepal National College";

    Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
 
    double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}