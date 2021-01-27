package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private final int DEFAULT_SIZE = 12;
    private final int[] numbers = new int[DEFAULT_SIZE];
    private final int INITIAL = -1;
    private final int EMPTY = -1;
    private IntLinkedList intLinkedList;

    public int total = INITIAL;

    public DefaultCountingOutRhymer(){
        this.intLinkedList = new IntLinkedList();

    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
//        return intLinkedList.isFull();
        return false;
    }

    protected int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

    public int getTotal(){
        if(intLinkedList.getSizeOfList() != 0)
            return EMPTY;
        else
            return intLinkedList.getSizeOfList()-1;

    }

}
