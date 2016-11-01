import java.io.*;

public class Assignment35{
    public static void main(String[] args) throws IOException {
        try {
            BufferedOutputStream objDataOp = 
                   new BufferedOutputStream(
                        new FileOutputStream("Trng"));     //(1)

            double[] dExp = {9.5, 9.7,3.3, 2.9, 4.9};
            int[] iEmpno = { 120, 210, 390, 480, 570 };
            String[] sName = { "Ashwaq","Jagan","Konrad","Shekar"
                                 , "Gopal"};                                        
         for(int iIndex=0;iIndex<dExp.length;iIndex++){ //(2)
            String str=dExp[iIndex]+"\t"+iEmpno[iIndex]+"\t"+sName[iIndex];
            objDataOp.write(str.getBytes());
            objDataOp.write("\n".getBytes()); 
        }
        objDataOp.close();
    }
    catch (IOException E) {
        System.out.println("Error: " + E);
    }
try {
      BufferedInputStream objDataIp = new BufferedInputStream(
                           new FileInputStream("Trng"));  //(3)

      
      String sName;
      double total = 0.0;

      try {
        while (objDataIp.available()>0) {
          System.out.print((char)objDataIp.read());
       }
     }
     catch (EOFException e) {
         System.out.println(" File Read Error : " + e);
     }
     objDataIp.close();
   }
   catch(Exception f){
      System.out.println("File Not Found : "+ f);
   }
 }
}
