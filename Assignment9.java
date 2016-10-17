package Assignments;
class StaticAndNonStatic {
	  static int iStatic;
	  char cChoice;
	   StaticAndNonStatic(char choice) {
		      iStatic++;
		      cChoice =choice;
		  }
	   static void displayObjectCount()  {
		   System.out.println("Value of iStatic : "+ iStatic);
	   }

	   void displayUserChoice(){
		     System.out.println("The user choice is   "+ cChoice);
		  }
		}
public class Assignment9  {
	   public static void main(String args[])  {
	      System.out.println("Before creating objects");
	      StaticAndNonStatic.displayObjectCount();

	      System.out.println();
	      System.out.println("After creating objects");
	      StaticAndNonStatic object = new StaticAndNonStatic('N');
	                             
	      StaticAndNonStatic.displayObjectCount();
	      object.displayUserChoice();
	  }
	}
