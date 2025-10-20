package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.ClockPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginError extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginError frame = new LoginError();
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
	public LoginError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(60, 36, 586, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入失敗");
		lblNewLabel.setForeground(new Color(64, 0, 0));
		lblNewLabel.setBackground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(215, 139, 135, 53);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("請先註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMember addmember=new AddMember();
				addmember.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(183, 223, 220, 46);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(26, 10, 173, 53);
		panel.add(panel_1);
		panel_1.add(new ClockPanel(), BorderLayout.NORTH);

	}

}
