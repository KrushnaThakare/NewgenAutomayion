
public class StaticMethod {

	static int i = 100;
	public static void test1(){
		i=i+1;
		System.out.println("Value of i is"+i);
	}
	public static void test2(){
		i=i+1;
		System.out.println("Value of i is"+i);
	}
	
	public static void main(String args[]){
		StaticMethod.test1();
		StaticMethod.test2();
		
	}
}
