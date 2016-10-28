
public class Assignment12 {
	
	public static void main(String[] args)
	{
		if(args.length>0)
		{
			double val=Double.parseDouble(args[0]);
			System.out.println("Absolute Value  :"+Math.abs(val));
			System.out.println("Round off Value :"+Math.round (val * 10000.0) / 10000.0);
			System.out.println("Square root value :"+Math.sqrt(val));
		}
	}

}
