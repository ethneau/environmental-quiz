import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class endLose {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					endLose window = new endLose();
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
	public endLose() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Quiz Game");
		frame.setSize(1350, 760);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You Lose!");
		lblNewLabel.setForeground(new Color(178, 34, 34));
		lblNewLabel.setBounds(357, 132, 655, 157);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 70));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("~~ POINTS ~~");
		lblNewLabel_1.setForeground(new Color(218, 165, 32));
		lblNewLabel_1.setFont(new Font("Poppins Medium", Font.PLAIN, 60));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(456, 282, 449, 102);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("No points earned");
		lblNewLabel_2.setForeground(new Color(218, 165, 32));
		lblNewLabel_2.setFont(new Font("Poppins", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(491, 379, 381, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("MENU");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 20));
		btnNewButton.setBounds(595, 474, 183, 73);
		frame.getContentPane().add(btnNewButton);
	}

}
