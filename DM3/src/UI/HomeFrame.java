package UI;

import UI.ClientUI.ClientFrame;
import UI.AdminUI.AdminFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HomeFrame extends JFrame {
	
	private Map<String, UserFrame> activeFrames;

	JButton b_newAdmin = new JButton("New Admin");
	JButton b_newClient = new JButton("New Client");

	public HomeFrame(){
		String adminID = "foo";
		String clientID = "bar";

		this.activeFrames = new HashMap<String, UserFrame>();
		b_newAdmin.addActionListener(new ActionListener() {                
			@Override
			public void actionPerformed(ActionEvent e) {
				AdminFrame frame = new AdminFrame(adminID);
				activeFrames.put(adminID, frame);
			}
		});
		b_newClient.addActionListener(new ActionListener() {                
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientFrame frame = new ClientFrame(clientID);
				activeFrames.put(clientID, frame);
			}
		});
		this.setTitle("Accueil");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// Both buttons to create new frames
		this.setLayout(new GridLayout(2,1,5,5));
		this.getContentPane().add(b_newAdmin);
		this.getContentPane().add(b_newClient);
		this.setVisible(true);
		
	}
	
	public UserFrame getUserFrame(String userID){
		return activeFrames.get(userID);
	}
	
}