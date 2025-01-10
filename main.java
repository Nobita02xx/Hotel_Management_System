import java.util.Scanner;

public class hotel_management_system {
    public static void main(String[] args) {
        System.out.println("hotel");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("How many days to stay: ");
        int days = scanner.nextInt();

        System.out.print("1. Diamond\n");
        System.out.print("2. Gold\n");
        System.out.print("3. Silver\n");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Diamond package");
                System.out.println("Your one-day cost is: 9800");

                int room_cost = days * 9800;
                int gst = (int) (room_cost * 0.18);
                int punjab_tax = (int) (room_cost * 0.02);
                int room_total_cost = room_cost + gst + punjab_tax;
                System.out.println("Total cost is: " + room_total_cost);

                System.out.print("Services available: \n");
                System.out.print("1. Laundry one-day cost is 150\n");
                int Services = scanner.nextInt();
                System.out.print("Enter the number of days for laundry service: ");
                int laundry_days = scanner.nextInt();

                int laundry_cost = laundry_days * 150;

                System.out.println("Room cost: " + room_cost);
                System.out.println("Laundry cost: " + laundry_cost);

                int total_cost = room_total_cost + laundry_cost;
                System.out.println("Total cost is: " + total_cost);
                break;

            case 2:
                System.out.println("You selected Gold package");
                System.out.println("Your one-day cost is: 9500");

                int gold_room_cost = days * 9000;
                int gold_gst = (int) (gold_room_cost * 0.18);
                int gold_punjab_tax = (int) (gold_room_cost * 0.02);
                int gold_room_total_cost = gold_room_cost + gold_gst + gold_punjab_tax;

                System.out.println("Total cost is: " + gold_room_total_cost);
                System.out.print("Services available: \n");
                System.out.print("1. Laundry one-day cost is 150\n");
                System.out.print("Enter the number of days for laundry service: ");
                int gold_laundry_days = scanner.nextInt();

                int gold_laundry_cost = gold_laundry_days * 100;

                System.out.println("Room cost: " + gold_room_cost);
                System.out.println("Laundry cost: " + gold_laundry_cost);

                int gold_total_cost = gold_room_total_cost + gold_laundry_cost;
                System.out.println("Total cost is: " + gold_total_cost);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
