
class ConstructorOverload
{
	int iNo1,iNo2;
	public ConstructorOverload(int iNumber)
	{
		iNo1=iNumber;
		System.out.println("Constructor with one argument :-");
		System.out.println("iNo1:"+iNo1+" "+"iNo2:"+iNo2);
	}
	public ConstructorOverload(int iFirst,int iSecond)
	{
		iNo1=iFirst;
		iNo2=iSecond;
		System.out.println("Cons. with two arguments:-");
		System.out.println("iNo2:"+iNo1+" "+"iNo2:"+iNo2);
	}
	public ConstructorOverload()
	{
		System.out.println("Default Constructor):-");
		System.out.println("iNo1:"+iNo1+" "+"iNo2:"+iNo2);
	}
}

public class Assignment14 {

	public static void main(String[] args)
	{
		ConstructorOverload obj1=new ConstructorOverload();
		ConstructorOverload obj2=new ConstructorOverload(10);
		ConstructorOverload obj3=new ConstructorOverload(10,20);
	}
}
