
public class Assignment23 {
	
	public static void main(String[] args)
	{
		int count=0;
		if (args.length>0)
		{
			for(int i=0;i<args[0].length();i++)
			{
				if(args[0].charAt(i)=='w' || args[0].charAt(i)=='W')
				{
					count++;
				}
			}
			for(int i=0;i<args[1].length();i++)
			{
				if(args[1].charAt(i)=='w' || args[1].charAt(i)=='W')
					count++;
			}
			System.out.println("Occurences of 'w' or 'W' in both strings :"+count);
			args[0]=args[0].replace('w','T');
			args[0]=args[0].replace('W','T');
			args[1]=args[1].replace('w','T');
			args[1]=args[1].replace('W','T');
			System.out.println("Replacing 'w' or 'W' by 'T' :"+args[0]+" "+args[1]);
			args[0]=args[0].toUpperCase();
			args[1]=args[1].toUpperCase();
			System.out.println("Converting strings to upper case :"+args[0]+" "+args[1]);
			args[0]=args[0].concat(args[1]);
			System.out.println("After cancatenation :"+args[0]);
		}
	}

}
