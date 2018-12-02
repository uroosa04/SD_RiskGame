package RSG;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.io.*;
import java.util.ArrayList;

public class Bot extends TelegramLongPollingBot {
	
    @Override
    public void onUpdateReceived(Update update) {
    	// We check if the update has a message and the message has text
    	
    	//System.out.println(update.getMessage().getText());
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
        	
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            //System.out.println(message_text);
            	
            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
            System.out.println(message_text);
            ReceivedMsg(message_text);
        }
        /*
           
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }*/
    }

   
    public void ReceivedMsg(String msg) {
    	
    	
    	/*if (Msg.exists()) {
    		Msg.delete();
    	}*/
    	try {
    		//System.out.println(msg);
    		File Msg = new File("ReceivedMsg");
    		//Msg.createNewFile();
        	//File Msgs = new File("ReceivedMsg.txt");
        	FileWriter save = new FileWriter(Msg, true);
        	save.write("\n" + msg);
        	save.close();
        	
        	}catch (IOException e) {
        		e.printStackTrace();
        	}
    }
    
    public void sentMessage(String message) {
    	SendMessage msg = new SendMessage()
    			.setChatId("-273082351")
    			.setText(message);
    	
    	try {
    		execute(msg);
    	}  catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    	

    @Override
    public String getBotUsername() {
        // Return bot username
        return "Riskt2_bot";
    }

    @Override
    public String getBotToken() {
        // return bot token
        //TO TA's, the API key has not been posted here to keep is confidential. You may request this through email.
        return "736188520:AAF8ADMS7Ph2ZJMxbWq7yp4YxpGQipFge5M";
    }

}
