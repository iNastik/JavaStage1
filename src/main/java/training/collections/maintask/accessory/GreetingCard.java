package training.collections.maintask.accessory;

import java.math.BigDecimal;

public class GreetingCard extends Accessory {
    private String congratulation = "Congratulations!";

    public GreetingCard(BigDecimal price) {
        this.price = price;
    }

    public String getCongratulation() {
        return congratulation;
    }

    public void setCongratulation(String congratulation) {
        this.congratulation = congratulation;
    }
}
