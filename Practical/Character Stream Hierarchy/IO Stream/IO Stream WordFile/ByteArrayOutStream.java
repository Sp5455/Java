package corejava1;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutStream {

	public static void main(String args[])throws Exception{    
		
			//Creating FileOutputStream object
	      FileOutputStream fout1=new FileOutputStream("D:\\ByteArrayOutStream.txt");    
	      FileOutputStream fout2=new FileOutputStream("D:\\CopyOfmyFile.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(67);    
	      
	      //String s = "Good Morning Everyone !!";
	      //byte b[] = s.getBytes();
	      //bout.write(b);
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      
	      System.out.println("Success...");    
	     }    
	}