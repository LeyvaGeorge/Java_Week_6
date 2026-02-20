import java.util.Scanner;

public class Automobile {

    String make;
    String model;
    int year;

    public void getUserInput(Scanner scanner) {
        System.out.print("Enter make: ");
        make = scanner.nextLine();

        System.out.print("Enter model: ");
        model = scanner.nextLine();

        System.out.print("Enter year: ");
        year = scanner.nextInt();

    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Automobile car = new Automobile();
        car.getUserInput(scanner);
        car.displayInfo();

        scanner.close();
    }
}