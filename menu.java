
import java.awt.Color;
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
		frame.setSize(1350, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton quizzes = new JButton("Quizzes");
		quizzes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				quizSelect.main(null);
				frame.dispose();
			}
		});
		quizzes.setFont(new Font("Kumbh Sans Light", Font.PLAIN, 80));
		quizzes.setBounds(728, 353, 436, 123);
		quizzes.setBackground(new Color(176, 211, 173));
		frame.getContentPane().add(quizzes);
	
		
		JButton prizes = new JButton("Prizes");
		prizes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				prizesMenu.main(null);
				frame.dispose();
			}
		});
		prizes.setFont(new Font("Kumbh Sans Light", Font.PLAIN, 80));
		prizes.setBounds(155, 353, 436, 123);
		frame.getContentPane().add(prizes);
		
		JLabel title = new JLabel("Environment Quizzes");
		title.setFont(new Font("Kumbh Sans Light", Font.PLAIN, 99));
		title.setBounds(160, 75, 1043, 166);
		frame.getContentPane().add(title);
		

	}
}
