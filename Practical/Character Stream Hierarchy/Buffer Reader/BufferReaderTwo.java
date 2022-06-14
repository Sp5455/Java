package corejava1;

import java.io.*;

public class BufferReaderTwo {
	public static void main(String args[])throws Exception{             
		
		//Creating object
	    InputStreamReader r=new InputStreamReader(System.in);    
		
	    //To read from the created file
	    BufferedReader br=new BufferedReader(r);            
		
	    System.out.println("Enter your name");    
		
	    //To Reading The Value From The User
	    String name=br.readLine();    
		
	    System.out.println("Welcome "+name);    
		
		}    
}
