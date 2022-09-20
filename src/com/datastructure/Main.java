package com.datastructure;
import java.util.Scanner;
/*
cash counter
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("People in line");
        CashCounter counter = new CashCounter();
        counter.enqueue(1500);
        counter.enqueue(400);
        counter.enqueue(200);
        counter.enqueue(1500);
        counter.dequeue();
        System.out.println(counter.noOfPersonInQueue());

    }

}


