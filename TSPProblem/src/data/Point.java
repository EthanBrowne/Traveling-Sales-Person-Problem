/**
 * 
 */
package data;

/**
 * point class
 * @author Ethan Browne
 */
public class Point {
	
	/** the x coordinate */
	private int xCord;
	
	/** the y coordinate */
	private int yCord;
	
	/**
	 * Point constructor
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public Point(int xCord, int yCord) {
		this.xCord = xCord;
		this.yCord = yCord;
	}
	
	/**
	 * Gives the x coordinate
	 * @return x coordinate
	 */
	public int getxCord() {
		return xCord;
	}
	
	/**
	 * Gives the y coordinate
	 * @return y coordinate
	 */
	public int getyCord() {
		return yCord;
	}
	
	/**
	 * Gets the distance between two points
	 * @param other the other point
	 * @return the distance between two points
	 */
	public double getDistance(Point other) {
		double deltaX = xCord - other.getxCord();
		double deltaY = yCord - other.getyCord();
		
		return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
	}
	
	public boolean equals(Point other) {
		if (getDistance(other) == 0)
			return true;
		return false;
	}
}
