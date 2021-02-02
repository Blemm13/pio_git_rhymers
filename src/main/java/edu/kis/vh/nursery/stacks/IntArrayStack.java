package edu.kis.vh.nursery.stacks;

public class IntArrayStack implements ExtractInterface {

    private final int DEFAULT_SIZE = 12;
    private final int[] numbers = new int[DEFAULT_SIZE];

    public int getTotal() {
        return total;
    }

    public int total = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    @Override
    public void push(int i) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return total == DEFAULT_SIZE-1;
    }

    @Override
    public int top() {
        return 0;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
