package ait.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int currPos;
    private int quantity;
    private int a = 1;
    private int b = 1;

    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean hasNext() {
        return currPos < quantity;
    }

    @Override
    public Integer next() {
        if (currPos > 1) {
            b = a + b;
            a = b - a;
        }
        currPos++;
        return b;
    }
}
