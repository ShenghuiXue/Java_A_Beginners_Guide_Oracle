import java.io.*;

class Readline{
	public static void main(String args[]) throws IOException
	{
		// first creat an object of bufferedReader using system.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println ("Enter lines of text. \n Enter 'stop' to quit.");

		do {
			str = br.readLine ();
			System.out.println (str);
		} while (!str.equals("stop"));
	}
}