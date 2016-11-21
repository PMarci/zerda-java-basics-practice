package garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by posam on 2016-11-21.
 */
public class Garden<E> extends ArrayList<Plantable> implements Plantable {
    static ArrayList<String> colors = new ArrayList<>(Arrays.asList("white", "blue", "red", "purple", "black", "green", "yellow"));

    static Random rand = new Random();
    static <T> T getRandomItem(List<T> list) {
        return list.get(rand.nextInt(list.size()));
    }


    public double water(double amount) {
        System.out.printf("\nWatering with %f.\n", amount);
        int needy = 0;
        for (Plantable t : this) {
            if (t.needsWater());
                needy++;
        }
        double dividedWater = amount / needy;
        for (Plantable t : this) {
            t.water(dividedWater);
            t.printNeed();
        }

        return dividedWater;
    }

    public boolean needsWater() {
        return false;
    }

    @Override
    public void printNeed() {
        for (Plantable t : this)
        t.printNeed();
    }

    private Garden(int treeNr, int flowNr) {
        for (int i= 0; i < treeNr; i++) {
            Tree tree = new Tree();
            this.add(tree);
        }
        for (int i= 0; i < flowNr; i++) {
            Flower flower = new Flower();
            this.add(flower);
        }

    }

    public static void main(String[] args) {
    Garden garden = new Garden(2, 2);
        garden.water(40);
        garden.water(70);
    }
}
