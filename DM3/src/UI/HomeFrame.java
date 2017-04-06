package UI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import Sessions.Session;

public class HomeFrame extends JFrame {


	JButton b_newAdmin = new JButton("New Admin");
	JButton b_newClient = new JButton("New Client");
	
	/**
	 * 
	 * @param username
	 * @param pass
	 */
	public Boolean login(String username, String pass) {
		// TODO - implement HomeFrame.login
		throw new UnsupportedOperationException();
	}

	public HomeFrame(){
		this.setTitle("Accueil");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// Both buttons to create new frames
		this.setLayout(new GridLayout(2,1,5,5));
		this.getContentPane().add(b_newAdmin);
		this.getContentPane().add(b_newClient);
		this.setVisible(true);
		
	}
	
}