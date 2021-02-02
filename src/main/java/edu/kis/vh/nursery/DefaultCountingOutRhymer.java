package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.ExtractInterface;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private ExtractInterface list = new IntArrayStack();


    public DefaultCountingOutRhymer(){
    }

    public void countIn(int in) {
        list.push(in);
    }

    public boolean callCheck() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    protected int peekaboo() {
        return list.top();
    }

    public int countOut() {
        return list.pop();
    }

    public int getTotal(){
        return list.getSize();
    }

}
