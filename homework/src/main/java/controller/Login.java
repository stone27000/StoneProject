package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import util.ClockPanel;
import util.Tool;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private MemberServiceImpl msi=new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*Time time = new Time();//初始化对象
        time.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭后程序也停止*/
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(31, 35, 284, 126);
		contentPane.add(panel);
		//panel.setLayout(null);
		//panel.setLayout(new BorderLayout());
		panel.add(new ClockPanel(), BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("登入");
		btnNewButton.setBounds(215, 368, 120, 53);
		contentPane.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				String Password=password.getText();
				
				Member member=msi.Login(Username, Password);
				
				if(member!=null)
				{
					Tool.saveMember(member);
					
					LoginSuccess success=new LoginSuccess();
					success.setVisible(true);
					
					
					dispose();
				}
				else
				{
					LoginError error=new LoginError();
					error.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setForeground(new Color(64, 0, 128));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		
		username = new JTextField();
		username.setBounds(284, 209, 154, 42);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(284, 277, 154, 42);
		contentPane.add(password);
		password.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("[帳號]");
		lblNewLabel.setBounds(151, 205, 103, 42);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		
		JLabel lblNewLabel_1 = new JLabel("[密碼]");
		lblNewLabel_1.setBounds(151, 277, 103, 42);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 30));
		
		//time.setLayout(null);
		//panel.setLayout(new BorderLayout());
		
		/*JLabel time = new JLabel("");
		time.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		time.setBounds(10, 10, 86, 33);*/
		
		
	}	
	
}	
	/*JFrame frame = new JFrame("有時鐘的視窗");
	frame.add(new ClockPanel(), BorderLayout.NORTH);*/

	/*Time time = new Time();//初始化对象
    time.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭后程序也停止*/
	

	
	

	
	

