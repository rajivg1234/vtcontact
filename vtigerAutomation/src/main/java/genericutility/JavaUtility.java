package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Rajiv
 */
public class JavaUtility {
	/**
	 * This method will return system date and time in string format
	 * @return
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method will random number within 1000
	 * @return
	 */
	public int getRandamNumber() {
		Random ra=new Random();
		return ra.nextInt(1000);
	}
}
