// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      //System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
    // NEW SCANNER
    Scanner keyboard = new Scanner (System.in);

    String firstName;
    String itemOrder;
    String frostingType;
    String fillingType;
    String toppings;
    String input;

    double cost = 15.00; // COST OF CAKE AND CUPCAKES
    final double TAX_RATE = .08;  // SALES TAX RATE
    double tax; // AMOUNT OF TAX
	  

	 
    // Introduce shop and prompt user to input first name
    System.out.println("Welcome to Java's Cake & Cupcake Shop!");
    System.out.println("We make custom cakes with our secret cake batter!");
      
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
    System.out.print("What is your first name? ");
    firstName = keyboard.nextLine();

    System.out.print(firstName + ", please see our MENU below: ");
    System.out.print("\n"); // skips a line	  

   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}