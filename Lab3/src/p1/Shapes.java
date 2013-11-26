

//************************************************************
//Shapes.java
//
//The program will draw two filled rectangles and a
//filled oval.
//************************************************************
import javax.swing.JApplet;
import java.awt.*;
public class Shapes extends JApplet
{
public void paint (Graphics page)
    {
    //Declare size constants
    final int MAX_SIZE = 300;
    final int PAGE_WIDTH = 600;
    final int PAGE_HEIGHT = 400;
    //Declare variables
    int x, y; // x and y coordinates of upper left-corner of each shape
    int width, height;
    // width and height of each shape
    //Set the background color
    setBackground (Color.yellow);
    //Set the color for the next shape to be drawn
    page.setColor (Color.blue);
    //Assign the corner point and width and height
    page.fillRect (50, 0, 100, 70);
    page.setColor (Color.green);
    page.fillRect (200, 50, 200, 100);
    page.setColor (Color.red);
    page.fillOval (250, 60, 100, 70);
    page.setColor (Color.gray);
    page.fillOval (200, 130, 200, 100);


    }
}
