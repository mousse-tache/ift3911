package UI;

import javax.swing.JFrame;

public class ClientFrame extends UserFrame {
	
	public ClientFrame(String clientID){
		super(clientID);
		this.setTitle("CLIENT SESSION");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}