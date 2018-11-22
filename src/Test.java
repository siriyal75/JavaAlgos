class BaseTest   
{  
  void print()  
  {  
    System.out.println("BaseTest:print() called");  
  }  
  
  public BaseTest() {
	  System.out.println("Base constructor called");
  }
}  
public class Test extends BaseTest   
{  
  void print()   
  {  
    System.out.println("Test:print() called");  
  }
  
  public Test() {
	  System.out.println("Child constructor called");
  }
  public static void main (String args[])  
  {  
    BaseTest b = new Test();  
    b.print();  
    
    Test c = new Test();
    c.print();
    
  }  
}  