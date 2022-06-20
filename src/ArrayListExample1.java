import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample1 {

	public static void main(String[] args) {
		
		List <String> l1 = new ArrayList<String>();
		
		l1.add("Krushna");
		l1.add("Test1");
		l1.add("Krushna");
		l1.add("Test2");
		
		System.out.println("Third Index is =>"+l1.get(2));
		
		Iterator <String> itr = l1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
