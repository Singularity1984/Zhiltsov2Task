import java.util.*;

class Car implements Comparable<Car> {
    public Car(String vin, String model, String manufacturer, int year, int mileage, double price) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    private String vin;
    private String model;
    private String manufacturer;
    private int year;
    private int mileage;
    private double price;

    public String getVin() { return vin; }
    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public int getYear() { return year; }
    public int getMileage() { return mileage; }
    public double getPrice() { return price; }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    public int hashCode() {
        return Objects.hash(vin);
    }

    public int compareTo(Car other) {
        return Integer.compare(other.year, this.year);
    }

    public String toString() {
        return String.format("Car{vin='%s', model='%s', year=%d, price=%.2f}", vin, model, year, price);
    }
}