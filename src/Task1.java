import java.util.Random;

public class Task1 {
    Task1(){
        System.out.println("=======TASK 1 START============");
        int[] years = new int[50];
        Random random = new Random();
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + random.nextInt(26); //2025-2000+1=26
        }
        System.out.println("massive: ");
        for (int i = 0; i < years.length; i++) {
            System.out.print(years[i]+", ");
            if((i+1)%5==0){
                System.out.println();
            }
        }
        System.out.println("after 2015:");
        int countAfter2015 = 0;
        for (int year : years) {
            if (year > 2015) {
                System.out.print(year+", ");
                countAfter2015++;
            }
        }
        if (countAfter2015 == 0) {
            System.out.println("nothing(unreal)");
        }

        double allAge = 0;
        for (int year : years) {
            allAge += (2026 - year);
        }
        double averageAge =  allAge / years.length;
        System.out.println();
        System.out.printf("average age: %.2f", averageAge);
        System.out.println();
        System.out.println("=======TASK 1 END============");
    }
}