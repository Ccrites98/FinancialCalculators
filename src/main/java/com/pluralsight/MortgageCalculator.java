package com.pluralsight;
import java.util.*;
//Never forget to set up your stuff.
public class MortgageCalculator {
    public static void main() {
        Scanner keyBoard = new Scanner(System.in);
    //Begin with inputting basic information, move on to calculating functions
        System.out.print("How much do you owe?: ");
        double principal_amount = keyBoard.nextDouble();
        System.out.print("What's the annual rate? ");
        double yearly_interest_rate = keyBoard.nextDouble();
        System.out.print("How long is the loan? Please specify in years: ");
        yearly_interest_rate /= 100;
        double loan_life_years = keyBoard.nextInt();
        //Now the fun begins; trying to get all those numbers they input to add up.
        double int_rate_month = (yearly_interest_rate / 12);
        double payment_rates = (loan_life_years * 12);
        double payment_monthly = principal_amount * (int_rate_month)
                / (Math.pow((1 + payment_rates), (-1 * int_rate_month)));
        double paid_interest = (payment_rates * payment_monthly) - principal_amount;
        //calculator should be functional
        //display down below tho
        System.out.println("Your monthly payment is: $" + payment_monthly);
        System.out.println("Your total interest paid will be:  $" + paid_interest);







    }
}
