import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetEx {
	
	public static void main(String[] args){
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Apple");
		ts.add("Ball");
		ts.add("cat1");
		ts.add("Dog");
		ts.add("Elephant");
		
		Iterator<String> itr = ts.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}

}
