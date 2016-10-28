
interface MyInterface{}
class MyClass1{}
class MyClass2 extends MyClass1 implements MyInterface{}
class MyClass3 implements MyInterface{}

public class Assignment21 
{
	
	public static void main(String[] args)
	{
		MyClass1 class1Object=new MyClass1();
		MyClass2 class2Object=new MyClass2();
		MyClass3 class3Object=new MyClass3();
		//class2Object=class3Object;
		//class3Object=class2Object;
		MyInterface InterfaeRef=class2Object;
		//class3Object=(MyClass3)class2Object;
		//class2Object=class1Object;
		//class2Object=(MyClass2)class1Object;
		
	}
	
}
