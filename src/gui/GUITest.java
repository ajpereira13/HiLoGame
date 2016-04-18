package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class GUITest {

	private JFrame frmHighlowGuessingGame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITest window = new GUITest();
					window.frmHighlowGuessingGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUITest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHighlowGuessingGame = new JFrame();
		frmHighlowGuessingGame.setResizable(false);
		frmHighlowGuessingGame.getContentPane().setBackground(SystemColor.activeCaption);
		frmHighlowGuessingGame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("High-Low Guesssing Game");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(99, 30, 244, 19);
		frmHighlowGuessingGame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New Game");
		btnNewButton_1.setBounds(177, 208, 89, 23);
		frmHighlowGuessingGame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("# Guesses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(44, 208, 89, 23);
		frmHighlowGuessingGame.getContentPane().add(btnNewButton);
		
		JButton btnQuitGame = new JButton("Quit Game");
		btnQuitGame.setBounds(310, 208, 89, 23);
		frmHighlowGuessingGame.getContentPane().add(btnQuitGame);
		
		textField = new JTextField();
		textField.setBounds(44, 92, 222, 23);
		frmHighlowGuessingGame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.setBounds(310, 92, 89, 23);
		frmHighlowGuessingGame.getContentPane().add(btnGuess);
		
		JLabel lblEnterYouGuess = new JLabel("Enter you guess below.");
		lblEnterYouGuess.setBounds(45, 73, 119, 19);
		frmHighlowGuessingGame.getContentPane().add(lblEnterYouGuess);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.inactiveCaption);
		textArea.setBounds(44, 126, 355, 71);
		frmHighlowGuessingGame.getContentPane().add(textArea);
		frmHighlowGuessingGame.setBackground(new Color(153, 180, 209));
		frmHighlowGuessingGame.setTitle("High-Low Guessing Game");
		frmHighlowGuessingGame.setBounds(100, 100, 449, 300);
		frmHighlowGuessingGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
