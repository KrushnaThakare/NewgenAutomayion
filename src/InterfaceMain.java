interface TestInterface{
void display();

}
class InterfaceImplements implements TestInterface {
public void display(){
System.out.println("Hello World..");
}
} 
public class InterfaceMain{
public static void main(String[]args){
InterfaceImplements obj = new InterfaceImplements();
obj.display();
}
}