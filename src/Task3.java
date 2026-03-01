import java.util.*;

public class Task3 {
    Task3() {
        System.out.println("=======TASK 3 START============");

        Set<Car> carSet = new HashSet<>();

        Car car1 = new Car("VIN123", "Camry", "Toyota", 2020, 15000, 25000);
        Car car2 = new Car("VIN456", "X5", "BMW", 2022, 5000, 60000);
        Car car3 = new Car("VIN123", "Corolla", "Toyota", 2018, 30000, 18000);

        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);

        System.out.println("size set: " + carSet.size());//2
        System.out.println("set:");
        for (Car car : carSet) {
            System.out.println(car);
        }

        List<Car> carList = new ArrayList<>(carSet);
        Collections.sort(carList);
        System.out.println("sorted:");
        for (Car car : carList) {
            System.out.println(car);

        }
        System.out.println("=======TASK 3 END============");

    }
}