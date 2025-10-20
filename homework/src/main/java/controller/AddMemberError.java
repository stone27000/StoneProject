package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import util.ClockPanel;

public class AddMemberError extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberError frame = new AddMemberError();
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
	public AddMemberError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 687, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳 號 重 覆");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(236, 110, 202, 62);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("重 新 註 冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMember addmember=new AddMember();
				addmember.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(236, 216, 202, 62);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 20, 144, 36);
		panel.add(panel_1);
		panel_1.add(new ClockPanel(), BorderLayout.NORTH);
		
		

	}

}
