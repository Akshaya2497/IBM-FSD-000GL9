package EmployeeSwingID;
import networkingexample.NetworkingClient;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeSwingId extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblSearchId;
	private JTextField textField_1;
	private JButton btnSearch;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeSwingId frame = new EmployeeSwingId();
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
	public EmployeeSwingId() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterEmployeeIdfirst = new JLabel("Enter Employee Id,First name, Last name , Email");
		lblEnterEmployeeIdfirst.setBounds(61, 27, 287, 42);
		contentPane.add(lblEnterEmployeeIdfirst);
		
		textField = new JTextField();
		textField.setBounds(61, 68, 234, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblSearchId = new JLabel("Search ID ");
		lblSearchId.setBounds(42, 135, 90, 17);
		contentPane.add(lblSearchId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 132, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(278, 132, 89, 23);
		contentPane.add(btnSearch);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkingClient.main(textField.getText().toString());
			}
		});
		btnAdd.setBounds(309, 70, 89, 23);
		contentPane.add(btnAdd);
	}
}
