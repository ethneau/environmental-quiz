
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class prizes{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prizes window = new prizes();
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
	public prizes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1350, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu.main(null);
				frame.dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(620, 689, 84, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Pick a Category");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.BOLD, 64));
		lblNewLabel.setBounds(434, -97, 675, 320);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Giveaway");
		btnNewButton_1.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		btnNewButton_1.setBounds(229, 200, 326, 130);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Merch");
		btnNewButton_2.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		btnNewButton_2.setBounds(782, 436, 326, 130);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Gift card");
		btnNewButton_3.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		btnNewButton_3.setBounds(783, 200, 326, 130);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Coupons");
		btnNewButton_4.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		btnNewButton_4.setBounds(229, 436, 326, 130);
		frame.getContentPane().add(btnNewButton_4);
	}
}