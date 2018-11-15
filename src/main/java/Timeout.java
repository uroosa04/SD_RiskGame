import java.util.Timer;
import java.util.TimerTask;
import java.io.BufferedReader;
import java.io.*;

public class Timeout {
	private String input = "";
	
	TimerTask check = new TimerTask(){
		public void run() {
			if(input.equals("")) {
				System.out.println("No Input");
				System.exit(0);
			}
		}
		
	};
	
	public void getReply() throws Exception
	{
		Timer timer = new Timer();
		//30 second 
		timer.schedule(check, 30*10000);
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		input = read.readLine();
		
		timer.cancel();
	}
	

}
