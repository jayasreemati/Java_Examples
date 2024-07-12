// LargestNumberFinder.java
package com.examples;
public class LargestNumberFinder {
    public double findLargest(double firstNumber, double secondNumber, double thirdNumber) {
        double largest; // Declare the variable largest only once

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largest = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largest = secondNumber;
        } else {
            largest = thirdNumber;
        }
        
        return largest;
    }
}




