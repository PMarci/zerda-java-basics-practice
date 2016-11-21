package garden;

import java.util.ArrayList;
import java.util.Arrays;

public interface Plantable {
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("white", "blue", "red", "purple", "black", "green", "yellow"));
    double waterContent = 20;
    String colour = "default";
    String need = "needs";
    double water(double amount);
    boolean needsWater();
    void printNeed();

}
