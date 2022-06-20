package p2;
import p1.PublicMOdifierEx1;
public class PublicMOdifierEx1Main extends PublicMOdifierEx1 {
	
	public static void main(String[]args){
		
		PublicMOdifierEx1 obj = new PublicMOdifierEx1();
		obj.display();
		obj.a=400;
		System.out.println(obj.a);
	}

}
