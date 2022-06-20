public class Overloading
{
  class addition
  {
  System.out.println("I am In addition method");
  }
  class subtraction extends addition
  {
  System.out.println("I am In Subtraction method");
  }
  public static void main(String []args)
  {
  Overloading obj = new Overloading();
  obj.addition();
  }
}