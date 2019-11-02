import java.util.*;

public class Practice66 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		
		System.out.println(set.toString());
		
		System.out.print("[");
		for(String value : set) {
			System.out.print(value + ", ");
		}
		System.out.println("]");
		
		System.out.print("[");
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {
			String s = e.next();
			System.out.print(s + ", ");
		}
		System.out.println("]");
		
		System.out.print("[");
		for(String value : set) {
			System.out.print(value);
			if(set.size() != value.length()) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
