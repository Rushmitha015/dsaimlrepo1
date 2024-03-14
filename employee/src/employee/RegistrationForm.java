package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationForm {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window = new RegistrationForm();
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
	public RegistrationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setBounds(132, 22, 183, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(40, 44, 46, 14);
		frame.getContentPane().add(lblName);
		
		tb1 = new JTextField();
		tb1.setBounds(132, 41, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Roll :");
		lblNewLabel_1.setBounds(40, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb2 = new JTextField();
		tb2.setBounds(132, 78, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Branch :");
		lblNewLabel_2.setBounds(40, 111, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "ds", "it", "cse", "iot"}));
		cb1.setBounds(132, 109, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Gender:");
		lblNewLabel_3.setBounds(40, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setBounds(124, 149, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setBounds(254, 149, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_4 = new JLabel("Prog Lang:");
		lblNewLabel_4.setBounds(40, 196, 58, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(121, 192, 58, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Java");
		c2.setBounds(198, 192, 86, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("Python");
		c3.setBounds(286, 192, 97, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup ();
		bg.add(r2);
		bg.add(r1);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				
				String name=tb1.getText();
				String roll=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs=" ";
				if(r2.isSelected())
				{
					gender="male";
				
				}
				else
				{
					gender="female";
				}
				if(c1.isSelected ())
				{
					langs=langs+"c";
				}
				if(c2.isSelected())
				{
					langs=langs+"java";
				}
				if(c3.isSelected())
				{
					langs=langs+"python";
				}
				JOptionPane.showMessageDialog(btnNewButton,
						"name "+name+"\n roll no "+roll+"\n branch"+branch+"\n gender "+gender+"\n prog langs "+langs);
			}
		});
		btnNewButton.setBounds(163, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
