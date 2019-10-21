package networkingexample;

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

public class NetworkSwing extends JFrame {
	int count =0;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkSwing frame = new NetworkSwing();
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
	public NetworkSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheNumber = new JLabel("Enter the number to find factorial");
		lblEnterTheNumber.setBounds(31, 26, 178, 26);
		contentPane.add(lblEnterTheNumber);
		
		textField = new JTextField();
		textField.setBounds(246, 29, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnFindFacortial = new JButton("Find Facortial");
		btnFindFacortial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans=NetworkingClient.main(textField.getText().toString());
				System.out.println(ans);
				textField.setText(ans);
			}
		});
		btnFindFacortial.setBounds(134, 86, 89, 23);
		contentPane.add(btnFindFacortial);
		
		JButton btnContinue = new JButton("End");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkingClient.main("bye");
			}
		});
		btnContinue.setBounds(257, 86, 89, 23);
		contentPane.add(btnContinue);
	}
}
