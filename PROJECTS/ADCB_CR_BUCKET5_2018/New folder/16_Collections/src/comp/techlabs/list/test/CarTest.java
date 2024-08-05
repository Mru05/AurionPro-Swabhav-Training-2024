package comp.techlabs.list.test;

import java.util.ArrayList;
import java.util.Scanner;

import comp.techlabs.list.Car;

public class CarTest {
    private ArrayList<Car> carList;

    public CarTest() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void displayAllCars() {
        for (Car car : carList) {
            car.displayCarDetails();
            System.out.println();
        }
    }

    public Car findMaxMileageCar() {
        if (carList.isEmpty()) {
            return null;
        }

        Car maxMileageCar = carList.get(0);

        for (Car car : carList) {
            if (car.getMileage() > maxMileageCar.getMileage()) {
                maxMileageCar = car;
            }
        }

        return maxMileageCar;
    }

    public void acceptCarDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cars:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Car ID: ");
            int carId = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Mileage: ");
            double mileage = scanner.nextDouble();

            Car car = new Car(carId, companyName, price, mileage);
            addCar(car);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        carTest.acceptCarDetails();

        System.out.println("\nDetails of all cars:");
        carTest.displayAllCars();

        Car maxMileageCar = carTest.findMaxMileageCar();
        if (maxMileageCar != null) {
            System.out.println("Car with maximum mileage:");
            maxMileageCar.displayCarDetails();
        } else {
            System.out.println("No cars in the list.");
        }
    }
}
