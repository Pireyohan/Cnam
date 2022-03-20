package Essai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class appCalculatrice {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appCalculatrice window = new appCalculatrice();
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
	public appCalculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(500, 100, 811, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		value1 = new JTextField();
		value1.setForeground(Color.BLACK);
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		value1.setColumns(10);
		value1.setBounds(402, 10, 395, 51);
		frame.getContentPane().add(value1);
		
		value2 = new JTextField();
		value2.setForeground(Color.BLACK);
		value2.setText("0");
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		value2.setColumns(10);
		value2.setBounds(10, 60, 787, 68);
		frame.getContentPane().add(value2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(null);
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		editorPane.setBounds(10, 10, 787, 121);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton.setBounds(30, 141, 96, 68);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(30, 241, 96, 68);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(30, 340, 96, 68);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3_1 = new JButton("0");
		btnNewButton_3_1.setForeground(Color.BLACK);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_1.setBackground(Color.CYAN);
		btnNewButton_3_1.setBounds(30, 447, 261, 68);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(195, 141, 96, 68);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.CYAN);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(195, 241, 96, 68);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("2");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setBackground(Color.CYAN);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(195, 340, 96, 68);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_2 = new JButton("=");
		btnNewButton_3_2.setForeground(Color.BLACK);
		btnNewButton_3_2.setBackground(Color.CYAN);
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one= Integer.parseInt(value1.getText());
				int two= Integer.parseInt(value2.getText());
				if(actionRecived.getText().equals("sub")) {
					int sub=one-two;
						value2.setText(String.valueOf(sub));		
				}
				if(actionRecived.getText().equals("add")) {
					int add=one+two;
						value2.setText(String.valueOf(add));
						
				}
				if(actionRecived.getText().equals("mul")) {
					int mul=one*two;
						value2.setText(String.valueOf(mul));
						
				}
				if(actionRecived.getText().equals("div")) {
					int div=one/two;
						value2.setText(String.valueOf(div));
						
				}
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_2.setBounds(363, 447, 96, 68);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(363, 141, 96, 68);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("6");
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setBackground(Color.CYAN);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(363, 241, 96, 68);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setForeground(Color.BLACK);
		btnNewButton_2_2.setBackground(Color.CYAN);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_2.setBounds(363, 340, 96, 68);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_3_3 = new JButton("/");
		btnNewButton_3_3.setBackground(Color.CYAN);
		btnNewButton_3_3.setForeground(Color.BLACK);
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("div");
				value2.setText(null);
				
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_3.setBounds(547, 447, 96, 68);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.setBackground(Color.CYAN);
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("sub");
				value2.setText(null);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBounds(547, 141, 96, 68);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.setBackground(Color.CYAN);
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("add");
				value2.setText(null);
				
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3.setBounds(547, 241, 96, 68);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("*");
		btnNewButton_2_3.setBackground(Color.CYAN);
		btnNewButton_2_3.setForeground(Color.BLACK);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("mul");
				value2.setText(null);
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_3.setBounds(547, 340, 96, 68);
		frame.getContentPane().add(btnNewButton_2_3);
		
		actionRecived = new JLabel(""); // making global variable
		actionRecived.setBounds(141, 24, 84, 28);
		frame.getContentPane().add(actionRecived);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				actionRecived.setText(null);
				
			}
		});
		btnNewButton_3.setBounds(691, 447, 96, 68);
		frame.getContentPane().add(btnNewButton_3);
	}
	private JLabel actionRecived; 
}
