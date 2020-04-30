package training.collections.maintask;

import training.collections.maintask.accessory.GreetingCard;
import training.collections.maintask.accessory.SatinRibbon;
import training.collections.maintask.accessory.WrappingPaper;
import training.collections.maintask.bouquet.Bouquet;
import training.collections.maintask.flower.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rose whiteRose = new Rose(new BigDecimal("5.5"), 70, 9, "white");
        Rose pinkRose = new Rose(new BigDecimal("5.5"), 70, 4, "pink");
        Peony lightPinkPeony = new Peony(new BigDecimal("12"), 60, 4, "light pink");
        Peony deepPinkPeony = new Peony(new BigDecimal("11"), 60, 2, "deep pink");
        Eustoma lilacEustoma = new Eustoma(new BigDecimal("5"), 50, 12, "lilac");
        Chrysanthemum gazelleChrysanthemum = new Chrysanthemum(new BigDecimal("4.5"), 70, 2, "white");
        Chamomile gardenChamomile = new Chamomile(new BigDecimal("6"), 55, 1, "white");
        ChamomilePyrethrum pinkChamomile = new ChamomilePyrethrum(new BigDecimal("6"), 65, 5, "pink");

        SatinRibbon lilacRibbon = new SatinRibbon("lilac", new BigDecimal("1.2"));
        SatinRibbon pinkRibbon = new SatinRibbon("pink", new BigDecimal("1.2"));
        WrappingPaper wrappingPaper = new WrappingPaper("brown", new BigDecimal("2.2"));
        GreetingCard littleCard = new GreetingCard(new BigDecimal("2"));
        GreetingCard classicCard = new GreetingCard(new BigDecimal("2.3"));

        Bouquet summerBouquet = new Bouquet();

        summerBouquet.addFlower(whiteRose);
        summerBouquet.addFlower(gazelleChrysanthemum);
        summerBouquet.addFlower(pinkRose);
        summerBouquet.addFlower(pinkChamomile);
        summerBouquet.addFlower(lilacEustoma);
        summerBouquet.addFlower(gardenChamomile);
        summerBouquet.addFlower(lightPinkPeony);

        summerBouquet.addAccessory(pinkRibbon);
        summerBouquet.addAccessory(littleCard);

        System.out.println(summerBouquet.getPrice());
        System.out.println();

        Comparator<Flower> comparator = new Comparator<Flower>() {
            @Override
            public int compare(Flower flower1, Flower flower2) {
                return flower1.getFreshnessLevel().getLevel() - flower2.getFreshnessLevel().getLevel();
            }
        };

        summerBouquet.sortFlowers(comparator);
        System.out.println(Arrays.toString(summerBouquet.getFlowers()));

        List<Flower> sortedFlowers = summerBouquet.sortFlowersByStemLength(50, 60);
        System.out.println(sortedFlowers);
    }
}