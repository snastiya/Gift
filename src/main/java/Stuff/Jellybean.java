package Stuff;

/**
 * Created by ASudarenko on 21.10.2017.
 */
public class Jellybean extends Stuff {
    private String flavor;

    public Jellybean(String brand, int weight, int price, String flavor) {
        super(brand, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Jellybean + [" + super.toString() + ", flavor = " + flavor + "]";
    }
}
