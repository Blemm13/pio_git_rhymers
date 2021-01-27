package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int DEFAULT_SIZE = 12;
    private final int[] numbers = new int[DEFAULT_SIZE];
    private final int INITIAL = -1;
    private final int EMPTY = -1;
    private IntArrayStack arrayStack;

    public int total = INITIAL;

    public DefaultCountingOutRhymer(){
        this.arrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        arrayStack.countIn(in);
    }

    public boolean callCheck() {
        return arrayStack.callCheck();
    }

    public boolean isFull() {
        return arrayStack.isFull();
    }

    protected int peekaboo() {
        return arrayStack.peekaboo();
    }

    public int countOut() {
        return arrayStack.countOut();
    }

    public int getTotal(){
        return arrayStack.getTotal();
    }

}
