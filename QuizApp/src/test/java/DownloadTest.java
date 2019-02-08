import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static sun.java2d.cmm.ColorTransform.In;

public class DownloadTest {
    private static String DOWNLOAD_URL = "https://raw.githubusercontent.com/vsbuffalo/quotes/master/quotes.txt";
    private static  String QUOTES_URL = "https://gist.githubusercontent.com/nasrulhazim/54b659e43b1035215cd0ba1d4577ee80/raw/e3c6895ce42069f0ee7e991229064f167fe8ccdc/quotes.json";

            public void testDownloadFile(){
                try{
                   // InputStream in = new
                   // String str = IOUtils
                    String tester = null;
                }
                catch (MalformedURLException e){
                    e.printStackTrace();
                }
                catch (IOException e){
                    e.printStackTrace();

                }

            }
}
