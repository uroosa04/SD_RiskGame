package RSG;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;

public class TwitterRG {
	Properties propRG = new Properties();
	InputStream input = null;
	String[] secretData = new String[4];
	Twitter twitterAcc;
    User user;

	public String[] getSecretData()
	{
		try {
    		input = new FileInputStream("TwitterAPIdata.properties");
    		propRG.load(input);

    		secretData[0] = propRG.getProperty("consumerKey");
    		secretData[1] = propRG.getProperty("consumerSecret");
    		secretData[2] = propRG.getProperty("accessToken");
    		secretData[3] = propRG.getProperty("accessTokenSecret");

    	} catch (IOException ex) {
    		ex.printStackTrace();
    	} finally {
    		if (input != null) {
    			try {
    				input.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}

		return secretData;
	}
	public void establishTwitterConnection(String[] data)
	{
		twitterAcc = TwitterFactory.getSingleton();
        twitterAcc.setOAuthConsumer(data[0], data[1]);
		AccessToken accessToken = new AccessToken(data[2], data[3]);
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
