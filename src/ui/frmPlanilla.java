package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class frmPlanilla extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JTextField txtUsuario;
	JPasswordField txtPassword;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPlanilla frame = new frmPlanilla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frmPlanilla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 800); 
		setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		
		
	    
	    
	    
	    
	    
		
	}

}
