package corejava1;
import java.util.*;
public class LL {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Sandesh");  
		al.add("Shubham");  
		al.add("Sumeet");  
		al.add("Sanket");  
		
		Iterator<String> itr=al.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}  
	}  
}
