import java.util.Scanner;

public class BusVoyager {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double speed = 0.0; 
    double distance = 0.0; 
    double toa = 0.0; 

    System.out.println(">> Welcome to Cebu South Bus Terminal! <<");
    System.out.println("Your destination starts here in Cebu City - South Bus Terminal");
    System.out.println("\nPress 1 = Route 1 / 2 = Route 2 / 3 = Route 3: ");

    int routeChoice = scanner.nextInt();

    if (routeChoice == 1) {
      System.out.println("You have chosen Route 1: Cebu City to Minganilla to San Fernando to Carcar to Barili to Dumanjug to Alcantara to Moalboal");
    } else if (routeChoice == 3) {
      System.out.println("You have chosen Route 3: Cebu City to Minganilla to San Fernando to Carcar to Sibonga to Argao to Ronda to Alcantara to Moalboal");
      System.out.println("Please enter the distance of the route in km: ");
      distance = scanner.nextDouble(); 

      double distanceToBarili = 14.2;
      double toaToBarili = distanceToBarili / speed;

      double distanceToDumanjug = 15.0;
      double toaToDumanjug = toaToBarili + (distanceToDumanjug / speed);

      double distanceToAlcantara = 12.0;
      double toaToAlcantara = toaToDumanjug + (distanceToAlcantara / speed);

      double distanceToMoalboal = 10.0;
      double toaToMoalboal = toaToAlcantara + (distanceToMoalboal / speed);

      System.out.println("Your estimated time of arrival in Barili is " + toaToBarili + " hours.");
      System.out.println("Your estimated time of arrival in Dumanjug is " + toaToDumanjug + " hours.");
      System.out.println("Your estimated time of arrival in Alcantara is " + toaToAlcantara + " hours.");
      System.out.println("Your estimated time of arrival in Moalboal is " + toaToMoalboal + " hours.");
    } else {
      System.out.println("Invalid route choice.");
    }
  }
}