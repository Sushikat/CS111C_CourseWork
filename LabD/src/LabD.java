import javax.swing.JApplet;
import java.awt.*;
/**
 * Iris Buschelman
 * LabD: Making Recursive Squares
 * CS111C
 * Due 1/11/2014
 * 
 * @author Iris
 * A JApplet that makes Squares at the corners of the squares 
 * under it.
 */
public class LabD extends JApplet{
	final int INITIAL_SIDE = 200;
	final int MIN_SIZE = 20;
	final int SHRINK_BY = 2;
	/**
	 * Initialize the size of the window
	 */
	public void init(){
		this.setSize(new Dimension(500,500));
	}
	/**
	 * Implement the drawSquares method
	 * @param g An object of the Graphics Class
	 */
	public void paint(Graphics g){
		drawSquares(g, 250, 250, INITIAL_SIDE);
	}
	/**
	 * Recursively draws a square centered on x,y with side length side
	 * 
	 * Calls itself to draw squares at each of the corners of the 
	 * previous square
	 * 
	 * @param g the Graphics object
	 * @param x the x-coordinate of the center of the square
	 * @param y the y-coordinate of the center of the square
	 * @param side the length of the sides of the square
	 */
	public void drawSquares(Graphics g, int x, int y, int side){
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x-side/2, y-side/2, side, side);
		g.setColor(Color.BLACK);
		g.drawRect(x-side/2, y-side/2, side, side);
		if(side > MIN_SIZE){
			drawSquares(g, x+side/2, y+side/2, side/SHRINK_BY);
			drawSquares(g, x-side/2, y-side/2, side/SHRINK_BY);
			drawSquares(g, x+side/2, y-side/2, side/SHRINK_BY);
			drawSquares(g, x-side/2, y+side/2, side/SHRINK_BY);
		}
	}
}
