import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.net.URL;

public class DownloadTest {
//keytool -list -keystore "%JAVA_HOME%/jre/lib/security/cacerts"
    //The above checks if the certificate is alread in jdk trust store
    @Test
    public void downloadCSVFile() throws  Exception{
       // InputStream in = new URL("http://www.google.com").openStream();

       // InputStream in = new URL("https://docs.google.com/spreadsheets/d/13ABDRi6FWXJj0x-H5fn09NkKFHbEehiP5BJ2SY9eT-I/edit#gid=0").openStream();
          InputStream in = new FileInputStream("inventory - luxury.csv");
       //InputStream in = new URL("https://goo.gl/phaEbQ").openStream();

     String content = IOUtils.toString(in, "UTF-8");
       String [] lines = content.split("\n");
       for (String line : lines){
            line  = line.trim().substring(1, line.length() - 1);
            line = line.replaceAll("\"", "");
           String [] words = line.split(",");
            System.out.println(line);
        }

    }
    @Test
    public void tryJavaStyle() throws Exception{
        InputStream inn = null;
        try{
            inn = new URL("https://docs.google.com/spreadsheets/d/13ABDRi6FWXJj0x-H5fn09NkKFHbEehiP5BJ2SY9eT-I/edit#gid=0").openStream();
          //  inn = new URL("https://goo.gl/phaEbQ").openStream();
            InputStreamReader inR = new InputStreamReader(inn);
            BufferedReader buf = new BufferedReader(inR);
            String line;
            while((line = buf.readLine()) != null){

                System.out.println(line);
            }
        }
        catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println(ioe);
        }
        finally {
            if(inn != null){
                inn.close();
            }
        }
    }
}
