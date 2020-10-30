package main.com.plethora.task1;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
class Test1 {

    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    private int max() {
        return Math.max(a, b);
    }

    public void printAll() {
        System.out.println(toString() + " sum = " + sum() + " max = " + max());
    }

}