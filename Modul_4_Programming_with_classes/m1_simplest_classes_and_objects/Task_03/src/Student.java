public class Student {

    private String name;
    private String group;
    private int[] performance;

    public Student(String name, String group, int[] performance) {
        this.name = name;
        this.group = group;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getPerformance() {
        return performance;
    }

}