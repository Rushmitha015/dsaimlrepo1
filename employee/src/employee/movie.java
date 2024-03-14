package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class movie {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(102, 106, 76, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KUSHI", "Geeta Govindam", "FamilyStar"}));
		cb1.setBounds(83, 81, 89, 22);
		frame.getContentPane().add(cb1);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(192, 192, 192));
		tb1.setForeground(new Color(0, 255, 255));
		tb1.setBounds(73, 57, 59, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("No of Tkts:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(10, 108, 110, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Name :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 58, 76, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE APP");
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setBackground(new Color(128, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(162, 41, 163, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Movie :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 83, 76, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=tb1.getText();
				String movie=(String)cb1.getSelectedItem();
				String tickets=(String)cb2.getSelectedItem();
			int nt = Integer.parseInt(tickets);
				if(movie.equals("KUSHI"))
				{
					bill = bill+150*nt;
					
				}
				if(movie.equals("Geeta Govindam"))
				{
					bill = bill+250*nt;
					
				}
				if(movie.equals("FamilyStar"))
				{
					bill = bill+350*nt;
					
				}
				int res=0;
			    res=JOptionPane.showConfirmDialog(btnNewButton,"name "+name+"\n movie "+movie+
					"\n no of tickets "+tickets+"\n Amount"+bill);
			    int YES_OPTION=0;
			    if(res==YES_OPTION)
			    {
			    	JOptionPane.showMessageDialog(btnNewButton,"Booking Confirmed");	
			    }
			    else
			    {
			    	JOptionPane.showMessageDialog(btnNewButton,"Booking Cancelled");	
			    
			    }
			}
		});
		btnNewButton.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("MOVIE APP");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADM\\Pictures\\images1.jpg"));
		lblNewLabel.setBounds(0, -11, 444, 272);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
