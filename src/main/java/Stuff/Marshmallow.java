package Stuff;

/**
 * Created by ASudarenko on 21.10.2017.
 */
public class Marshmallow extends Stuff {
    private String colour;

    public Marshmallow(String brand, int weight, int price, String colour) {
        super(brand, weight, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Marshmallow + [" + super.toString() + ", colour = " + colour + "]";
    }
}
