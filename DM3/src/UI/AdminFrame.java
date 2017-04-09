package UI;

import javax.swing.JFrame;

public class AdminFrame extends UserFrame {

	public AdminFrame(String adminID) {
		super(adminID);
		this.setTitle("ADMIN SESSION");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}