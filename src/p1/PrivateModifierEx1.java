package p1;


class PrivateModifierEx1 {
	 int a=10;
	 void addition(){
		System.out.println(a);
	}
class Java extends PrivateModifierEx1 {
	
void addition(){
	System.out.println(a);
}
}
public static void main(String []args){
	
	PrivateModifierEx1 obj = new PrivateModifierEx1();
	obj.addition();
	obj.a=100;
	obj.addition();
	
	Java obj1 = new Java();
	obj1.addition();
}
}