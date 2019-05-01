import java.awt.*;
import java.applet.*;

/*
<applet code="SimpleApplet" width=600 height=600>
</applet>
*/

public class SimpleApplet extends Applet {
	public void paint (Graphics g) {
		g.drawString ("java make applets easy. " , 20, 20);
	}
}
