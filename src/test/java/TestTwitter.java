package Testing;
package RSG;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import RSG.TwitterRG;

public class TestTwitter {
	private TwitterRG tweet;
	String [] data = new String[4];
	@Before
	public void setup() {
		tweet = new TwitterRG();	
		data[0] = "Hi Error";
		data[1] = "File Error";
		data[2] = "File Error";
		data[3] = "File Error";
	}
	
	@Test
	public void TestGetData1()  throws Exception{
		data[0] = tweet.getSecretData1();
		assertEquals(data[0],tweet.getSecretData1());
	}
	
	@Test
	public void TestGetData2()  throws Exception{
		data[1] = tweet.getSecretData2();
		assertEquals(data[1],tweet.getSecretData2());
	}
	
	@Test
	public void TestGetData3() throws Exception {
		data[2] = tweet.getSecretData3();
		assertEquals(data[2],tweet.getSecretData3());
	}
	
	@Test
	public void TestGetData4() throws Exception {
		data[3] = tweet.getSecretData4();
		assertEquals(data[3],tweet.getSecretData4());
	}
	
	@Test 
	public void testConnection() throws Exception {
		//tweet.establishTwitterConnection(data);
	}
	@Test
	public void testSecureDate() throws Exception {
		tweet.getSecretData();
	}
	@Test
	public void testUpdate() {
		String test = "System error";
		try {
			tweet.updateTweet(test);
		}catch (Exception e){
			System.out.println(test);
		}
		
	}

}
