//Java program to demonstrate on FileOutputStream
package correjava;
import java.io.FileOutputStream;
public class FileOutputStrm {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\ShubhamFile.txt");
			
			// With Integer data type
			fout.write(65);

			// With String data type
//			String s = "Good Morning Everyone !!";
//			byte b[] = s.getBytes();
//			fout.write(b);

			fout.close();
			System.out.println("Success..");
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
