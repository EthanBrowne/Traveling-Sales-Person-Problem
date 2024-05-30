package Algorithm;

import java.util.ArrayList;

import data.Point;
/**
 * Computes the Traveling Sales Person Algorithm
 * Will take O(n!) runtime
 */
public class TSPAlgorithm {
	
	/** The list of points in the TSP problem */
	private ArrayList<Point> list;
	/** The route that is the most efficient */
	private ArrayList<Point> route;
	/** The distance through the route */
	private double distance;
	/** The time the algorithm took */
	private double time;
	/** Num of routes checked */
	private Long numChecked;
	
	/**
	 * Constructor for the Algorithm Class
	 * @param list the list of points in the TSP problem
	 */
	public TSPAlgorithm(ArrayList<Point> list) {
		this.list = list;
		route = null;
		numChecked = (long) 0;
	}
	
	/**
	 * The TSP algorithm
	 */
	public String algorithm() {
		if (list.size() > 2) {
			long startTime = System.currentTimeMillis();
			algorithmHelper(0, new ArrayList<Point>(), 0);
			long endTime = System.currentTimeMillis();
			time = endTime - startTime;
			return print();
		} else {
			return "Must have more than 2 points\n";
		}
		
	}
	
	/**
	 * Helper method for the TSPAlgorithm. 
	 * @param index the index in the list
	 * @param testRoute the route that is being tested
	 * @param currentDistance distance that has been traveled
	 */
	private void algorithmHelper(int index, ArrayList<Point> testRoute, double currentDistance) {
		if (index >= list.size()) {
			numChecked++;
			if (route == null || currentDistance < distance) {
				route = new ArrayList<Point>(testRoute);;
				distance = currentDistance;
			}
		} else {
			for (Point point: list) {
				if (!testRoute.contains(point)) {
					ArrayList<Point> copy = new ArrayList<Point>(testRoute);
					if (copy.size() != 0) {
						double newDistance = currentDistance + copy.get(copy.size() - 1).getDistance(point);
						copy.add(point);
						algorithmHelper(index + 1, copy, newDistance);
					} else {
						copy.add(point);
						algorithmHelper(index + 1, copy, 0);
					}
				}
			}
		}
	}
	
	/**
	 * Prints a string representing which steps to the Solution
	 * @param list the set of points
	 * @param distance the distance that the points travel through
	 * @param time the time it takes to compute the algorithm
	 */
	private String print() {
		StringBuffer buf = new StringBuffer();
		buf.append("Route: ");
		for (int i = 0; i < route.size() - 1; i++) {
			buf.append("(" + route.get(i).getxCord() + ", " + route.get(i).getyCord() + ") → ");
		}
		buf.append("(" + route.get(route.size() - 1).getxCord() + ", " + route.get(route.size() - 1).getyCord() + ")\n");
		buf.append("Distance: " + distance + " units\n");
		buf.append("Time: " + time + " ms\n");
		buf.append("Number of Routes Checked: " + numChecked + "\n");
		return buf.toString();
	}
	
}
