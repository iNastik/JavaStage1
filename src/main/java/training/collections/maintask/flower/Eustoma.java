package training.collections.maintask.flower;

import java.math.BigDecimal;

public class Eustoma extends Flower {
    public Eustoma(BigDecimal price, int stemLength, int days, String color) {
        name = "Eustoma";
        lifetime = 12;
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
            case FRESH:
                return "delicate aroma";
            default:
                return "weak aroma";
        }
    }
}
