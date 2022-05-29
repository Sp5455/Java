package corejava1;
import java.util.*;
public class Sk {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Sanket");  
		stack.push("Shubham");  
		stack.push("Sandesh");  
		stack.push("Sumeet");  
		//stack.pop();
		stack.push("Vikas");
		
		  
		Iterator<String> itr=stack.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}  
	}  
}
