import java.io.IOException;




public class ExceptionHandlingEx9 {

	public void m() throws IOException {
		throw new IOException();
	}
	public void n() throws IOException {
		m();
	}
	public void p() throws IOException {
	
		n();
		
		
	}
	public static void main(String []args){
		ExceptionHandlingEx9 obj = new ExceptionHandlingEx9();
		obj.p();
		
	}
}
