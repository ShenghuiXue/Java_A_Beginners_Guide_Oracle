import java.io.*;

class RandomAccessDemo {
	public static void main(String args[]){
		double [] data = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
		double d;
		//open and use random access file
		try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) 
		{
			for (int i = 0; i< data.length; i++) {
				raf.writeDouble (data[i]);
			}

			raf.seek(0);
			d= raf.readDouble();
			System.out.println ("first value is " + d);
			raf.seek(8); // seek to second double
			d = raf.readDouble();
			System.out.println("Second value is " + d);
			raf.seek(8 * 3); // seek to fourth double
			d = raf.readDouble();
			System.out.println("Fourth value is " + d);
			System.out.println();	
		} catch (IOException exc) {
			System.out.println ("I/O error" +exc);
		}

	}
			
}