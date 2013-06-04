package tests;


import utils.TimerUtil;
import junit.framework.TestCase;

public class TimerUtilTest extends TestCase {

	public void testTimer(){
		TimerUtil timer = new TimerUtil();
		timer.start();
	}
}
