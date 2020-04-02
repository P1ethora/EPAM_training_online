public class Region {

    private String name;
    private District[] districts;
    private double area;
    public static int id = 0;
    private int RegionId = 0;

    public Region(String name, double area, District... districts) {

        this.area = area;
        this.name = name;
        this.districts = districts;
        RegionId = id++;
    }

    public District[] getDistricts() {
        return districts;
    }

    public int getNumberDistrict() {
        return districts.length;
    }

    public double getArea() {
        return area;
    }
}