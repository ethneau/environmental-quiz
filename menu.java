
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
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
		
		JButton btnNewButton = new JButton("Quizzes");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				quiz.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Maiandra GD", Font.PLAIN, 80));
		btnNewButton.setBounds(719, 353, 436, 123);
		frame.getContentPane().add(btnNewButton);
	
		
		JButton btnNewButton1 = new JButton("Prizes");
		btnNewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				maple.main(null);
				frame.dispose();
			}
		});
		btnNewButton1.setFont(new Font("Maiandra GD", Font.PLAIN, 80));
		btnNewButton1.setBounds(125, 353, 436, 123);
		frame.getContentPane().add(btnNewButton1);
		
		JLabel lblNewLabel = new JLabel("Environment Quizzes");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.BOLD, 99));
		lblNewLabel.setBounds(112, 75, 1043, 166);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
