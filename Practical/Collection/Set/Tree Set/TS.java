package corejava1;
import java.util.*;
public class TS {

	public static void main(String[] args) {
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Abhijit");  
		set.add("Vivek");  
		set.add("Shubham");  
		set.add("Abhi");  
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			
		}  

	}

}
