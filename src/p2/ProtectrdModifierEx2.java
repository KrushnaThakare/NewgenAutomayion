package p2;
import p1.ProtectrdModifierEx1;
public class ProtectrdModifierEx2 extends ProtectrdModifierEx1 {


public static void main(String []args){
	
	ProtectrdModifierEx2 obj =new ProtectrdModifierEx2();
	obj.display();
	obj.data=400;
	System.out.println(obj.data);
}
}