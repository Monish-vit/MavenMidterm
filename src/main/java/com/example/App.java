package com.example;

public class App {
    public static void main(String[] args) {
        double units = 250;
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: " + calculateBill(units));
    }

    public static double calculateBill(double units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = (100 * 1.50) + (units - 100) * 3.00;
        } else {
            bill = (100 * 1.50) + (200 * 3.00) + (units - 300) * 5.00;
        }
        double tax = bill * 0.10; 
        return bill + tax;
    }
}
