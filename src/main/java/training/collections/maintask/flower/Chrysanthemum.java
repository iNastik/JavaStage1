package training.collections.maintask.flower;

import java.math.BigDecimal;

public class Chrysanthemum extends Flower {
    public Chrysanthemum(BigDecimal price, int stemLength, int days, String color) {
        name = "Chrysanthemum";
        lifetime = 16;
        this.price = price;
        this.days = days;
        this.color = color;
        this.stemLength = stemLength;
    }

    @Override
    public String getAroma() {
        FreshnessLevel freshnessLevel = getFreshnessLevel();

        switch (freshnessLevel) {
            case NEW:
                return "delicate aroma";
            default:
                return "no aroma";
        }
    }
}
