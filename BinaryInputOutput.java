package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryInputOutput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:/download.jpg");
		FileOutputStream fos = new FileOutputStream("D:/ddtest.jpg");
		
		int cap = fis.read();

		while (cap != -1) {
			fos.write(cap);
			cap = fis.read();
		}
		fis.close();
		fos.close();

	}

}
