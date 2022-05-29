package corejava1;
import java.util.*;  
class AL{  
	public static void main(String args[]){  
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Sandesh");//Adding object in arraylist  
			list.add("Shubham");  
			list.add("Sumeet");  
			list.add("sanket");  
			
				//Traversing list through Iterator  
			Iterator itr=list.iterator();  
				while(itr.hasNext()){  
					System.out.println(itr.next());  
				}  
	}  
}  
