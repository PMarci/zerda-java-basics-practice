package garden;

import java.util.List;
import java.util.Random;

/**
 * Created by posam on 2016-11-21.
 */
public class Flower implements Plantable {
    double waterContent = 0;
    String colour;
    String need;

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

    public double getWaterContent() {
        return waterContent;
    }

    public void setWaterContent(double waterContent) {
        this.waterContent = waterContent;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean needsWater() {
        boolean waterNeed = (this.waterContent <= 5);
        need = (waterNeed) ? "needs" : "doesn't need";
        return waterNeed;
    }
    public void printNeed() {
        System.out.println(String.format("The %s Flower %s water.", colour, need));
    }
}

