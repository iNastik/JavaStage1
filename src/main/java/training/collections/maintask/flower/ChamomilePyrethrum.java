package training.collections.maintask.flower;

import java.math.BigDecimal;

public class ChamomilePyrethrum extends Chamomile {
    public ChamomilePyrethrum(BigDecimal price, int stemLength, int days, String color) {
        super(price, stemLength, days, color);
        name = "Chamomile Pyrethrum";
        lifetime = 9;
        this.price = price;
        this.days = days;
        this.color = color;
        this.stemLength = stemLength;
    }
}
