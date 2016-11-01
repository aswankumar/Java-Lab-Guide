import java.util.*;
public class Assignment25 {

   public static void main(String args[]) {
      // Create a hash map
      if (args.length>0)
      {
          Hashtable<String,String> balance = new Hashtable<String,String>();
          Enumeration names;
          String str;
    
          balance.put("Pune", "INDIA");
          balance.put("Adelaide", "Australia");
          balance.put("ChristChurch", "NewZeland");
          balance.put("LasVegas", "USA");
          balance.put("Paris", "France");
    
          // Show all balances in hash table.
          names = balance.keys();
          
          int check=0;
          String res="";
          System.out.println("Available Cities :");
          while(names.hasMoreElements()) {
             str = (String) names.nextElement();
             System.out.println(str);
             if (str.equalsIgnoreCase(args[0]))
             {
             res=str + ": " + balance.get(str);
             check=1;
             }
          }  
          System.out.println("*****************************");
          if (check==0)
            System.out.println("Please enter a valid city name ");
          else
            System.out.println(res);
      }
      else
      {
          System.out.println("Please enter the city name as command line argument ");
      }
   }
}