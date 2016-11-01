import java.io.*;
class Employee implements Serializable{        //(5)                                                  
   String sName;
   int iEmpNo;
   double dSalary;
	
   public Employee(String sName,int iEmpNo, double dSalary){
   	   this.sName = sName;
    	   this.iEmpNo = iEmpNo;
  	   this.dSalary = dSalary;
	}

	public String toString(){
		return "Name= " + sName + ";Empno= "+ iEmpNo +
                        ";Salary= "+dSalary;
	}
}

public class Assignment41{
   public static void main(String args[]){
	try {
	   Employee objEmployee = new Employee("Konrad",390,48000);

         FileOutputStream objFileOp = 
                     new FileOutputStream("Object.dat");  //(1)

         /* Code to store the state of the object */
	   ObjectOutputStream objectOp =
                 new ObjectOutputStream(objFileOp);  //(2)

	   objectOp.writeObject(objEmployee);	    //(3) 					                  
	   System.out.print("Object Written to a File ");
	   objectOp.flush();
	   objectOp.close();
     }
     catch(Exception e){
	   System.out.println("Error : " + e);                                                                                
        System.exit(0);
     }

     try {
	   Employee objEmp;
        /* Code to Read the Object From the file */
	   FileInputStream objFileIp =
                     new FileInputStream("Object.dat");  //(4)  
  ObjectInputStream objectIp = 
                new ObjectInputStream(objFileIp);  //(5) 
              
	  objEmp =(Employee)objectIp.readObject();	//(6)			                  
	  System.out.println("Contents Are : " + objEmp);
	  objectIp.close();
	}
	catch(Exception e){
	  System.out.println("Error : " + e);
	  System.exit(0);
     }
 }
}

     
