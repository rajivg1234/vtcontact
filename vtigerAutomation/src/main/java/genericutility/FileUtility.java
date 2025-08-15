package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Rajiv
 */
public class FileUtility {
	/**
	 * This method will read data from property file and return value to the caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDatafromProperty(String key) throws IOException {
	 FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
	 Properties pro=new Properties();
	 pro.load(fis);
	 return pro.getProperty(key);
	}	
}
