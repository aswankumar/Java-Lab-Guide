
public class Assignment11 {
	
	public static void main(String[] args)
	{
		double arr[]=new double[args.length];
		double temp=0;
		if (args.length>0)
		{
			for(int i=0;i<args.length;i++)
			{
				arr[i]=Double.parseDouble(args[i]);
			}
		}
		for(int j=0;j<arr.length-1;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]>arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
	}

}
