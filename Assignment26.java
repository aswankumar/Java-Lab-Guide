import java.util.*;

public class Assignment26
{
    public static void main(String[] args)
    {
        if(args.length>0)
        {
            if(args.length==10)
            {
                ArrayList<Integer> al=new ArrayList<Integer>();
                for(int i=0;i<10;i++)
                {
                    try
                    {
                        int k=Integer.parseInt(args[i]);
                        al.add(k);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter all the arguments as integers ");
                    }
                }
                for(int x=9;x>=0;x--)
                {
                    System.out.println(al.get(x));
                }
            }
            else
            {
                System.out.println("less than 10 number have been fed in ");
            }
        }
        else
        {
            System.out.println("command line arguments have not been entered ");
        }
    }
}
