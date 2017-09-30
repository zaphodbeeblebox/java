
package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Log
{
	static Logger logger = Logger.getLogger("MyLog");
	
	public Log(String logfile)
	{
//		Logger logger = Logger.getLogger("MyLog");  
		FileHandler fh;  

		try {  

		    // This block configure the logger with handler and formatter  
		    fh = new FileHandler(logfile);  
		    logger.addHandler(fh);
		    SimpleFormatter formatter = new SimpleFormatter();  
		    fh.setFormatter(formatter);  

		} catch (SecurityException e) {  
			e.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		}
	}  

	public void writelog (String logrecord)
	{
		try{
			logger.info(logrecord); 
		}
		catch (SecurityException e){ 
			e.printStackTrace(); 
		}
	}
}

 


