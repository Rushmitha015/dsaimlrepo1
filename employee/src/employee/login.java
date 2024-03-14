package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(104, 33, 249, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setBounds(32, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel p1 = new JLabel("ROLL NO :");
		p1.setBounds(20, 92, 57, 14);
		frame.getContentPane().add(p1);
		
		tb1 = new JTextField();
		tb1.setBounds(77, 58, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBounds(77, 89, 86, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String name=tb1.getText();
			String password=TB2.getText();
			//JOptionPane.showMessageDialog(btnNewButton, "name "+name+"\n password"+password);
			if(name.equals("rushi") && password.equals("12345"))
			{
				JOptionPane.showMessageDialog(btnNewButton, "Valid user");
			}
			else
			{
				JOptionPane.showMessageDialog(btnNewutton, "Invalid user");	
			}
			}
			
		});
		btnNewButton.setBounds(145, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
