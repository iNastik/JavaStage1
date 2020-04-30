package training.collections.maintask.bouquet;

import training.collections.maintask.accessory.Accessory;
import training.collections.maintask.flower.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    public BigDecimal getPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Flower flower : flowers) {
            totalPrice = totalPrice.add(flower.getPrice());
        }

        for (Accessory accessory : accessories) {
            totalPrice = totalPrice.add(accessory.getPrice());
        }

        return totalPrice;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void deleteFlower(Flower flower) {
        flowers.remove(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void deleteAccessory(Accessory accessory) {
        accessories.remove(accessory);
    }

    public Flower[] getFlowers() {
        return flowers.toArray(new Flower[flowers.size()]);
    }

    public Accessory[] getAccessories() {
        return accessories.toArray(new Accessory[accessories.size()]);
    }

    public void sortFlowers(Comparator<Flower> comparator) {
        Collections.sort(flowers, comparator);
    }

    public List<Flower> sortFlowersByStemLength(int minLength, int maxLength) {
        List<Flower> sortedFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                sortedFlowers.add(flower);
            }
        }
        return sortedFlowers;
    }
}
