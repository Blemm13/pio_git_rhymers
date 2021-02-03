package edu.kis.vh.nursery.stacks;

public interface ExtractInterface {

    int EMPTY = 0;
    int INITIAL = -1;
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
