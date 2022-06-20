
public class ExceptionHandlingEx1 {

	public static void main(String []args){
		
		try{
			
			int data=10;
			int i=0;
			int value=data/i;
			
		}catch(ArithmeticException exception){
			System.out.println("Value cannot be divided by Zero");
		}System.out.println("Rest of the Statements..");
	}
}
