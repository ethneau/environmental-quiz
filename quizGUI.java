

import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.GroupLayout.Alignment;

public class quizGUI extends JFrame implements ActionListener {

	// Declare UI components
	private JLabel questionLabel;
	private JButton optionA;
	private JButton optionB;
	private JButton optionC;
	private JButton optionD;
	private JButton nextButton;
	private ButtonGroup optionGroup;
	private JLabel lives;

	// Initialize quiz variables
	private String[] questions;
	private String[][] options;
	private int currentQuestion = 0;
	private String[] answerkey;
	private String[] difficulty;
	private int numberoflives = 5;
	
	public quizGUI() throws IOException {
		File myObj = new File("questions.txt");
		Scanner reader = new Scanner(myObj);
		int lineCount = 1;

		while (reader.hasNextLine()) {
			reader.nextLine();
			lineCount++;
		}
		reader.close();
		Scanner reader2 = new Scanner(myObj);
		String data = reader2.nextLine();
		int j = 0;
		difficulty = new String[lineCount];
		questions = new String[lineCount];
		options = new String[lineCount][4];
		answerkey = new String[lineCount];
		while (reader2.hasNextLine()) {
			String[] newdata = data.split(",");
			difficulty[j] = newdata[0];
			questions[j] = newdata[1];
			answerkey[j] = newdata[2];
			int[] random = randomize();
			for (int i = 0; i < 4; i++) {
				options[j][random[i]] = newdata[i + 2];
			}
			data = reader2.nextLine();
			j++;
		}
		reader2.close();
		// Set up UI components
		setTitle("Quiz Game");
		setSize(1350, 760);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		JPanel questionPanel = new JPanel();
		questionLabel = new JLabel(questions[currentQuestion]);
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setFont(new Font("Kumbh Sans Light", Font.PLAIN, 25));
		getContentPane().add(questionPanel, BorderLayout.NORTH);
		GroupLayout gl_questionPanel = new GroupLayout(questionPanel);
		gl_questionPanel.setHorizontalGroup(gl_questionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_questionPanel.createSequentialGroup()
						.addComponent(questionLabel, GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
						.addContainerGap()));
		gl_questionPanel.setVerticalGroup(gl_questionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_questionPanel.createSequentialGroup().addContainerGap()
						.addComponent(questionLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		questionPanel.setLayout(gl_questionPanel);

		JPanel optionsPanel = new JPanel();
		optionsPanel.setBackground(new Color(207, 224, 199));
		optionGroup = new ButtonGroup();
		optionA = new JButton(options[currentQuestion][0]);
		optionA.setBackground(new Color(176, 211, 173));
		optionA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionB.getBackground().equals(new Color(240,240,240))) {
					optionB.setBackground(new Color(143, 188, 143));
				} else if (optionC.getBackground().equals(new Color(240,240,240))) {
					optionC.setBackground(new Color(143, 188, 143));
				} else if (optionD.getBackground().equals(new Color(240,240,240))) {
					optionD.setBackground(new Color(143, 188, 143));
				}
				optionA.setBackground(new Color(240, 240, 240));
			}
		});
		optionA.setFont(new Font("Poppins", Font.PLAIN, 18));
		optionA.setBounds(683, 248, 599, 154);
		optionB = new JButton(options[currentQuestion][1]);
		optionB.setForeground(new Color(0, 0, 0));
		optionB.setBackground(new Color(176, 211, 173));
		optionB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionA.getBackground().equals(new Color(240,240,240))) {
					optionA.setBackground(new Color(143, 188, 143));
				} else if (optionC.getBackground().equals(new Color(240,240,240))) {
					optionC.setBackground(new Color(143, 188, 143));
				} else if (optionD.getBackground().equals(new Color(240,240,240))) {
					optionD.setBackground(new Color(143, 188, 143));
				}
				optionB.setBackground(new Color(240, 240, 240));
			}
		});
		optionB.setFont(new Font("Poppins", Font.PLAIN, 18));
		optionB.setBounds(59, 248, 599, 154);
		optionC = new JButton(options[currentQuestion][2]);
		optionC.setBackground(new Color(176, 211, 173));
		optionC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionA.getBackground().equals(new Color(240,240,240))) {
					optionA.setBackground(new Color(143, 188, 143));
				} else if (optionB.getBackground().equals(new Color(240,240,240))) {
					optionB.setBackground(new Color(143, 188, 143));
				} else if (optionD.getBackground().equals(new Color(240,240,240))) {
					optionD.setBackground(new Color(143, 188, 143));
				}
				optionC.setBackground(new Color(240, 240, 240));
			}
		});
		optionC.setFont(new Font("Poppins", Font.PLAIN, 18));
		optionC.setBounds(59, 412, 597, 154);
		optionD = new JButton(options[currentQuestion][3]);
		optionD.setForeground(new Color(0, 0, 0));
		optionD.setBackground(new Color(176, 211, 173));
		optionD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionA.getBackground().equals(new Color(240,240,240))) {
					optionA.setBackground(new Color(143, 188, 143));
				} else if (optionC.getBackground().equals(new Color(240,240,240))) {
					optionC.setBackground(new Color(143, 188, 143));
				} else if (optionB.getBackground().equals(new Color(240,240,240))) {
					optionB.setBackground(new Color(143, 188, 143));
				}
				optionD.setBackground(new Color(240, 240, 240));
			}
		});
		optionD.setFont(new Font("Poppins", Font.PLAIN, 18));
		optionD.setBounds(681, 412, 599, 154);
		optionGroup.add(optionA);
		optionGroup.add(optionB);
		optionGroup.add(optionC);
		optionGroup.add(optionD);
		optionsPanel.setLayout(null);
		optionsPanel.add(optionA);
		optionsPanel.add(optionB);
		optionsPanel.add(optionC);
		optionsPanel.add(optionD);
		getContentPane().add(optionsPanel, BorderLayout.CENTER);

		BufferedImage myPicture = ImageIO.read(new File("plant3.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBounds(571, 31, 201, 207);
		optionsPanel.add(picLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -28, 42, 649);
		optionsPanel.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1303, -28, 33, 649);
		optionsPanel.add(panel_1);

		JPanel buttonPanel = new JPanel();
		nextButton = new JButton("NEXT");
		nextButton.setBackground(new Color(207, 224, 199));
		nextButton.setFont(new Font("Poppins", Font.PLAIN, 15));
		nextButton.addActionListener(this);

		JButton btnNewButton = new JButton("MENU");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(207, 224, 199));
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 15));
		buttonPanel.add(btnNewButton);
		
		lives = new JLabel("LIVES: "+ numberoflives);
		lives.setFont(new Font("Poppins", Font.PLAIN, 15));
		buttonPanel.add(lives);
		buttonPanel.add(nextButton);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	}

	public int[] randomize() {
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] order = new int[4];
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(0);

		Collections.shuffle(numbers);
		for (int i = 0; i < order.length; i++) {
			order[i] = numbers.get(i);
		}
		return order;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextButton) {
			String answer = "";
			if (optionA.getBackground().equals(new Color(240,240,240))) {
				answer = optionA.getText();
			} else if (optionB.getBackground().equals(new Color(240,240,240))) {
				answer = optionB.getText();
			} else if (optionC.getBackground().equals(new Color(240,240,240))) {
				answer = optionC.getText();
			} else if (optionD.getBackground().equals(new Color(240,240,240))) {
				answer = optionD.getText();
			}
			if (answer.equals(answerkey[currentQuestion])) {
				JOptionPane.showMessageDialog(null, "Correct!");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + answerkey[currentQuestion]);
				numberoflives--;
				lives.setText("LIVES: " + numberoflives);
				if(numberoflives == 0) {
					endLose.main(null);
					this.dispose();
					
				}
			}
			optionA.setBackground(new Color(143,188,143));
			optionB.setBackground(new Color(143,188,143));
			optionC.setBackground(new Color(143,188,143));
			optionD.setBackground(new Color(143,188,143));
			currentQuestion++;
			if (currentQuestion >= questions.length) {
				endWin.main(null);
				this.dispose();
			} else {
				questionLabel.setText(questions[currentQuestion]);
				optionA.setText(options[currentQuestion][0]);
				optionB.setText(options[currentQuestion][1]);
				optionC.setText(options[currentQuestion][2]);
				optionD.setText(options[currentQuestion][3]);
				optionGroup.clearSelection();
			}
		}
	}

	public static void main(String[] args){
		quizGUI quiz = null;
		try {
			quiz = new quizGUI();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quiz.setVisible(true);
	}
}
