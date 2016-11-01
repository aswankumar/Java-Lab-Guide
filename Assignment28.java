public class HelloWorld {
	public void division(){
		int iNumerator = 10;
		int iDenominator = 0;
		try{
               System.out.println(iNumerator + "/" + iDenominator
                               + "=" +(iNumerator/iDenominator));
		} 
           catch (NullPointerException e){
 		   System.out.println("Null Pointer Exception ");
		}
		     catch(ArithmeticException e){
	   System.out.println("Divide By Zero Error");
	}

           finally {
		   System.out.println("End of Excep.Finally Block");
		}
		System.out.println("After Exception Handler ");
	}
	public static void main(String args[]){
			new HelloWorld().division();
	        	System.out.println("End of Main ");
	}
}
