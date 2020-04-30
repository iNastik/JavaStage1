package training.collections.maintask.flower;

import java.math.BigDecimal;

public class Rose extends Flower {

    public Rose(BigDecimal price, int stemLength, int days, String color) {
        name = "Rose";
        lifetime = 8;
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
                return "strong aroma";
            case FRESH:
                return "delicate aroma";
            case WITHER:
                return "weak aroma";
            case WILTED:
                return "bad smell";
            default:
                return "no aroma";
        }
    }
}
