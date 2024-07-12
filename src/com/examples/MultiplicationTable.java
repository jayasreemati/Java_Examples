package com.examples;
// MultiplicationTable.java
public class MultiplicationTable {
    public void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
