import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code= "MouseEvents" width=500 height = 500>
</applet>
*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {

	String msg = "";
	int mouseX=0, mouseY=0;

	public void init (){
		addMouseListener (this);
		addMouseMotionListener (this);
	}

	//deal with mouse click
	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY=10;
		msg = "Hello Chloe, mouse clicked";
		repaint ();
	}

	//deal with mouse entered
	public void mouseEntered (MouseEvent me) {
		mouseX=0;
		mouseY=10;
		msg = "mouse entered";
		repaint ();

	}

	//deal with  mouse exited
	public void mouseExited (MouseEvent me) {
		mouseX=0;
		mouseY=10;
		msg = "mouse exited";
		repaint ();
	}

	// deal with button pressed
	public void mousePressed (MouseEvent me) {
		//save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "mouse button pressed";
		repaint ();
	}

	//deal with mouse button released
	public void mouseReleased (MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "mouse button released";
		repaint ();
	}

	// deal with mouse dragged
	public void mouseDragged (MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "this is where mouse locate";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	// handle mouse moved
	public void mouseMoved (MouseEvent me) {
		showStatus("Moving mouse at " + me.getX() + ", " +
		me.getY());
	}
	//finially dispaly msg in the applet window at mouseX mouseY
	public void paint (Graphics g) {
		g.drawString (msg, mouseX, mouseY);
	}
}