package corejava1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToyExample {
	//Declaring Two Dimensional Array
	    String[][] toys = new String [6][6];

	    //Default Constructor
	    ToyExample()
	    {

	    toys [0][0]="1";
	    toys[0][1]="Rubic Cube";

	    toys [1][0]="2";
	    toys [1][1] ="Batminton";

	    toys [2][0]="3";
	    toys [2][1]="Magic Ball";

	    toys [3][0]="4";
	    toys [3][1]="Cricket Bat";

	    toys [4][0]="5";
	    toys[4][1]="Robo Fighter";
	    
	    toys [5][0]="6";
	    toys[5][1]="Sudoku";

	    }
//Creating Function For Switch Case
	    public static String getToy(int price)
	    {
//Price For Toys 
	        String ToyShop;
	        switch(price)
	        {
	            case 350: 
	                ToyShop = "Rubic Cube";
	                return ToyShop;
	            
	            case 450:
	                ToyShop = "Batminton";
	                return ToyShop;
	                
	            case 300:
	                ToyShop = "Magic Ball";
	                return ToyShop;
	                
	            case 550:
	                ToyShop = "Cricket Bat";
	                return ToyShop;
	                
	            case 750:
	                ToyShop = "Robo Fighter";
	                return ToyShop;
	            case 850:
	                ToyShop = "Sudoku";
	                return ToyShop;
	                
	            default:
	                ToyShop = "No Toys Available in this Range";
	                return ToyShop;
	        }
	    }

	    public static void main(String[] args) {
	    	System.out.println("Enter The Price For Toys: ");
	    	//Creating Object Of Scanner Class
	        Scanner sc = new Scanner (System.in); 
	        //Taking Input From User
	        int price = sc.nextInt ();
	        //Calling Price Function 
	        System.out.println(getToy(price));

	        sc.close();
	    }
	}

