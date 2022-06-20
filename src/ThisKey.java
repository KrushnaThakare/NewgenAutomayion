public class ThisKey{
	int a;
	int b;

	public ThisKey(int a, int b)
	{
	this.a=a;
	this.b=b;
	System.out.print("Value of a & b is" +a);
	System.out.println("&" +b);
	}
	public static void main(String []args){

	ThisKey obj= new ThisKey(10,20);
	System.out.println("Value of a is "+obj.a);
	System.out.println("Value of a is "+obj.b);

	}
	}