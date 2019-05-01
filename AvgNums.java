/** first input a int from key broad and then input a 
	few double numbrs, fianlly calculate average */

import java.io.* ;

class AveNum {
	public static void main (String [] args) throws IOException {
		// first creat a buffer reader from keyboard
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str;
		int n;
		double sum = 0.0;
		double ave, t;
		System.out.print("How many numbers will you enter: ");
		str = br.readLine();
		try {
			n = Integer.parseInt (str); // casting
		}
		catch (NumberFormatException exc) {
			System.out.println ("invalid format");
			n=0;
		}

		System.out.println ("enter" + n + " values");
		for (int i = 0; i < n; i++) {
			str = br.readLine ();
			try {
				t = Double.parseDouble(str);

			} catch (NumberFormatException exc) {
				System.out.println (" invalid double"); 
				t =0.0;
			}
			sum += t;
		} 
		ave = sum/n;
		System.out.println ("Average is : " + ave);
	}
}