import Stuff.Stuff;
import Stuff.Candy;
import Stuff.Jellybean;
import Stuff.Marshmallow;

/**
 * Created by ASudarenko on 18.10.2017.
 */
public class Gift {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Чупа-чупс", 15, 20, "Леденец на палочке");
        Candy candy2 = new Candy("Орбит", 35, 50, "Леденцы");
        Jellybean jellybean1 = new Jellybean("Мармелад Мишки", 100, 80, "Клубника");
        Jellybean jellybean2 = new Jellybean("Мармелад Червячки", 60, 50, "Апельсин");
        Marshmallow marshmallow1 = new Marshmallow("Бон-пари", 50, 100, "Белый");
        Marshmallow marshmallow2 = new Marshmallow("Харибо", 100, 150, "Красный");
        Stuff [] gift = {candy1, candy2, jellybean1, jellybean2, marshmallow1, marshmallow2};
        for (Stuff someStuff: gift) {
            System.out.println(someStuff.toString());

            }
        int total_price = 0;
        int total_weight = 0;

        for(Stuff someStuff: gift) {total_price = total_price + someStuff.price;
            total_weight = total_weight + someStuff.weight;
            System.out.println("Общая стоимость подарка = " + total_price);
            System.out.println("Общий вес подарка = " + total_weight);
        }
        }

        }


