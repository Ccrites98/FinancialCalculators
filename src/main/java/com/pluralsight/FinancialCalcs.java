package com.pluralsight;
import java.util.*;
public class FinancialCalcs {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");
        System.out.print("Choose which one you'd prefer: ");
        int choice = keyBoard.nextInt();
        switch (choice) {
            case 1:
              MortgageCalculator MyKeyboard = new MortgageCalculator();
               MyKeyboard.main();
                break;
            case 2:
              FutureValue myKeyBoard = new FutureValue();
              FutureValue.main();
                break;
        }

        }







    }









