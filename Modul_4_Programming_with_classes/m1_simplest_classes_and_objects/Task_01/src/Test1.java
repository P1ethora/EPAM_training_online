class Test1 {

    private int a;
    private int b;
    private int sum;

    Test1(int a, int b){
        this.a = a;
        this.b = b;
    }

    Test1(){}

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void sum() {
        sum = a + b;
        System.out.println("Sum = " + sum);
    }

    void max() {
        System.out.println("Max = " + (Math.max(a, b)));
    }

    @Override
    public String toString() {
        return
                "Object {a = " + a + ", b= " + b + "}";
    }
}