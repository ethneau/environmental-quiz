
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame implements ActionListener {

    // Declare UI components
    private JLabel questionLabel;
    private JRadioButton optionA;
    private JRadioButton optionB;
    private JRadioButton optionC;
    private JRadioButton optionD;
    private JButton nextButton;
    private ButtonGroup optionGroup;

    // Initialize quiz questions and options
    private String[] questions = {"What is the capital of France?", "Who invented the telephone?", "What is the largest continent by land area?"};
    private String[][] options = {
        {"London", "Paris", "Berlin", "Madrid"},
        {"Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", "Samuel Morse"},
        {"Europe", "Asia", "North America", "Africa"}
    };
    private int currentQuestion = 0;

    public test() {
        // Set up UI components
        setTitle("Quiz Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel questionPanel = new JPanel();
        questionLabel = new JLabel(questions[currentQuestion]);
        questionPanel.add(questionLabel);
        add(questionPanel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionGroup = new ButtonGroup();
        optionA = new JRadioButton(options[currentQuestion][0]);
        optionB = new JRadioButton(options[currentQuestion][1]);
        optionC = new JRadioButton(options[currentQuestion][2]);
        optionD = new JRadioButton(options[currentQuestion][3]);
        optionGroup.add(optionA);
        optionGroup.add(optionB);
        optionGroup.add(optionC);
        optionGroup.add(optionD);
        optionsPanel.add(optionA);
        optionsPanel.add(optionB);
        optionsPanel.add(optionC);
        optionsPanel.add(optionD);
        add(optionsPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            // Check answer and move to next question
            String answer = "";
            if (optionA.isSelected()) {
                answer = optionA.getText();
            } else if (optionB.isSelected()) {
                answer = optionB.getText();
            } else if (optionC.isSelected()) {
                answer = optionC.getText();
            } else if (optionD.isSelected()) {
                answer = optionD.getText();
            }

            if (answer.equals(options[currentQuestion][1])) {
                JOptionPane.showMessageDialog(null, "Correct!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + options[currentQuestion][1]);
            }

            currentQuestion++;
            if (currentQuestion >= questions.length) {
                JOptionPane.showMessageDialog(null, "Quiz complete!");
                System.exit(0);
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

    public static void main(String[] args) {
        test quiz = new test();
        quiz.setVisible(true);
    }
}

