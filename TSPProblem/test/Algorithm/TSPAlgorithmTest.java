package Algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import data.Point;

public class TSPAlgorithmTest {

	@Test
	public void testTSPAlgorithm() {
		TSPAlgorithm alg = new TSPAlgorithm(null);
		assertNotNull(alg);
	}

	@Test
	public void testAlgorithm() {
		ArrayList<Point> array = new ArrayList<Point>();
		TSPAlgorithm alg = new TSPAlgorithm(array);
		assertEquals("Must have more than 2 points", alg.algorithm());
		
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		array.add(p1);
		array.add(p2);
		//alg = new TSPAlgorithm(array);
		assertEquals("Must have more than 2 points", alg.algorithm());
		
		Point p3 = new Point(3, 3);
		array.add(p3);
		alg = new TSPAlgorithm(array);
		//assertEquals("Route: (1, 1) → (2, 2) → (3, 3)\nDistance: 2.8284271247461903 units\nTime: 1.0 ms\n", alg.algorithm());
		
		Point p4 = new Point(0,0);
		Point p5 = new Point(5,5);
		array.add(p4);
		array.add(p5);
		//alg = new TSPAlgorithm(array);
		//assertEquals("Route: (1, 1) → (2, 2) → (3, 3)\nDistance: 2.8284271247461903 units\nTime: 6.0 ms\n", alg.algorithm());
		
		
		array = new ArrayList<Point>();
		array.add(new Point(1,0));
		array.add(new Point(6,5));
		array.add(new Point(12, 3));
		array.add(new Point(-4, 6));
		array.add(new Point(4, 8));
		array.add(new Point(2, 7));
		array.add(new Point(15, 0));
		array.add(new Point(12, -5));
		array.add(new Point(-3, -5));
		array.add(new Point(8, -7));
		array.add(new Point(0, 0));
		
		alg = new TSPAlgorithm(array);
		//assertEquals("Route: (1, 1) → (2, 2) → (3, 3)\nDistance: 2.8284271247461903 units\nTime: 6.0 ms\n", alg.algorithm());
		
	}

}
