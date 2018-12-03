package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import RSG.Bot;

public class Testbot {

	private Bot bot;
	@Before
	public void Setup() {
		bot = new Bot();
	}
	
	@Test
	public void testGetBotName() {
		String botName = "Riskt2_bot";
		try {
			assertEquals(botName, bot.getBotUsername());
		}catch(Exception e) {
			System.out.print("No bot Name");
		}
	}
	
	@Test
	public void testTokenKey() {
		//hard code Testing
		String key = "736188520:AAF8ADMS7Ph2ZJMxbWq7yp4YxpGQipFge5M";
		
		try {
			assertEquals(key, bot.getBotToken());
		} catch(Exception e) {
			System.out.print("No Token");
		}
	}
	@Test 
	public void testSend() {
		String msg = "Hello World";
		try {
			bot.sentMessage(msg);
		}catch (Exception e) {
			System.out.println("fail to send message");
		}
	}
	@Test
	public void testReceived() {
		String msg = "Welcome";
		try {
			bot.ReceivedMsg(msg);
		}catch (Exception e ) {
			System.out.println("fail to receive message");
		}
	}
	@Test
	public void testUpdate() {
		try {
			bot.onUpdateReceived(null);
		}catch (Exception e) {
			System.out.println("No update");
		}
	}

}
