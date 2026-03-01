import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    Task4() {
        System.out.println("=======TASK 4 START============");
        List<Car> cars = Arrays.asList(
                new Car("VIN001", "Camry", "Toyota", 2020, 30000, 25000),
                new Car("VIN002", "X5", "BMW", 2022, 10000, 65000),
                new Car("VIN003", "A4", "Audi", 2019, 55000, 22000),
                new Car("VIN004", "Model S", "Tesla", 2023, 5000, 80000),
                new Car("VIN005", "Focus", "Ford", 2018, 60000, 15000),
                new Car("VIN006", "RAV4", "Toyota", 2021, 25000, 27000),
                new Car("VIN007", "X3", "BMW", 2020, 40000, 45000)
        );
        List<Car> lowMileageCars = cars.stream()
                .filter(car -> car.getMileage() < 50000)
                .collect(Collectors.toList());
        System.out.println("mileage < 50 000 km:");
        lowMileageCars.forEach(System.out::println);
        List<Car> top3ByPrice = cars.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("top3ByPrice:");
        top3ByPrice.forEach(System.out::println);

        double avgMileage = cars.stream()
                .mapToInt(Car::getMileage)
                .average()
                .orElse(0.0);
        System.out.printf("avgMileage: %.2f km", avgMileage);
        System.out.println();
        Map<String, List<Car>> carsByManufacturer = cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));
        System.out.println("manufacturer sort:");
        carsByManufacturer.forEach((manufacturer, carList) -> {
            System.out.println(manufacturer + ": " + carList);
        });
        System.out.println("=======TASK 4 END============");

    }
}