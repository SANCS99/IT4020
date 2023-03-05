package com.mtit.service;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish {

	@Override
	public String publishService() {
		
		Scanner scanner = new Scanner(System.in);
		String yes="y";
		
		String[][] table = new String[10][5];
	    int i = 0;
	    int ii = 0;
		
	    
	    System.out.println("*********************************************************");
	    System.out.println("*           Welcome to the House Architecture           *");
	    System.out.println("*********************************************************");
	    
	    
		System.out.print("Do you wish to estimate the number of tiles your room will need? (yes=y & No=n): ");
		String y = scanner.nextLine();

		while (yes.equals(y)) {
	        System.out.print("Type of your room: ");
	        String type = scanner.nextLine();

	        System.out.print("Enter the length of the room in feet: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the room in feet: ");
	        double width = scanner.nextDouble();

	        System.out.print("Enter the size of each tile in inches: ");
	        double tile = scanner.nextDouble();

	        // Convert the tile size from inches to feet
	        tile = tile / 12.0;

	        // Calculate the area of the room
	        double area = length * width;

	        // Calculate the number of tiles required
	        double tiles = Math.ceil(area / tile);

	        System.out.println("The room("+type+") is " + length + " feet by " + width + " feet.");
	        System.out.println("Each tile is " + (tile * 12) + " inches by " + (tile * 12) + " inches.");
	        System.out.println("You will need " + tiles + " tiles to cover the floor.\n");

	        // Store the results in the table
	        table[i][0] = type;
	        table[i][1] = String.valueOf(length);
	        table[i][2] = String.valueOf(width);
	        table[i][3] = String.valueOf(tiles);
	        i++;

	        // Consume the leftover newline character
	        scanner.nextLine();

	        System.out.println("Do you want to determine how many tiles you'll need for a different room? (yes=y & No=n): ");
	        String x = scanner.nextLine();

	        y=x;

	        if (i >= 10) {
	            System.out.println("Maximum limit of rooms reached.");
	            break;
	        }
	    }

	    // Display the table
	    System.out.println("Room Type\tLength (ft)\tWidth (ft)\tTiles Needed");
	    for (int j = 0; j < i; j++) {
	        System.out.printf("%-10s\t%-10s\t%-10s\t%-10s%n", table[j][0], table[j][1], table[j][2], table[j][3]);
	    }

		
		System.out.print("Are you curious about how many liters were used to paint your room? (yes=y & No=n): ");
		String l = scanner.nextLine();

		while (yes.equals(l)) {
		    // ask user for room dimensions
		    System.out.print("Type of your room: ");
		    String type = scanner.nextLine();

		    System.out.print("Enter the length of the room in meters: ");
		    double length = scanner.nextDouble();

		    System.out.print("Enter the width of the room in meters: ");
		    double width = scanner.nextDouble();

		    System.out.print("Enter the height of the room in meters: ");
		    double height = scanner.nextDouble();

		    // calculate area of walls to be painted
		    double area = 2 * (length + width) * height;

		    // calculate liters of paint needed
		    double litersNeeded = area / 10.0;

		    // display result to user
		    System.out.printf("You will need %.2f liters of paint to paint the room ("+type+").%n", litersNeeded);

		    // Store the results in the table
		    table[i][0] = type;
		    table[i][1] = String.valueOf(length);
		    table[i][2] = String.valueOf(width);
		    table[i][3] = String.format("%.2f", litersNeeded);
		    ii++;

		    // Consume the leftover newline character
		    scanner.nextLine();

		    System.out.print("Do you want to know how many liters were required to paint a different room? (yes=y & No=n): ");
		    String x = scanner.nextLine();

		    l = x;

		    if (ii >= 10) {
		        System.out.println("Maximum limit of rooms reached.");
		        break;
		    }
		}

		// Display the table
		System.out.println("\nRoom Type\tLength (m)\tWidth (m)\tLiters Needed");
		for (int j = 0; j < ii; j++) {
		    System.out.printf("%-10s\t%-10s\t%-10s\t%-10s%n", table[j][0], table[j][1], table[j][2], table[j][3]);
		}
    
		
		return "Execute the Publish service of Service publisher";
	}
	
	

}
