

//*************************************************************
//Coords.java
//
//Draw rectangles to illustrate the Java coordinate system
//
//*************************************************************
import javax.swing.JApplet;
import java.awt.*;
public class Coords extends JApplet
{
public void paint (Graphics page)
	{
	//Declare size constants
	final int MAX_SIZE = 300;
	final int PAGE_WIDTH = 600;
	final int PAGE_HEIGHT = 400;
	//Declare variables
	int x, y; // x and y coordinates of upper left-corner of each shape
	int width, height; // width and height of each shape
	//Set the background color
	setBackground (Color.yellow);
	//Set the color for the next shape to be drawn
	page.setColor (Color.blue);
	//Assign the corner point and width and height


	page.fillRect(200, 150, 200, 100);
	page.setColor (Color.green);
	page.fillRect(0, 0, 200, 150);
	page.setColor (Color.red);
	page.fillRect(0, 250, 200, 150);
	page.setColor (Color.orange);
	page.fillRect (400, 0, 200, 150);
	page.setColor (Color.black);
	page.fillRect (400, 250, 200, 150);
	}
}
