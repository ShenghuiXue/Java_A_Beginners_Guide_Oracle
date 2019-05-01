import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFDemo implements ActionListener {
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlbPrompt, jlabContents;

	TFDemo () {
		//Create a new JFrame container;
		JFrame jfrm = new JFrame ("reverse programe!");

		//use Flowlayout fro the layout manager
		jfrm.setLayout (new FlowLayout());

		//give initial size of the the window
		jfrm.setSize (600, 600); 

		//terminate the program when use close it; 

		jfrm.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		// create a text field which is is 40 column wide
		jtf = new JTextField (30);

		// setup an action commonds for the test field
		jtf.setActionCommand ("myTF");

		//creat a botton called reverse
		jbtnRev = new JButton ("Reverse"); 

		// add two action listeners:
		jtf.addActionListener (this);
		jbtnRev.addActionListener (this);

		// create text labels 
		jlbPrompt= new JLabel ("Enter the DNA sequence here:");
		jlabContents = new JLabel ("");

		// add these components to the content pane
		jfrm.add(jlbPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtnRev);
		jfrm.add(jlabContents);

		// the default display is faulse, here need the set as true
		jfrm.setVisible (true);
	}

	// evetns handeller actionPerformed is the defined function for actionListioner
	public void actionPerformed (ActionEvent ae) {
		if (ae.getActionCommand().equals("Reverse")) {
			String orgStr = jtf.getText();
			String resStr = "";
			for (int i = orgStr.length()-1; i >=0; i-- )
				resStr += orgStr.charAt (i) ;
			jtf.setText (resStr); 
		} else 
		jlabContents.setText ("your pressed ENTER. Text is: " + jtf.getText()); 
	}

	public static void main (String [] args) {
		SwingUtilities.invokeLater (new Runnable () {
			public void run () {
				new TFDemo ();
			}
		});
	}

}