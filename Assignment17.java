abstract class Demo
{
	protected static int count;
	private int number;
	abstract void getValues();
	
	final void displayValues()
	{
	}
	//final void compute(){}
}

final class Assignment17 extends Demo
{
	int value;
	//Assignment17(int temp){value=temp;}
	public static void main(String[] args)
	{
		Demo object=new Assignment17();
	}
	void getValues(){}
	void compute(){}
	
	void incrementCount(){count++;}
	//void incrementNumber(){number++;}
	
}
