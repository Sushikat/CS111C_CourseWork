import javax.swing.JApplet;
import java.awt.*;

/**
 * Iris Buschelman
 * LabD: Recursion EXTRA CREDIT!!!
 * CS111C
 * Due: 1/11/2014
 * <p>
 * This Program makes Equilateral Triangles recursively.
 * It looks similar to Serpinski's Triangle, but is not the same.
 * It may take a minute or so to compile, so don't kill
 * it when it doesn't show up immediately.
 * 
 * @author Iris Buschelman
 * 
 */

public class Triangles extends JApplet{
	final int INITIAL_SIDE = 300;
	final double MIN_SIZE = 1;
	final double SHRINK_BY = 2.0;

	/*
	 * Because these are equilateral triangles, 
	 * the height is sqrt(3) * base/2
	 * TRIANGLE_HEIGHT_RATIO = sqrt(3)
	 */
	final double TRIANGLE_HEIGHT_RATIO = 1.73205080757;
	
	/**
	 * Sets size of the window.
	 * Starts the drawTriangles recursion.
	 * <p>
	 * The window and center positions are purely aesthetic.
	 * The window is not square because it looks bad.
	 * The center is not the center of the window because it looks bad.
	 * @param g The Graphics object
	 */
	
	public void paint(Graphics g){
		this.setSize(new Dimension(650,525));
		drawTriangles(g, 325, 350, INITIAL_SIDE);
	}

	/**
	 * Recursively draws Equilateral Triangles centered at x,y where side
	 * is the distance between the points
	 * @param g the Graphics Object
	 * @param x the x-coordinate of the center of the triangle
	 * @param y the y-coordinate of the center of the triangle
	 * @param side the distance between vertices on the triangle
	 */
	
	private void drawTriangles(Graphics g, int x, int y, double side){
	
		// height = base/2 * sqrt(3)
		double height =((side/2.0)*TRIANGLE_HEIGHT_RATIO);
		
		// radius of the circle circumscribing the Triangle
		double radius = height*2.0/3.0;
		
		// Points of the vertices to be plugged into arrays for the Polygon class
		int xPoint1 = x;
		int yPoint1 = y - (int)radius;
		int xPoint2 = x - (int)(side/2.0);
		int yPoint2 = yPoint1 + (int)height;
		int xPoint3 = x + (int)(side/2.0);
		int yPoint3 = yPoint1 + (int)height;

		// Plugging above points into arrays for Polygon class
		int[] xPoints = {xPoint1, xPoint2, xPoint3};
		int[] yPoints = {yPoint1, yPoint2, yPoint3};
		
		// Instantiate Polygon object
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		
		// Fill Polygon
		g.setColor(Color.lightGray);
		g.fillPolygon(triangle);
		
		// Draw Borders
		g.setColor(Color.black);
		g.drawPolygon(triangle);
		
		// Draw new Triangle at each point while the side is still bigger than min size
		if(side > MIN_SIZE){
			drawTriangles(g, xPoint1, yPoint1, side/SHRINK_BY);
			drawTriangles(g, xPoint2, yPoint3, side/SHRINK_BY);
			drawTriangles(g, xPoint3, yPoint3, side/SHRINK_BY);
		}
	}
}