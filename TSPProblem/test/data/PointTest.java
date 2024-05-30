package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testPoint() {
		Point p1 = new Point(1,2);
		assertNotNull(p1);
	}

	@Test
	public void testGetxCord() {
		Point p1 = new Point(1,2);
		assertEquals(1, p1.getxCord());
	}

	@Test
	public void testGetyCord() {
		Point p1 = new Point(1,2);
		assertEquals(2, p1.getyCord());
	}

	@Test
	public void testGetDistance() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(4,5);
		assertEquals(5, (int) p1.getDistance(p2));
		assertEquals(0, (int) p1.getDistance(p1));
	}

	@Test
	public void testEqualsPoint() {
		Point p1 = new Point(1,2);
		Point p2 = new Point(2,1);
		Point p3 = new Point(1,2);
		assertTrue(p1.equals(p3));
		assertFalse(p1.equals(p2));
	}

}
