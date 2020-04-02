class Test1 {

    private int a;
    private int b;

    void print() {
        System.out.println("First " + a + " " + "Second " + b);
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void sum() {
        System.out.println("Sum = " + (a + b));
    }

    void max() {
        System.out.println("Max = " + (a > b ? a : b));
    }
}