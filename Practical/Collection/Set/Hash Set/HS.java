package corejava1;
import java.util.*;
public class HS {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Vivek");  
		set.add("Abhi");  
		set.add("Abhijit");  
		set.add("Shubham");  
		
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

	}

}
