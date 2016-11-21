package garden;

import java.util.ArrayList;

public class Garden<E> extends ArrayList<Plantable> implements Plantable {
    public double water(double amount) {
        System.out.printf("\nWatering with %.0f.\n", amount);
        int needy = 0;
        for (Plantable t : this) {
            if (t.needsWater()) {
                needy++;
            }
        }
        double dividedWater = amount / needy;
        for (Plantable t : this) {
            t.water(dividedWater);
            t.printNeed();
        }
        needy = 0;
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
