
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class quizSelect{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quizSelect window = new quizSelect();
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
	public quizSelect() {
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
	
		
		JComboBox<String> categories = new JComboBox<String>();
		categories.setEditable(false);
		categories.setFont(new Font("Kumbh Sans Light", Font.PLAIN, 55));
		categories.setBounds(650, 295, 400, 130);
		frame.getContentPane().add(categories);
		
		JLabel categorylbl = new JLabel("Category");
		categorylbl.setFont(new Font("Kumbh Sans Light", Font.PLAIN, 55));
		categorylbl.setBounds(200,250,500,200);
		frame.getContentPane().add(categorylbl);

		categories.setSelectedItem("Select a Category");
		categories.addItem("Garbage");
		categories.addItem("Environment");
	
		
		JComboBox<String> difficulty = new JComboBox<String>();
		difficulty.setEditable(true);
		difficulty.setFont(new Font("Maiandra GD", Font.PLAIN, 55));
		difficulty.setBounds(650, 488, 400, 130);
		frame.getContentPane().add(difficulty);
		
		difficulty.addItem("Easy");
		difficulty.addItem("Medium");
		difficulty.addItem("Hard");
		
		
		
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
		
		JLabel title = new JLabel("Settings");
		title.setFont(new Font("Maiandra GD", Font.BOLD, 99));
		title.setBounds(274, 58, 779, 207);
		frame.getContentPane().add(title);
		
	}
}