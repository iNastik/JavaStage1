package training.collections.maintask.flower;

import java.math.BigDecimal;

public abstract class Flower {
    String name;
    String color;
    BigDecimal price;
    int stemLength;
    int days;
    int lifetime;

    public enum FreshnessLevel {
        NEW(0),
        FRESH(1),
        WITHER(2),
        WILTED(3);

        private int level;

        FreshnessLevel(int level) {
            this.level = level;
        }

        public int getLevel() {
            return level;
        }
    }

    public FreshnessLevel getFreshnessLevel() {
        double oldness = (double) days / lifetime;

        if (oldness <= 0.2) {
            return FreshnessLevel.NEW;
        } else if (oldness <= 0.5) {
            return FreshnessLevel.FRESH;
        } else if (oldness < 1) {
            return FreshnessLevel.WITHER;
        } else {
            return FreshnessLevel.WILTED;
        }
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public int getDays() {
        return days;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public abstract String getAroma();

    @Override
    public String toString() {
        return "Flower{" +
                name +
                " " + getFreshnessLevel() +
                " " + color +
                " " + price + "BYN," +
                " stem length is " + stemLength + "cm, " +
                +days + " days out of " +
                lifetime +
                '}';
    }
}
