package com.charter.xstoresupport.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.charter.xstoresupport.bo.Bo;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
             
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		Bo b=new Bo();
		
		
		
		
		JLabel lblNewLabel = new JLabel("XSTORE SUPPORT UTILITY LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(185, 92, 464, 38);
		getContentPane().add(lblNewLabel);
		
	
		JLabel name = new JLabel("FULL NAME");
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setForeground(Color.RED);
		name.setBounds(284, 158, 83, 14);
		getContentPane().add(name);
		
		JLabel uname = new JLabel("USERNAME");
		uname.setForeground(Color.RED);
		uname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		uname.setBounds(284, 197, 83, 14);
		getContentPane().add(uname);
		
		JLabel password = new JLabel("PASSWORD");
		password.setForeground(Color.RED);
		password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		password.setBounds(284, 239, 94, 14);
		getContentPane().add(password);
		
		textField = new JTextField();
		textField.setBounds(386, 157, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(386, 196, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mm=new MainMenu();
				mm.mainMenu();
			Bo b=new Bo ();
			b.setName(textField.getText());
			textField.setText(" ");
			System.out.println(b.getName());
			b.setUsername(textField_1.getText());
			textField_1.setText(" ");
			//b.setPassword(textField_2.getText());
			//textField_2.setText(" ");
			   
				setVisible(false);
			}
		});
		login.setBounds(348, 285, 89, 23);
		getContentPane().add(login);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setBounds(386, 238, 86, 20);
		getContentPane().add(passwordField);
	
	}
}
