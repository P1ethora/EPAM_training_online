public class City {

    public static int id = 0;
    private int cityId;
    private String name;
    private boolean capital = false;

    public City(String name) {
        this.name = name;
        cityId = id++;
    }

    public City(String name, boolean capital) {
        this.name = name;
        this.capital = capital;
        cityId = id++;

    }

    public boolean isCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }
}