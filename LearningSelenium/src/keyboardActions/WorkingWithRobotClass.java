package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class WorkingWithRobotClass extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		setUp("chrome",20,"https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=EAIaIQobChMIsIjXva7_iwMVf6RmAh1hUQaGEAAYASAAEgKoZvD_BwE");
          Robot r=new Robot();
          
          //Press Ctrl+Shift+I
          r.keyPress(KeyEvent.VK_CONTROL);
          r.keyPress(KeyEvent.VK_SHIFT);
          r.keyPress(KeyEvent.VK_I);
          //to release key
          r.keyRelease(KeyEvent.VK_CONTROL);
          r.keyRelease(KeyEvent.VK_SHIFT);
          r.keyRelease(KeyEvent.VK_I);
          
          for(int i=0;i<2;i++)
          {
        	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
        	  Thread.sleep(2000);
          }
	}

}
