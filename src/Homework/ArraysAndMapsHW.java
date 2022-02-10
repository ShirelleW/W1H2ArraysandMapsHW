package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraysAndMapsHW {

//	copy one array list into another-----------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		
		ArrayList<Integer> nums2 = new ArrayList<>(); 
		
		nums.add(1);
		nums.add(2);
		nums.add(5);
		nums.add(7); 
		nums.add(6); 
		
		nums2.addAll(nums);
		System.out.println(nums2);
//		extract a portion of an array list------------------------------------------------------------------------------------------------
		nums.subList(1, 3).clear();
		System.out.println(nums);
//		swap two elements in an array list--------------------------------------------------------------------------------------------
		
		ArrayList<String> dogs = new ArrayList<String>(); 
		dogs.add("Labs");
		dogs.add("Dachsund");
		dogs.add("Cairn");
		System.out.println(dogs);
		
		Collections.swap(dogs, 1, 2);
		System.out.println(dogs);
		
//		 test an array list is empty or not------------------------------------------------------------------------------------------
		System.out.println(dogs.isEmpty()); 
		
//		replace the second element of an ArrayList with the specified element
		dogs.set(0, "Malamute");
		System.out.println(dogs);

//		 trim the capacity of an array list the current list size--------------------------------------------------------------------
		
		ArrayList<String> colors = new ArrayList<String>(10); 
		Collections.addAll(colors, "pink", "royal", "black", "white", "brown");
		System.out.println(colors);
		colors.trimToSize();
		
//		 test a hash set is empty or not---------------------------------------------------------------------------------------------
		
		HashMap<String, String> food = new HashMap<>();
		food.put("ice cream", "hot fudge");
		food.put("hot dog", "sauerkraut");
		food.put("burger", "pickles"); 
		food.put("cereal", "banana"); 
		food.put("coffee", "cream");
		
		System.out.println(food.isEmpty());
		
//		get the number of elements in a hash set--------------------------------------------------------------------------------------
		
		Set<String> food2 = new HashSet<String>();
		food2.add("ice cream");
		food2.add("hot dog");
		food2.add("burger");
		food2.add("cereal");
		food2.add("coffee");
		
		System.out.println(food2.size());
		
//      iterate through all elements in a hash list-----------------------------------------------------------------------------------

		for (Map.Entry<String, String> set : food.entrySet()) {
		    System.out.println(set.getKey() + " = " + set.getValue());
		}
		
//      convert a hash set (key-value pair) to an array-------------------------------------------------------------------------------
		
		String[] array = new String[food2.size()];
	     food2.toArray(array);
	 
	     for(String value : array){
	        System.out.println(value);
	     }
//	    compare two sets and retain elements that are the same on both sets----------------------------------------------------------
	        
	    Set<String> names1 = new HashSet<String>();
	    names1.add("Lane"); 
	    names1.add("Shirelle"); 
	    names1.add("Teo");
	    names1.add("Revathy"); 
	    names1.add("Micheal"); 
	    
	    Set<String> names2 = new HashSet<String>();
	    names2.add("Lane"); 
	    names2.add("Shirelle"); 
	    names2.add("Nate");
	    names2.add("Gus"); 
	    names2.add("Brandon"); 
	    
	    for (String element : names1){
            System.out.println(names2.contains(element) ? element + " is repeated" : element + " No");
         }     
	    
}
}