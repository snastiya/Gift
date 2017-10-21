package Stuff;

/**
 * Created by ASudarenko on 21.10.2017.
 */
public class Candy extends Stuff{
    private String type;

    public Candy(String brand, int weight, int price, String type) {
        super(brand, weight, price);

        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", type = " + type + "]";
    }
}
