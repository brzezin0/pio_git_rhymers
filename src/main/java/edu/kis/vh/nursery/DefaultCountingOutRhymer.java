package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int EMPTY = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int MAX_CAPACITY = 11;
    private final int[] numbers = new int[SIZE];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
