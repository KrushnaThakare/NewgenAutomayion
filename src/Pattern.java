
public class Pattern {
	
	public static void main(String []args){
		
		int a=1;
		for(a=1;a<=5;a++){
             for(int c =1;c<=a;c++){
				
				System.out.print(+c);
			}
			
			for(int b=4;b>=a;b--){
				System.out.print(" ");
			}
			System.out.println();
			
			
		}
		for(a=1;a<=5;a++){
            for(int c =5;c>=1;c--){
				
				System.out.print(+c);
			}
			
			for(int b=4;b>=a;b--){
				System.out.print(" ");
			}
			System.out.println();
			
			
		}
	}
	

}
