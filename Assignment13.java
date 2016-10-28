public class Assignment13
	{
		public int findSquare(int iNumber)
		{
			return (iNumber*iNumber);
		}
		public double findSquare(double iNumber)
		{
			return (iNumber*iNumber);
		}
	public static void main(String[] args)
	{
		Assignment13 mold=new Assignment13();
		System.out.println("Integer method :"+mold.findSquare(23));
		System.out.println("Double method  :"+mold.findSquare(23.0));
		}

}
