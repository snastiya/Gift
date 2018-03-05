package Stuff;

/**
 * Created by ASudarenko on 21.10.2017.
 */
public class Stuff {
    private String brand;
    public int weight;
    public int price;

    public Stuff(String brand, int weight, int price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", weight = " + weight + ", price = " + price;
    }
}
