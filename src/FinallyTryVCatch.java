
public class FinallyTryVCatch {
	
	public static void main(String []args){
		
		try{
			int data=10/0;
		}finally{
			System.out.println("In Finally Block..");
		}catch(ArrayIndexOutOfBoundsException  exception){
			System.out.println("In Catch Block..");
		}
	}

}
