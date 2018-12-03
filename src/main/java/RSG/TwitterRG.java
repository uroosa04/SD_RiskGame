package RSG;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class TwitterRG {
	Properties propRG = new Properties();
	InputStream input = null;
	String[] secretData = new String[4];
	Twitter twitterAcc;
    User user;

	public String getSecretData1()
	{
		try {
			Scanner sc = new Scanner(new File("/Users/guillermo/Documents/TwitterAPIdata.properties"));
	        return sc.nextLine();
		}
		catch(Exception e){
            System.out.println("File Error");
        }
        return "";
	}
	
	public String getSecretData2()
	{
		try {
			Scanner sc = new Scanner(new File("/Users/guillermo/Documents/TwitterAPIdata.properties"));
			sc.nextLine();
	        return sc.nextLine();
		}
		catch(Exception e){
            System.out.println("File Error");
        }
        return "";
	}
	
	public String getSecretData3()
	{
		try {
			Scanner sc = new Scanner(new File("/Users/guillermo/Documents/TwitterAPIdata.properties"));
			sc.nextLine();
			sc.nextLine();
	        return sc.nextLine();
		}
		catch(Exception e){
            System.out.println("File Error");
        }
        return "";
	}
	
	public String getSecretData4()
	{
		try {
			Scanner sc = new Scanner(new File("/Users/guillermo/Documents/TwitterAPIdata.properties"));
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();
	        return sc.nextLine();
		}
		catch(Exception e){
            System.out.println("File Error");
        }
        return "";
	}
	
	public String[] getSecretData()
	{
		secretData[0] = getSecretData1();
		secretData[1] = getSecretData2();
		secretData[2] = getSecretData3();
		secretData[3] = getSecretData4();
		return secretData;
	}
	
	public void establishTwitterConnection(String[] data)
	{
		twitterAcc = TwitterFactory.getSingleton();
        twitterAcc.setOAuthConsumer(getSecretData1(), getSecretData2());
		AccessToken accessToken = new AccessToken(getSecretData3(), getSecretData4());
        twitterAcc.setOAuthAccessToken(accessToken);
        try {
			user = twitterAcc.verifyCredentials();
		} catch (TwitterException e) {
			e.printStackTrace();
		}

	}
	public void updateTweet(String tweet)
	{
	   try {
			Status status = twitterAcc.updateStatus(tweet);
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}
}
