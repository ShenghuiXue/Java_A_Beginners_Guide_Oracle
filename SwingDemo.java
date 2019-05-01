import javax.swing.*;

class SwingDemo {
	SwingDemo () {
		// create a JFrame containner
		JFrame jfrm = new JFrame (" A simple application");

		// give the initial size of the the fame
		jfrm.setSize (600, 600);

		//terminate the programe when the application closed by users
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a text-based label
		JLabel jlab = new JLabel ("Let's see what will be shown here");

		// add the label to the content pane.
		jfrm.add (jlab);

		// display the frame
		jfrm.setVisible (true);

	}

	public static void main (String [] args) {
		//creat the frame on the event dispatching thread
		SwingUtilities.invokeLater (new Runnable () {
			public void run () {
				new SwingDemo ();
			}
		});
	}
}