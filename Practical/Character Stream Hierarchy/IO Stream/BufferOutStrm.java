package corejava1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutStrm {

	public static void main(String args[]) throws Exception {
			//Creating FileOutputStream object
		FileOutputStream fout = new FileOutputStream("D:\\BufferOutStream.txt");
		
		//To read from the created file
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String s = "Welcome to my world";

		byte b[] = s.getBytes();

		//For Write Output
		bout.write(b);

		//For Display Immediately
		bout.flush();

		bout.close();

		fout.close();

		System.out.println("success");
	}
}