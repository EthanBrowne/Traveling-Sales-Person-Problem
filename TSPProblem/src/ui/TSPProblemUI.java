package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Algorithm.TSPAlgorithm;
import data.Point;

/**
 * File contains the main method and deals with the GUI
 */
public class TSPProblemUI {
	/**
	 * Main method
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Point> list = new ArrayList<Point>();
		 while (true) {
	            System.out.print("1. Enter a Point\n2. Remove a Point\n3. Find the Shortest Path between all Points\n4. Exit\n> ");
	            switch (scanner.nextLine()) {
	                case "1":
	                	if (list.size() < 15) {
	                		System.out.print("Enter x value\n> ");
		                	int x = scanner.nextInt();
		                	System.out.print("Enter y value\n> ");
		                	int y = scanner.nextInt();
		                	scanner.nextLine();
		                	list.add(new Point(x, y));
		                	System.out.println("Point added\n");
	                	} else {
	                		System.out.println("To many points\n");
	                	}
	                	
	                    break;
	                case "2":
	                	System.out.print("Enter x value\n> ");
	                	int x = scanner.nextInt();
	                	System.out.print("Enter y value\n> ");
	                	int y = scanner.nextInt();
	                	scanner.nextLine();
	                	for (int i = 0; i < list.size(); i++) {
	                		if (list.get(i).getxCord() == x && list.get(i).getyCord() == y) {
	                			list.remove(i);
	                			System.out.println("Point removed\n");
	                			break;
	                		} else if (i == list.size() -1) {
	                			System.out.println("Point not found\n");
	                		}
	                	}
	                    break;
	                case "3":
	                	TSPAlgorithm alg = new TSPAlgorithm(list);
	                	System.out.println(alg.algorithm());
	                	break;
	                case "4":
	                	System.out.println("Exiting program.");
	                    scanner.close();
	                    System.exit(0);
	                	break;
	                default:
	                	System.out.println("Enter a number 1 - 4");
	            }
	        }
	}

}
