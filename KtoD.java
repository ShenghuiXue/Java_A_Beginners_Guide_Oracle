import java.io.*;
class KtoD {
	public static void main (String [] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("enter text \n 'stop' to quit");
		try (FileWriter fw = new FileWriter ("test.txt", 1==1)) {
			do {
				System.out.print (":");
				str =br.readLine ();
				if (str.compareTo ("stop") == 0) break;
				str = str + "\r\n";
				fw.write (str);
			} while (str.compareTo ("stop") !=0);
		}	catch (IOException exc) {
			System.out.println (" I/O error" + exc);
		}
	}
}