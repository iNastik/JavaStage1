package training.collections.maintask.accessory;

import java.math.BigDecimal;

public abstract class Accessory {
    String color;
    BigDecimal price;

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
