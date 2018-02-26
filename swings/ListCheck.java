package swings;

import java.util.ArrayList;


public class ListCheck {

	public static void main(String args[]){
		
		String str1 = "orange";
		
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("graphes");
		
		for(int i = 0; i<list.size(); i++){

			System.out.println("List items:"+list.get(i));
			if(str1.equals(list.get(i))){
				break;
			}
				
		}
System.out.println("Completed");
		
	}
}
