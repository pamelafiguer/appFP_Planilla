package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class frmLogin extends JFrame {
	JTextField txtUsuario;
	JPasswordField txtPassword;
	

	private static final long serialVersionUID = 1L;
	
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground( new Color(94, 17, 90));
		pnlLogin.setBounds(0, 0, 450, 50);
		pnlLogin.setLayout(null);
		getContentPane().add(pnlLogin);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setIcon( new ImageIcon(frmLogin.class.getResource("/ui/img/logo.png")));
		imgLogo.setBounds(96, 3, 208,43);
		pnlLogin.add(imgLogo);
		
		JLabel imgSalir = new JLabel();
		imgSalir.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) {}});
		imgSalir.setIcon( new ImageIcon(frmLogin.class.getResource("/ui/img/salir.png")));
		imgSalir.setBounds(370, 12, 24, 24);
		pnlLogin.add(imgSalir);
		
		JLabel lblUsuario = new JLabel("Usuario : ");
	    lblUsuario.setBounds(100, 100, 80, 30);
	    getContentPane().add(lblUsuario);
	    
	    JLabel lblPassword = new JLabel("Password : ");
	    lblPassword.setBounds(100, 140, 80, 30);
	    getContentPane().add(lblPassword);
	    
	    txtUsuario = new JTextField();
	    txtUsuario.setBounds(180, 100, 100, 30 );
	    txtUsuario.setColumns(8);
	    txtUsuario.setMargin( new Insets(5, 10, 5, 10));
	    getContentPane().add(txtUsuario);
	    
	    txtPassword = new JPasswordField();
	    txtPassword.setBounds(180, 140, 100, 30 );
	    txtPassword.setColumns(6);
	    txtPassword.setMargin( new Insets(5, 10, 5, 10));
	    getContentPane().add(txtPassword);
	    
	    JButton btnIngresar = new JButton("Ingresar");
	    btnIngresar.setBackground( new Color(94, 17, 90));
	    btnIngresar.setBorderPainted(false);
	    btnIngresar.setBounds(80, 200, 100, 30);
	    btnIngresar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnIngresar.setFocusPainted(false);
	    btnIngresar.setForeground(Color.WHITE);
	    getContentPane().add(btnIngresar);
	    
	    JButton btnCancelar = new JButton("Cancelar");
	    btnCancelar.setBackground( new Color (94, 17, 90));
	    btnCancelar.setBounds(240, 200, 100, 30);
	    btnCancelar.setBorderPainted(false);
	    btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnCancelar.setBorderPainted(false);
	    btnCancelar.setFocusPainted(false);
	    btnCancelar.setForeground(Color.WHITE);
	    getContentPane().add(btnCancelar);
	    
	    
	    imgSalir.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) { imgSalir_mouseClicked(); } });
	    
	    txtUsuario.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent e) {txt_keyTyped(e); } });
	    txtPassword.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent e) { txt_keyTyped(e);}  });
	    
	    btnIngresar.addFocusListener(new FocusAdapter() {
	    	public void focusGained(FocusEvent e) { btn_mouseEntered( btnIngresar ); }
	    	public void focusLost(FocusEvent e) { btn_mouseExited( btnIngresar); } });
	    
	    btnIngresar.addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent e) { btn_mouseEntered( btnIngresar ); }
	    	public void mouseExited(MouseEvent e) { btn_mouseExited( btnIngresar );} });
	    btnIngresar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {btnIngresar_actionPerformed(); } });
	    
	
	  btnCancelar.addFocusListener(new FocusAdapter() {
	    	public void focusGained(FocusEvent e) { btn_mouseEntered( btnCancelar ); }
	    	public void focusLost(FocusEvent e) { btn_mouseExited( btnCancelar); } });
	    
	    btnCancelar.addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent e) { btn_mouseEntered( btnCancelar ); }
	    	public void mouseExited(MouseEvent e) { btn_mouseExited( btnCancelar );} });
	    btnCancelar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {btnCancelar_actionPerformed(); } });
	    }

	protected void txt_keyTyped(KeyEvent e) {
		JTextField txt = (JTextField) e.getSource();
		if ( !Character.isDigit( e.getKeyChar() ) ||
				txt.getText().length() >= txt.getColumns() )
			e.consume();
		
	}
	
	protected void btn_mouseEntered(JButton btn) {
		btn.setBackground( Color.BLACK );
	
	}
	protected void btn_mouseExited(JButton btn) {
		btn.setBackground( new Color(94, 17, 90) );
		
	}
	protected void btnIngresar_actionPerformed() {
		
		
	}
	
    protected void btnCancelar_actionPerformed() {
		txtUsuario.setText("");
		txtPassword.setText("");
		txtUsuario.requestFocus();
	}
	
    protected void imgSalir_mouseClicked() {
    	if ( JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir" , JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION )
    			System.exit(0);
	
		
	}


}
