package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int DEFAULT_SIZE = 12;
    private final int[] NUMBERS = new int[DEFAULT_SIZE];
    private final int INITIAL = -1;
    private final int EMPTY = -1;

    public int total = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == DEFAULT_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
