package com.pluralsight;
import java.util.*;
//no notes needed for the setup right?
public class FutureValue {
    public static void main() {
        Scanner keyBoard = new Scanner(System.in);
//input the basic information first, define, then move on.
        System.out.print("Input your deposit amount please: $");
        double principal = keyBoard.nextDouble();
        System.out.print("Please put in your interest rate: ");
        double yearly_int_rate = keyBoard.nextDouble() / 100;
        System.out.print("Input number of years please: ");
        int years = keyBoard.nextInt();
        //Time to go back to the future (value)
        double value_future = calculateFutureValue(principal, yearly_int_rate, years);
        double int_total = value_future - principal;
        //Return should be below
        System.out.println("The CD value will be: $" + value_future);
        System.out.println("Your total interest earned thus far is : $" + int_total);
    }
    // FORMULA 4 MATH: 10,000 (1+0.025 / 365) ^ (365*5)
    private static double calculateFutureValue(double principal, double yearly_int_rate, int years) {
        return principal * Math.pow((1 + yearly_int_rate / 365), years * 365); }
    }