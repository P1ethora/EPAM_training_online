public class State {

    private String name;
    private Region[] regions;
    private double areaState;

    public State(String name, Region... regions) {

        this.name = name;
        this.regions = regions;

    }

    public void printCapital() {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                if (district.getCity().isCapital()) {
                    System.out.println("Столица - " + district.getCity().getName());
                }
            }
        }
    }

    public void printNumberRegion() {
        System.out.println("Количество областей - " + (regions.length));
    }

    public void printStateArea() {

        for (Region region : regions) {
            areaState += region.getArea();
        }
        System.out.println("Площадь - " + areaState);
    }

    public void printRegionalCenter() {
        System.out.println("Областные центры");
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                System.out.println(district.getCity().getName());
            }
        }
    }
}