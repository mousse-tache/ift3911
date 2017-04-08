package UI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
                b_newAdmin.addActionListener(new ActionListener() {                
                
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //TODO set new Admin frame
                    }
                });
                b_newClient.addActionListener(new ActionListener() {                
                
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                });
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