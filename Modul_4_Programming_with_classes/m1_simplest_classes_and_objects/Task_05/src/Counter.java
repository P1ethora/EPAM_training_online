public class Counter {

    private int max;
    private int min;
    private int current;

    public Counter() {
        max = 30;
        min = 5;
        current = 6;
    }

    public Counter(int max, int min, int start) throws Exception {
        if (max < min)
            throw new Exception("не верно задан диапазон");
        if (start > max || (start < min))
            throw new Exception("не верно задан диапазон");
        this.max = max;
        this.min = min;
        current = start;
    }

    public void getNext() throws Exception {
        current++;
        if (current > max)
            throw new Exception("значение превышено");

    }

    public void getPrior() throws Exception {
        current--;
        if (current < min)
            throw new Exception("значение превышено");

    }

    public int getCurrentValue() {
        return current;
    }

    public int setCurrentValue(int value) throws Exception {
        if (value > max || (value < min))
            throw new Exception("верно укажите диапазон");
        current = value;
        return value;
    }


    public int getMax() {
        return max;
    }

    public int setMax(int value) {
        max = value;
        return value;
    }


    public int getMin() {
        return min;
    }

    public int setMin(int value) {
        min = value;
        return value;
    }
}