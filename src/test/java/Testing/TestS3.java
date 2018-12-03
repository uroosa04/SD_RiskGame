package Testing;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

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
			S3.getKey();
		}
		catch (Exception e) {
			System.out.println("No Key");
		}
	}
	@Test 
	public void TestGetPrivateKey() {
		try {
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
