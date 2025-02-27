package Hangman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class HMFrame extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GameMenu menu = new GameMenu();
	
	private static String answer = "nguyenan van an MAT MA";
	
	

	JButton[] suggestionButton = { new JButton("Hint"), new JButton("Letter") };

	JLabel img = new JLabel();

	JLabel labelvalueKey = new JLabel();

	JButton[] keyboardButton = { new JButton("A"), new JButton("B"), new JButton("C"), new JButton("D"),
			new JButton("E"), new JButton("F"), new JButton("G"), new JButton("H"), new JButton("I"), new JButton("K"),
			new JButton("J"), new JButton("L"), new JButton("M"), new JButton("N"), new JButton("O"), new JButton("P"),
			new JButton("Q"), new JButton("R"), new JButton("S"), new JButton("T"), new JButton("U"), new JButton(""),
			new JButton("V"), new JButton("W"), new JButton("X"), new JButton("Y"), new JButton("Z"), new JButton("") };

	Font buttonFont1 = new Font("Comic Sans MS", Font.PLAIN, 40);
	Font buttonFont2 = new Font("Comic Sans MS", Font.PLAIN, 20);
	Font textFont1 = new Font("NewellsHand", Font.PLAIN, 40);
	Font textFont2 = new Font("NewellsHand", Font.PLAIN, 20);
	Border buttonBorder = new LineBorder(Color.BLACK, 2);

	public HMFrame() {
		super("Hangman Game");
		URL iconURL = this.getClass().getResource("../IconImage/iconGame.jpg");
		this.setIconImage(new ImageIcon(iconURL).getImage());
		this.setSize(432, 700);
		this.setLocation(744, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.setJMenuBar(menu);
		this.init();

	}

	private void init() {
		char[] abc = new char[answer.length()];
		for (int i = 0; i < answer.length(); i++) {
			if (' '  == answer.charAt(i)) {
				abc[i] = ' ';
			}else {
				abc[i] = '-';
			}
		}
		String value = " ";
		for (char c : abc) {
			value+=c;
		}
		ImageIcon icon = new ImageIcon(mainTest.class.getResource("../IconImage/level1.png"));
		Image newimg = icon.getImage().getScaledInstance(395, 280, java.awt.Image.SCALE_SMOOTH);												// way
		icon = new ImageIcon(newimg);
		//
		JPanel mainPanel = new JPanel();
		JPanel centerJPanel = new JPanel();
		JPanel northJPanel = new JPanel();

		JPanel suggestionPanel = new JPanel();
		JPanel keyboardPanel = new JPanel();

		JPanel suggestButtonPanel = new JPanel();
		//
		mainPanel.setLayout(new BorderLayout());
		centerJPanel.setLayout(new BorderLayout());
		northJPanel.setLayout(new BorderLayout());
		suggestionPanel.setLayout(new BorderLayout());
		keyboardPanel.setLayout(new GridLayout(4, 7, 3, 3));
		suggestButtonPanel.setLayout(new GridLayout(1, 2, 5, 5));

		//
		labelvalueKey.setFont(textFont1);
		labelvalueKey.setHorizontalAlignment(JLabel.CENTER);
		labelvalueKey.setOpaque(true);
		labelvalueKey.setBackground(new Color(0x8fd9fb));
		labelvalueKey.setText(value);
		//
		img.setIcon(icon);
		img.setHorizontalAlignment(JLabel.CENTER);
		//
		for (JButton jButton : suggestionButton) {
			jButton.setBorder(buttonBorder);
			jButton.setFont(buttonFont2);
			suggestButtonPanel.add(jButton);
		}
		//
		for (JButton jButton : keyboardButton) {
			jButton.setBorder(buttonBorder);
			jButton.setFont(buttonFont1);
			jButton.setBackground(new Color(0x64f0db));
			;
			keyboardPanel.add(jButton);
		}
		//
		suggestionPanel.add(labelvalueKey, BorderLayout.SOUTH);
		//
		mainPanel.add(northJPanel);
		mainPanel.add(centerJPanel);
		centerJPanel.add(suggestionPanel, BorderLayout.NORTH);
		centerJPanel.add(keyboardPanel, BorderLayout.SOUTH);

		centerJPanel.add(img, BorderLayout.CENTER);
		suggestionPanel.add(suggestButtonPanel, BorderLayout.NORTH);

		this.setContentPane(mainPanel);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
