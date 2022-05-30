package corejava1;
//Java program to Iterate a LinkedList in Reverse Order
//using descending Iterator

import java.util.Iterator;
import java.util.LinkedList;
class LinkedListReverse{
	

 public static void main(String[] args)
 {
     LinkedList<String> linkedList = new LinkedList<>();
     
     // adding elements to linked list
     linkedList.add("2001");
     linkedList.add("2002");
     linkedList.add("2003");
     linkedList.add("2004");
     linkedList.add("2005");

     // getting an iterator which points at the
     // end of the linkedlist
     Iterator<String> iterator = linkedList.descendingIterator();

     // traversing the linkedlist
     // hasNext() will tell if previous element is
     // available or not
     // next() with descending iterator will return the
     // previous element
     // and after getting the previous element
     // is moves the cursor to next previous element.
     while (iterator.hasNext()) 
     {
         System.out.println(iterator.next());
     }
 }
}



