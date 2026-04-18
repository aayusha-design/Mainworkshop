import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is the customer a local? (yes/no): ");
        String localInput = sc.next();

        System.out.print("Is it night time? (yes/no): ");
        String nightInput = sc.next();

        boolean isLocal = localInput.equalsIgnoreCase("yes") ? true : false;
        boolean isNight = nightInput.equalsIgnoreCase("yes") ? true : false;

        double baseFare = 50;
        double perKmRate = 20;
        double perMinRate = 2;
        double discountRate = 0.10;
        double nightSurcharge = 0.20;
        double longDistanceThreshold = 5;

        double fare = baseFare + (distance * perKmRate) + (time * perMinRate);


        fare = (isLocal && distance > longDistanceThreshold) 
                ? fare * (1 - discountRate) 
                : fare;

        fare = isNight 
                ? fare * (1 + nightSurcharge) 
                : fare;

        System.out.println("Final Fare: Rs. " + Math.round(fare));

        sc.close();
    }
}