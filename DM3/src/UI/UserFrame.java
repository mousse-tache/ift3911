package UI;

import javax.swing.JButton;
import javax.swing.JFrame;

import Sessions.Session;

public class UserFrame extends JFrame{
	
	String userID;
	Session userSession;
	
	public UserFrame(String userID){
		this.userID = userID;
	}
	
	public void close(Session s) {
		this.dispose();
	}
}
