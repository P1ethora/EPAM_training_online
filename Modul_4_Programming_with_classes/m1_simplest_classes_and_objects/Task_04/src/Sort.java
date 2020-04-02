import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    private Train[] trains;

    public Sort(Train[] trains) {
        this.trains = trains;
    }

    public void sortNumber() {
        Arrays.sort(trains, Comparator.comparing(Train::getNumber));
        for (Train a : trains) System.out.println(a);
    }

    public void sortDestination() {
        Arrays.sort(trains, Comparator.comparing(Train::getDestination)
                .thenComparing(Train::getDepartureTime));
        for (Train a : trains) System.out.println(a);
    }
}