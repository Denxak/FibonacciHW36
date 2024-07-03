package ait.fibonacci;

import ait.fibonacci.model.Fibonacci;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        int sum = 0;
        // TODO print all numbers, and calculate sum
        // 1, 1, 2, 3, 5, 8, 13, 21
        // sum = 54

        for (int num : fibonacci) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
