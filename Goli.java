import java.util.*;
import java.util.stream.Collectors;
class Goli {

	public static void main(String[]args) {
Set<String> set = new HashSet<>();

		List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		
		List<String> list = items.stream()
				.filter(p->!set.add(p)).collect(Collectors.toList());
		

		System.out.println("Hello im pradeep");
		System.out.println("Hello Kumar");
	}
	

	
	
}
