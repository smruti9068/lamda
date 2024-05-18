package lamda_assignment;

import java.util.ArrayList;
import java.util.List;
public class ques2 {
   public static void main(String[] args) {
	   List<String> strings= new ArrayList<>();
	   strings.add("apple");
	   strings.add("banana");
	   strings.add("kiwi");
	   strings.add("cherry");
	   strings.add("blueberry");
	   strings.add("fig");
	   strings.add("grape");
	   
	   //sorting the arrays based on their length in descending order
	   strings.sort((s1,s2)->Integer.compare(s2.length(),s1.length()));
	   
	   //print the sorted list
	   System.out.println("Sorted strings based on length in descending order:");
	   for(String str: strings) {
		   System.out.println(str);
	   }
   }
}
