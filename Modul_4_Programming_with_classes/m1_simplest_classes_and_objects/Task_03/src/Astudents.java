public class Astudents {

    public Astudents(Student[] student) {


        for (Student ab : student) {
            int count = 0;
            for (int a : ab.getPerformance()) {
                if (a == 9 || a == 10) {
                    count++;
                }
            }

            if (count == 5) {
                System.out.println("Name - " + ab.getName() + " Group - " + ab.getGroup());
            }
            count = 0;
        }
    }
}