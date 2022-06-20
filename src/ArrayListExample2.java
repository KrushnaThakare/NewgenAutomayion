import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<String> l2 = new ArrayList<>();
		
		l2.add("Bhiu Nakos");
		l2.add("Mi Tuzya");
		l2.add("Pathishi Ahe");
		
		System.out.println("Second Index Elemen Is"+l2.get(2));
	
		Iterator<String> itr= l2.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}
