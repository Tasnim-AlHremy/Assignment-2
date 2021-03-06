package assignment2;
import java.util.*;

public class SetListPerformanceTest2 {
static int N = 10000;

public static void main(String[] args) {
// Add numbers 0, 1, 2, ..., N - 1 to the array list
while (N!=110000) {
	 

List<Integer> list = new ArrayList<>();
for (int i = 0; i < N; i++)
 list.add(i);
 Collections.shuffle(list); // Shuffle the array list
System.out.println("when the N equal : " + N);
// Create a hash set, and test its performance
Collection<Integer> set1 = new HashSet<>(list);
    System.out.println("Member test time for hash set is " +
      getTestTime(set1) + " milliseconds");
    System.out.println("Remove element time for hash set is " +
      getRemoveTime(set1) + " milliseconds");

// Create a linked hash set, and test its performance
Collection<Integer> set2 = new LinkedHashSet<>(list);
    System.out.println("Member test time for linked hash set is " +
      getTestTime(set2) + " milliseconds");
    System.out.println("Remove element time for linked hash set is "
      + getRemoveTime(set2) + " milliseconds");

// Create a tree set, and test its performance
Collection<Integer> set3 = new TreeSet<>(list);
    System.out.println("Member test time for tree set is " +
      getTestTime(set3) + " milliseconds");
    System.out.println("Remove element time for tree set is " +
  		  getRemoveTime(set3) + " milliseconds");

// Create an array list, and test its performance
Collection<Integer> list1 = new ArrayList<>(list);
    System.out.println("Member test time for array list is " +
      getTestTime(list1) + " milliseconds");
    System.out.println("for loop and for each time ");
    System.out.println("For loop traversing elements time for array list is " +
  		  getListTraditionalItratorTime(list1) + " milliseconds");
    System.out.println("For each traversing elements time for array list is " +
  		  getlistEachItratorTime(list1) + " milliseconds");
System.out.println("Remove element time for array list is " +
		  getRemoveTime(list1) + " milliseconds");




//vector 
 Collection<Integer> list3 = new Vector<Integer>(list);
 System.out.println("Member test time for  vector is " +
	        getTestTime(list3) + " milliseconds");
 System.out.println("for loop and for each time ");
    System.out.println("For loop traversing elements time for vector list is " +
  		  getListTraditionalItratorTime(list3) + " milliseconds");
    System.out.println("For each traversing elements time for vector is " +
  		  getlistEachItratorTime(list3) + " milliseconds");
	      System.out.println("Remove element time for vector  is " +
	    		  getRemoveTime(list3) + " milliseconds");
	      
// Create a linked list, and test its performance
Collection<Integer> list2 = new LinkedList<>(list);
    System.out.println("Member test time for linked list is " +
      getTestTime(list2) + " milliseconds");
    System.out.println("for loop and for each time ");
    System.out.println("For loop traversing elements time for linked list is " +
  		  getListTraditionalItratorTime(list2) + " milliseconds");
    System.out.println("For each traversing elements time for linked list is " +
  		  getlistEachItratorTime(list2) + " milliseconds");
    System.out.println("Remove element time for linked list is " +
  		  getRemoveTime(list2) + " milliseconds");
   
    
    
  //  PriorityQueue
    
    Collection<Integer> pQueue = new PriorityQueue<Integer>(list);
      System.out.println("Member test time for Priority Queue is " +
		        getTestTime(pQueue) + " milliseconds");
		      System.out.println("Remove element time for Priority Queue is " +
		    		  getRemoveTime(pQueue) + " milliseconds");
		      System.out.println("*******");
		      N = N+10000;
    
  }


}

public static long getTestTime(Collection<Integer> c) {
long startTime = System.currentTimeMillis();

// Test if a number is in the collection
for (int i = 0; i < N; i++)
c.contains((int)(Math.random() * 2 * N));

return System.currentTimeMillis() - startTime;
}

public static long getRemoveTime(Collection<Integer> c) {
	 long startTime = System.currentTimeMillis();
	 for (int i = 0; i < N; i++)
	 c.remove(i);
	 return System.currentTimeMillis() - startTime;
	 
}

public static long getListTraditionalItratorTime(Collection<Integer> c ) {
	 long startTime = System.currentTimeMillis();
	 for (int i = 0; i < c.size(); i++) {
		((List<Integer>) c).get(i);
	}
	
	return System.currentTimeMillis()- startTime ;
	
}
public static long getlistEachItratorTime(Collection<Integer> c ) {
	 long startTime = System.currentTimeMillis();
	 for (Integer i : c) 
			((List<Integer>) c).get(i);
	return System.currentTimeMillis()- startTime ;
	
}


}