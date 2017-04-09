package UI;

import javax.swing.JFrame;

import Sessions.Session;

public abstract class UserFrame extends JFrame{
	
	String userID;
	Session userSession;
	public UserFrame() {
        initComponents();
    }
        
	public UserFrame(String userID){
		this.userID = userID;
	}
	
	public void close(Session s) {
		this.dispose();
	}
        
        private void initComponents(){}
}
