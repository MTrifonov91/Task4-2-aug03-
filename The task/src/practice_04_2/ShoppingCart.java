/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_04_2;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;        
        
        // Declare and initialize numeric fields: price, tax, and quantity. 
        Double price = 1.99;
        Double tax = (price/100)*20;
        int quantity = 3;
        // Declare a total field but do not initialize total.
        Double total;
        // Modify message to include quantity  
        message = custName +" wants to purchase " +itemDesc + " " + quantity+ "pcs" ; 
        System.out.println(message);
        
        // Calculate total and then print the total cost
        
        total = (price + tax) * quantity;
        System.out.println("Amount to pay: " +total+" USD" );
        
        
    }
}
