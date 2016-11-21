package garden;

import java.util.List;
import java.util.Random;

public class Flower implements Plantable {
    double waterContent = 0;
    String colour;
    boolean need;
    String needS;

    public Flower() {
        this.setColour(getRandomItem(colors));
        printNeed();
    }

    static Random rand = new Random();
    static <T> T getRandomItem(List<T> list) {
        return list.get(rand.nextInt(list.size()));
    }


    public double water(double amount) {
        this.waterContent =+ 0.75*amount;
        return this.waterContent;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean needsWater() {
        this.need = (waterContent < 5);
        return this.need;
    }
    public void printNeed() {
        this.needS = (needsWater()) ? "needs" : "doesn't need";
        System.out.println(String.format("The %s Flower %s water.", colour, needS));
    }
}

