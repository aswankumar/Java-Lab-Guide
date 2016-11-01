import java.io.*;
class Assignment40{
  public static  void main(String args[]) throws IOException
  {
       ByteArrayOutputStream f = new ByteArrayOutputStream();
    
        byte buf[] = "This is Java Input/Output".getBytes();
         // create object of PushbackInputStream class for specified stream
      InputStream is = new ByteArrayInputStream(buf);
      PushbackInputStream pis = new PushbackInputStream(is, 1);

      try {
         // read from the buffer one character at a time

            // read a char into our array
        buf[0] = (byte) pis.read();

            // display the read byte
            System.out.print((char) buf[0]);
            pis.unread(buf, 0, 1);
             for (int i = 0; i < buf.length; i++) {

            // read a char into our array
            buf[i] = (byte) pis.read();
            if(i==0)
            {
                buf[i]='t';
            }

            // display the read byte
            System.out.print((char) buf[i]);
           
         }
            
            System.out.println((char) buf[0]);
            
         }
  catch(Exception e)
  {
      System.out.println(e);
  }
  System.out.println("\n");
}
}
