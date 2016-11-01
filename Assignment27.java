public class Assignment27 {
public void division(){
	int iNumerator = 10;
	int iDenominator = 0;
	try {
              System.out.println(iNumerator + "/" + iDenominator+ "=" + (iNumerator/iDenominator));
		   System.out.println(" After Exception ");
	     }
	     	
          catch(NullPointerException e){
 	     System.out.println("Null Pointer Exception");
	}
     catch(ArithmeticException e){
	   System.out.println("Divide By Zero Error");
	}
	catch(Exception e){
		System.out.println("In the exception catch block");
}


     finally {
 	    System.out.println(" After Handling Exception ");
		}
		System.out.println("Happy Learning");
	}
	public static void main(String args[]){
	new Assignment27().division();
	System.out.println("End of Main ");
}
}
