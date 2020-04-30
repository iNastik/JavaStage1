package training.collections.maintask.flower;

import java.math.BigDecimal;

public class Chamomile extends Flower {
    public Chamomile(BigDecimal price, int stemLength, int days, String color) {
        name = "Chamomile";
        lifetime = 9;
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
                return "weak aroma";
            default:
                return "bad smell";
        }
    }
}
