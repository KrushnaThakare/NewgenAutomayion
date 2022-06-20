class InstanceVariable{

int c;

public void subtraction(int x, int y)
{
c=x-y;
System.out.println("Subtraction is "+c);
}
public void addition(int x, int y)
{
c=x+y;
System.out.println("Addition is"+c);
}
public static void main(String[] args){

InstanceVariable obj1 = new InstanceVariable();
obj1.addition(100,50);

 InstanceVariable obj2 = new InstanceVariable();
obj2.subtraction(10,50);
}
}