package training.cleancode;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import training.cleancode.airport.Airport;
import training.cleancode.models.ClassificationLevel;
import training.cleancode.models.ExperimentalType;
import training.cleancode.models.MilitaryType;
import training.cleancode.planes.ExperimentalPlane;
import training.cleancode.planes.MilitaryPlane;
import training.cleancode.planes.PassengerPlane;
import training.cleancode.planes.Plane;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AirportTest {
    private List<Plane> planes;
    private Airport airport;
    private PassengerPlane planeWithMaxPassengerCapacity;

    @BeforeMethod
    private void init() {
        planes = Arrays.asList(
                new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
                new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
                new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
                new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
                new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
                new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
                new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
                new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
                new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
                new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
                new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
                new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
                new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
                new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
                new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
                new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET)
        );

        airport = new Airport(planes);
        planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);
    }

    @Test
    public void testGetTransportMilitaryPlanes() {
        List<MilitaryPlane> actualPlanes = airport.getTransportMilitaryPlanes();
        List<MilitaryPlane> expectedPlanes = Arrays.asList(
                new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT));
        Assert.assertEquals(expectedPlanes, actualPlanes);
    }

    @Test
    public void testGetBomberMilitaryPlanes() {
        List<MilitaryPlane> actualPlanes = airport.getBomberMilitaryPlanes();
        List<MilitaryPlane> expectedPlanes = Arrays.asList(
                new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
                new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
                new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER));
        Assert.assertEquals(expectedPlanes, actualPlanes);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        PassengerPlane expectedPlane = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertEquals(expectedPlane, planeWithMaxPassengerCapacity);
    }

    @Test
    public void testSortByMaxLoadCapacity() {
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        List<Plane> expected = planes.stream().sorted(Comparator.comparingInt(Plane::getMaxLoadCapacity)).collect(Collectors.toList());
        Assert.assertEquals(expected, planesSortedByMaxLoadCapacity);
    }

    @Test
    public void testExperimentalPlanesClassificationLevel() {
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        Assert.assertFalse(experimentalPlanes.stream().anyMatch((p) -> p.getClassificationLevel().equals(ClassificationLevel.UNCLASSIFIED)));
    }
}
