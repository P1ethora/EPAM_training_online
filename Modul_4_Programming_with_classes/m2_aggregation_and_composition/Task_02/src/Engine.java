public class Engine {

    private boolean performance;
    private final String volume;

    public Engine(String volume) {
        this.volume = volume;
    }

    public boolean performance(boolean performance) {

        this.performance = performance;
        return this.performance;
    }

    public String getVolume() {
        return volume;
    }
}