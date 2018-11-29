package RSG;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class S3 {
	
	S3(){}
	
	static String bucketName = "riskgame";
	static String fileName = "UploadedGame";
	static String path = "/Users/guillermo/Documents/SD_RiskGame/game.txt";
	
	public static String getKey() {
		try {
			Scanner sc = new Scanner(new File("/Users/guillermo/Documents/AWSCredentials.properties"));
	        return sc.nextLine();
		}
		catch(Exception e){
            System.out.println("File Error");
        }
        return "";
	}
	
	public static String getPrivateKey() {
		try {
			Scanner sc = new Scanner(new File("/Users/guillermo/Documents/AWSCredentials.properties"));
			sc.nextLine();
	        return sc.nextLine();
		}
		catch(Exception e){
            System.out.println("File Error");
        }
        return "";
	}
	
	public void upload() {
		
		BasicAWSCredentials creds = new BasicAWSCredentials(getKey(), getPrivateKey());
		
		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(creds))
                .withRegion("us-east-2")
                .build();
		
		PutObjectRequest request = new PutObjectRequest(bucketName, fileName, new File(path));
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType("plain/text");
        metadata.addUserMetadata("x-amz-meta-title", "someTitle");
        request.setMetadata(metadata);
        s3Client.putObject(request);
	}
}