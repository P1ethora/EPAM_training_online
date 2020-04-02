public class District {

    private String name;
    private City city;

    public District(String name, City city) {

        this.name = name;
        this.city = city;

    }

    public City getCity() {
        return city;
    }
}