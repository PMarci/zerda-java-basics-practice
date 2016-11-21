package garden;

import java.util.List;
import java.util.Random;

public class Tree implements Plantable {
    double waterContent = 0;
    String colour;
    boolean need;
    String needS;

    public Tree() {
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
        this.need = (waterContent < 10);
        return this.need;
    }
    public void printNeed() {
        this.needS = (needsWater()) ? "needs" : "doesn't need";
        System.out.println(String.format("The %s Tree %s water.", colour, needS));
    }
}
