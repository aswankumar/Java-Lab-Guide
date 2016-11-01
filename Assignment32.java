import java.util.ResourceBundle;

public class Assignment32{

	/* Resourcebundle class object */
	ResourceBundle resourcebundle;

	public ReadProperties(){

           resourcebundle=ResourceBundle.getBundle
                                         ("Trainings ");

	     /* getting the key names present in the properties
             file and split w r t ',' given in the properties
             in order to get each value which is separated by   
             ','*/

             String sType[]=resourcebundle.
                                   getString("Type").split(",");
             String sBu[]=resourcebundle.
                                   getString("BU").split(",");
		  String sLoc[]=resourcebundle.
                                getString("Location").split(",");

		/* Loop for getting each of the values present 
              in the string array */

		for (int iIndex=0;iIndex<sType.length;iIndex++){
			System.out.println("Type :"+(loopIndex+1));
			System.out.println("Type   	:"+sType[iIndex]);
			System.out.println("BU	:"+sBu[iIndex]);
			System.out.println("Loc	:”+sLoc[iIndex]);    
		}
	}
	public static void main(String[] args) {
      	Assignment32 readproperties=new Assignment32();
   }

}
