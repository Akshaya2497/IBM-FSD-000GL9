package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class demoFrame extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnReset;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demoFrame frame = new demoFrame();
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
	public demoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setBounds(27, 25, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("first Name");
		lblFirstName.setBounds(27, 50, 73, 25);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(27, 86, 73, 14);
		contentPane.add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(27, 111, 62, 14);
		contentPane.add(lblEmail);
		
		
		
		textField = new JTextField();
		textField.setBounds(191, 52, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 84, 123, 17);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 23, 128, 17);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(195, 108, 123, 17);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(303, 164, 89, 23);
		contentPane.add(btnReset);
		
		btnDelete = new JButton("Delete");
//		btnDelete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				EmployeeServiceImpl.createEmployee(new Employee());
//			}
//		});
		btnDelete.setBounds(176, 164, 89, 23);
		contentPane.add(btnDelete);
		JButton btnAddemployee = new JButton("AddEmployee");
		btnAddemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmployeeServiceImpl.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString()));
			}
		});
		btnAddemployee.setBounds(34, 163, 113, 25);
		contentPane.add(btnAddemployee);
	}

	
}
