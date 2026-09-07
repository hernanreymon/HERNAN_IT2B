import java.util.Scanner;

public class Activity2 {

    public void cinemaTicket() {

        Scanner sc = new Scanner(System.in);

        double regularPrice = 350.00;
        double threeDPrice = 400.00;
        double imaxPrice = 450.00;
        double peakHourFee = 50.00;

        System.out.println();
        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.print(
                "Select Format (1: REGULAR, 2: 3D, 3: IMAX): "
        );
        int format = sc.nextInt();

        System.out.print(
                "Enter Screening Hour (24-Hour Format, e.g., 18): "
        );
        int hour = sc.nextInt();

        String formatName;
        double basePrice;

        if (format == 1) {

            formatName = "REGULAR";
            basePrice = regularPrice;

        } else if (format == 2) {

            formatName = "3D";
            basePrice = threeDPrice;

        } else if (format == 3) {

            formatName = "IMAX";
            basePrice = imaxPrice;

        } else {

            System.out.println("Invalid format selected.");
            return;
        }

        // Peak hours: 5 PM to 8 PM
        double fee = 0;

        if (hour >= 17 && hour < 20) {
            fee = peakHourFee;
        }

        double totalCost = basePrice + fee;

        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + formatName);
        System.out.printf("Base Ticket Price: PHP %.2f%n", basePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", fee);
        System.out.println("-------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", totalCost);
        System.out.println("STATUS:            SEAT RESERVED");
    }
}