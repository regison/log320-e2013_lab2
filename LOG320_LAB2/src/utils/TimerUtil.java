/**
 * 
 */
package utils;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author Regison
 *
 */
public class TimerUtil{

	public long timer;
	
	public void start(){
		timer  = System.nanoTime();
		
		final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");  
		 final java.util.Timer tmr = new java.util.Timer();  
		    tmr.scheduleAtFixedRate(new TimerTask()  
		    {  
		      public void run()  
		      {  
		        System.out.print("\r"+sdf.format(new Date()));  
		      }  
		    },0,1000);  
		  }  
	
	
	public float getTimeElapsed(){
		return ((System.nanoTime() - timer)/ 1000000);
	}
	public void stop(){
		
	}
	
}
