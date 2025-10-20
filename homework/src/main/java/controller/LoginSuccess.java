package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import util.ClockPanel;
import util.Tool;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginSuccess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Member member=Tool.readMember();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccess frame = new LoginSuccess();
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
	public LoginSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(10, 10, 573, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入成功");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBackground(new Color(255, 0, 128));
		lblNewLabel.setBounds(227, 91, 143, 66);
		panel.add(lblNewLabel);
		
		JLabel showMember = new JLabel("");
		showMember.setHorizontalAlignment(SwingConstants.CENTER);
		showMember.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		showMember.setBounds(108, 167, 398, 66);
		panel.add(showMember);
		
		showMember.setText(member.getName()+" 歡迎光臨!");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 24, 148, 48);
		panel.add(panel_1);
		panel_1.add(new ClockPanel(), BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("進入菜單");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Goorder_Ui goorder_Ui=new Goorder_Ui();
				goorder_Ui.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(219, 263, 174, 66);
		panel.add(btnNewButton);

	}
}
