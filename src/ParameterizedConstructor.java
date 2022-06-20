public class ParameterizedConstructor{
int a;
int b;

public ParameterizedConstructor(int x,int y){
a= x;
b= y;

}
public void addition()
{
   int c=a+b;
   System.out.println("Addition is "+c);
}
public static void main(String[]args)
{
ParameterizedConstructor obj = new ParameterizedConstructor(35,35);
obj.addition();
}
}