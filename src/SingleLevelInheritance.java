class ClassA {
public void display(){
System.out.println("I am in Parent class A");
}
}
class ClassB extends ClassA{
public void print()
{
System.out.println("I am in child class B");
}
}


public class SingleLevelInheritance {
	public static void main(String args[])
	{
	ClassA obj1 = new ClassA();
	obj1.display();

	ClassB obj2 = new ClassB();
	obj2.display();
	obj2.print();
	}
}
