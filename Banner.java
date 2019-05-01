
/*
 	Try This 15-1
	A simple banner applet.
	This applet creates a thread that scrolls
	the message contained in msg right to left
	across the applet's window.
*/

import java.awt.*;
import java.applet.*;

/* 
<applet code = "Banner" width = 600 height = 500>
</applet>
*/

public class Banner extends Applet implements Runnable {
	String msg = " Jave Rules the web ";
	Thread t;
	boolean stopFlag;

	// Initialize t to null
	public void init () {
		t = null;
	}

	//start thread
	public void start () {
		t = new Thread (this);
		stopFlag = false;
		t.start (); 
	}

	//entry point for the thread tthat runs the banner
	public void run () {
		//redisplay banner
		for ( ; ; ) {
			try {
				repaint ();
				Thread.sleep (2500);
				if (stopFlag) 
					break;
			} catch (InterruptedException exc) {}
		}
	}

	public void stop () {
		stopFlag =true; 
		t = null;
	}

	public void paint (Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg =msg.substring (1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}
}