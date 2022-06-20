
public class ReverseNumber {

	public static void main(String[] args) {
	
		int i= 123456789;
		int a,b=0,c=0;
		a=i;
		
		while(a>0){
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}System.out.println(c);

	}

}
