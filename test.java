import logging.Log;


public class HelloWorld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log test = new Log (args[0]);
		test.writelog("first log write");
		test.writelog ("finished ok");
		//	System.out.println("Hello Luke!");
	}

}
