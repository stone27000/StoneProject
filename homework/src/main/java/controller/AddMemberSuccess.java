package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import util.ClockPanel;

public class AddMemberSuccess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberSuccess frame = new AddMemberSuccess();
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
	public AddMemberSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 637, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" 註 冊 成 功");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBackground(new Color(128, 128, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(206, 106, 195, 80);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("歡 迎 歡 迎");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBackground(new Color(128, 128, 192));
		lblNewLabel_1.setBounds(206, 163, 195, 80);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("返 回 登 入 頁 面");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login=new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(128, 64, 0));
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(168, 234, 303, 41);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 144, 36);
		panel.add(panel_1);
		panel_1.add(new ClockPanel(), BorderLayout.NORTH);
		
		

	}

}
