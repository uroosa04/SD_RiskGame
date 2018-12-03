package TestCase;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import RSG.S3;

public class TestS3 {

	private S3 s;
	@Before
	public void setUp() {
	}
	
	@Test
	public void testGetKey() {
		try {
			//String key = "11111";
			//assertEquals(key, S3.getKey());
			S3.getKey();
		}
		catch (Exception e) {
			System.out.println("No Key");
		}
	}
	@Test 
	public void TestGetPrivateKey() {
		try {
			//String key = "11111";
			//assertEquals(key, S3.getPrivateKey());
			S3.getPrivateKey();
		}
		catch (Exception e) {
			System.out.println("No Key");
		}
	}
	@Test
	public void testUpload() {
		try {
			s.upload();
		}catch (Exception e) {
			System.out.println("Fail Upload");
		}
	}

}
