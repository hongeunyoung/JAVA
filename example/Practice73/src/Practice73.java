//보건관리학과 20170809 홍은영

import java.util.HashSet;
import java.util.Iterator;

public class Practice73 { 
	public static void main(String args[]) { 
		HashSet<String> set = new HashSet<String>(); 
		set.add("Milk"); 
		set.add("Bread"); 
		set.add("Butter"); 
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham");
		
		//1
		System.out.println(set);
		
		//2
		System.out.print("[");
		
		for(String value : set) {
			System.out.print(value + ", ");
		}
		
		System.out.println("]");
		
		//3
		Iterator<String> e = set.iterator();
		
		System.out.print("[");
		
		while(e.hasNext()) {
			String s = e.next();
			
			System.out.print(s + ", ");
		}

		System.out.println("]");
		
		//4
		System.out.print("[");
		
		int i = 0;
		
		for(String value : set) {
			if(i == set.size() - 1) {
				System.out.print(value);
			}
			else {
				System.out.print(value + ", ");
			}
			
			i++;
		}
		
		System.out.println("]");
	}
}
