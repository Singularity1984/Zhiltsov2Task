import java.util.*;

public class Task2 {
    Task2() {
        System.out.println("=======TASK 2 START============");
        List<String> models = new ArrayList<>(Arrays.asList(
                "Toyota Camry", "BMW X5", "Tesla Model S",
                "Audi 100", "Toyota Camry", "Tesla Model 3",
                "BMW X5", "Ford Focus", "Z-car"
        ));
        Set<String> unModels = new LinkedHashSet<>(models);
        models = new ArrayList<>(unModels);
        for (int i = 0; i < models.size(); i++) {
            if (models.get(i).contains("Tesla")) {
                models.set(i, "ELECTRO_CAR");
            }
        }
        models.sort(Comparator.reverseOrder());
        System.out.println("sorted:");
        for (String model : models) {
            System.out.println(model);
        }
        Set<String> modelSet = new HashSet<>(models);
        System.out.println("Set: " + modelSet);
        System.out.println("=======TASK 2 END============");
    }
}