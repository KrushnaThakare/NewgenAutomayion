class MethodOverloadingDataType{
	public void addition(int a,long b){
	long c=a+b;
	System.out.println("Class A" + c);
	}


	public void addition(long a,int b){
	long c=a+b;
	System.out.println("Class A" + c);
	}

public static void main(String []args){

	MethodOverloadingDataType obj = new MethodOverloadingDataType();
	obj.addition(10L,10);
}
}

