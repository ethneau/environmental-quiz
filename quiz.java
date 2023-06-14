
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class quiz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz window = new quiz();
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
	public quiz() {
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
	
		
		JComboBox Categories = new JComboBox();
		Categories.setEditable(true);
		Categories.setFont(new Font("Maiandra GD", Font.PLAIN, 55));
		Categories.setBounds(254, 295, 834, 167);
		frame.getContentPane().add(Categories);
		
		Categories.setSelectedItem("Select a Category");
		Categories.addItem("Garbage");
		Categories.addItem("Environment");
	
		
		JComboBox Diffculty = new JComboBox();
		Diffculty.setEditable(true);
		Diffculty.setFont(new Font("Maiandra GD", Font.PLAIN, 55));
		Diffculty.setBounds(254, 488, 834, 172);
		frame.getContentPane().add(Diffculty);
		
		Diffculty.setSelectedItem("Select a Diffculty");
		Diffculty.addItem("Easy");
		Diffculty.addItem("Medium");
		Diffculty.addItem("Hard");
		
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				quizGUI.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(603, 671, 89, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Menu");
		btnNewButton.setBounds(469, 683, 89, 40);
		frame.getContentPane().add(btnNewButton1);
		
		JLabel lblNewLabel = new JLabel("Select your Quiz");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.BOLD, 99));
		lblNewLabel.setBounds(274, 58, 779, 207);
		frame.getContentPane().add(lblNewLabel);
		
	}
}