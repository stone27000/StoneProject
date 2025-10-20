package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import util.ClockPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField phone;
	private MemberServiceImpl msi=new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMember frame = new AddMember();
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
	public AddMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 10, 643, 425);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("註冊成為會員");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(207, 46, 195, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("姓 名");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBackground(new Color(128, 0, 255));
		lblNewLabel_1.setBounds(32, 119, 81, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("帳 號");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBackground(new Color(128, 0, 255));
		lblNewLabel_1_1.setBounds(32, 180, 81, 36);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("密 碼");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_2.setBackground(new Color(128, 0, 255));
		lblNewLabel_1_2.setBounds(32, 238, 81, 36);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("地 址");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_3.setBackground(new Color(128, 0, 255));
		lblNewLabel_1_3.setBounds(32, 298, 81, 36);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("電 話");
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_4.setBackground(new Color(128, 0, 255));
		lblNewLabel_1_4.setBounds(32, 362, 81, 36);
		panel.add(lblNewLabel_1_4);
		
		name = new JTextField();
		name.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		name.setBounds(123, 119, 164, 36);
		panel.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		username.setColumns(10);
		username.setBounds(123, 180, 164, 36);
		panel.add(username);
		
		password = new JTextField();
		password.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		password.setColumns(10);
		password.setBounds(123, 238, 164, 36);
		panel.add(password);
		
		address = new JTextField();
		address.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		address.setColumns(10);
		address.setBounds(123, 298, 164, 36);
		panel.add(address);
		
		phone = new JTextField();
		phone.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		phone.setColumns(10);
		phone.setBounds(123, 362, 164, 36);
		panel.add(phone);
		
		JButton btnNewButton = new JButton("註 冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Username=username.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Phone=phone.getText();
				
				Member member=new Member(Name,Username,Password,Address,Phone);
				
				
				if(msi.addMember(member)==1)
				{
					AddMemberError addmembererror=new AddMemberError();
					addmembererror.setVisible(true);
					dispose();
				}
				else
				{
					AddMemberSuccess addmembersuccess=new AddMemberSuccess();
					addmembersuccess.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(371, 308, 111, 53);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 144, 36);
		panel.add(panel_1);
		panel_1.add(new ClockPanel(), BorderLayout.NORTH);

	}

}
