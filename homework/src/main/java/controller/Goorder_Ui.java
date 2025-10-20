package controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Goorder;
import util.ClockPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComboBox;

public class Goorder_Ui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<Integer> noodleBox;
	private JComboBox<Integer> chickenBox;
	private JComboBox<Integer> goldenBox;
	private JComboBox<Integer> saladBox;
	private JComboBox<Integer> beefBox;
	private JComboBox<Integer> duckBox;
	private JComboBox<Integer> fishBox;
	
	private final Action action = new SwingAction();
	Integer[] qty = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Goorder_Ui frame = new Goorder_Ui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	private int parseIntOrZero(JTextField field) {
	    String text = field.getText().trim();
	    if (text.isEmpty()) {
	        return 0;
	    }
	    try {
	        return Integer.parseInt(text);
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "請輸入數字！");
	        return 0;
	    }
	}
	
	


	/**
	 * Create the frame.
	 */
	public Goorder_Ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 549, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GARDEN    MENU");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(21, 36, 216, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("海鮮客家粄條");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(10, 68, 133, 47);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("杏包菇三杯雞");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(10, 113, 133, 47);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("黃金泡菜");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(10, 160, 133, 47);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("繽紛櫻桃鴨沙拉");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_3.setBounds(10, 206, 193, 47);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("老滷牛腱");
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_4.setBounds(10, 251, 133, 47);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("明爐烤鴨");
		lblNewLabel_1_5.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_5.setBounds(10, 296, 133, 47);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("龍膽石斑魚片");
		lblNewLabel_1_5_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_5_1.setBounds(10, 340, 133, 47);
		panel.add(lblNewLabel_1_5_1);
		
		JTextArea output = new JTextArea();
		output.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 15));
		output.setBounds(232, 10, 317, 259);
		panel.add(output);
		
		
		/*********************** event **********************/
		
		JButton btnNewButton = new JButton("確認送出");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				String Noodle=noodle.getText();
//				String Chicken=chicken.getText();
//				String Golden=golden.getText();
//				String Salad=salad.getText();
//				String Beef=beef.getText();
//				String Duck=duck.getText();
//				String Fish=fish.getText();
				
				int N = (int) noodleBox.getSelectedItem();
		        int C = (int) chickenBox.getSelectedItem();
		        int G = (int) goldenBox.getSelectedItem();
		        int S = (int) saladBox.getSelectedItem();
		        int B = (int) beefBox.getSelectedItem();
		        int D = (int) duckBox.getSelectedItem();
		        int F = (int) fishBox.getSelectedItem();


				
				Goorder o=new Goorder(N,C,G,S,B,D,F);
				
				output.setText("訂單細目:"
			            + "\n海鮮客家粄條:" + o.getNoodle() + "份"
			            + "\n杏包菇三杯雞:" + o.getChicken() + "份"
			            + "\n黃金泡菜:" + o.getGolden() + "份"
			            + "\n繽紛櫻桃鴨沙拉:" + o.getSalad() + "份"
			            + "\n老滷牛腱:" + o.getBeef() + "份"
			            + "\n明爐烤鴨:" + o.getDuck() + "份"
			            + "\n龍膽石斑魚片:" + o.getFish() + "份"
			            + "\n總價:" + o.getSum() + "元");
				/*output.setText("訂單細目:"+"\n海鮮客家粄條:"+o.getNoodle()+"份"+
						"\n杏包菇三杯雞:"+o.getChicken()+"份"+
						"\n黃金泡菜:"+o.getGolden()+"份"+
						"\n繽紛櫻桃鴨沙拉:"+o.getSalad()+"份"+
						"\n老滷牛腱:"+o.getBeef()+"份"+
						"\n明爐烤鴨:"+o.getDuck()+"份"+
						"\n龍膽石斑魚片:"+o.getFish()+"份"+
						"\n總價:"+o.getSum()+"元");*/
				
				/*output.setText("訂單細目:"+
						"\n海鮮客家粄條:"+o.getNoodle()+"份"+
						"\n杏包菇三杯雞:"+o.getChicken()+"份"+
						"\n黃金泡菜:"+o.getGolden()+"份"+
						"\n繽紛櫻桃鴨沙拉:"+o.getSalad()+"份"+
						"\n老滷牛腱:"+o.getBeef()+"份"+
						"\n明爐烤鴨:"+o.getDuck()+"份"+
						"\n龍膽石斑魚片:"+o.getFish()+"份"+
						"\n總價:"+o.getSum()+"元");*/
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(241, 296, 133, 22);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重置");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noodleBox.setSelectedIndex(0);
		        chickenBox.setSelectedIndex(0);
		        goldenBox.setSelectedIndex(0);
		        saladBox.setSelectedIndex(0);
		        beefBox.setSelectedIndex(0);
		        duckBox.setSelectedIndex(0);
		        fishBox.setSelectedIndex(0);
				output.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(251, 353, 84, 22);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("列印");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrinterJob job = PrinterJob.getPrinterJob();
		           job.setPrintable(new Printable() {
		            @Override
		               public int print(Graphics g, PageFormat pf, int page) {
		                   if (page > 0) return NO_SUCH_PAGE;
		                   panel.printAll(g); // panel是要列印的JPanel
		                   return PAGE_EXISTS;
		               }
		           });
		           if (job.printDialog()) {
		               try {
		                   job.print();
		               } catch (PrinterException ex) {
		                   ex.printStackTrace();
		               }
		           }
			}
			
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(345, 324, 92, 79);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 179, 36);
		panel.add(panel_1);
		panel_1.add(new ClockPanel(), BorderLayout.NORTH);
		
		
		noodleBox = new JComboBox<>(qty);
		noodleBox.setBounds(168, 80, 33, 22);
		panel.add(noodleBox);
		
		chickenBox = new JComboBox<>(qty);
		chickenBox.setBounds(168, 125, 33, 22);
		panel.add(chickenBox);
		
		goldenBox = new JComboBox<>(qty);
		goldenBox.setBounds(170, 172, 33, 22);
		panel.add(goldenBox);
		
		saladBox = new JComboBox<>(qty);
		saladBox.setBounds(168, 218, 33, 22);
		panel.add(saladBox);
		
		beefBox = new JComboBox<>(qty);
		beefBox.setBounds(170, 263, 33, 22);
		panel.add(beefBox);
		
		duckBox = new JComboBox<>(qty);
		duckBox.setBounds(170, 308, 33, 22);
		panel.add(duckBox);
		
		fishBox = new JComboBox<>(qty);
		fishBox.setBounds(170, 352, 33, 22);
		panel.add(fishBox);
		
		JButton btnExportExcel = new JButton("匯出Excel");
		btnExportExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportOrderToExcel();
			}

			private void exportOrderToExcel() {
				// step1: 取得選擇的份數
			    int N = (int) noodleBox.getSelectedItem();
			    int C = (int) chickenBox.getSelectedItem();
			    int G = (int) goldenBox.getSelectedItem();
			    int S = (int) saladBox.getSelectedItem();
			    int B = (int) beefBox.getSelectedItem();
			    int D = (int) duckBox.getSelectedItem();
			    int F = (int) fishBox.getSelectedItem();

			    // step2: 新建 Excel 本體
			    org.apache.poi.hssf.usermodel.HSSFWorkbook workbook = new org.apache.poi.hssf.usermodel.HSSFWorkbook();
			    org.apache.poi.hssf.usermodel.HSSFSheet sheet = workbook.createSheet("訂單明細");

			    // step3: 標題
			    org.apache.poi.hssf.usermodel.HSSFRow header = sheet.createRow(0);
			    header.createCell(0).setCellValue("餐點名");
			    header.createCell(1).setCellValue("份數");
			    header.createCell(2).setCellValue("單價(元)");
			    header.createCell(3).setCellValue("小計(元)");

			    // step4: 寫入每項餐點
			    int[] prices = {380, 580, 160, 450, 480, 460, 620};
			    int totalSum = 0;
			    String[] menuNames = {"海鮮客家粄條","杏包菇三杯雞","黃金泡菜","繽紛櫻桃鴨沙拉","老滷牛腱","明爐烤鴨","龍膽石斑魚片"};
			    int[] menuCounts = {N, C, G, S, B, D, F};
			    for (int i = 0; i < menuNames.length; i++) {
			        org.apache.poi.hssf.usermodel.HSSFRow row = sheet.createRow(i + 1);
			        int subtotal = menuCounts[i] * prices[i];
			        totalSum += subtotal;
			        
			        row.createCell(0).setCellValue(menuNames[i]);
			        row.createCell(1).setCellValue(menuCounts[i]);
			        row.createCell(2).setCellValue(prices[i]);
			        row.createCell(3).setCellValue(subtotal);
			    }
			    // 在最後一列顯示總價
			    org.apache.poi.hssf.usermodel.HSSFRow totalRow = sheet.createRow(menuNames.length + 1);
			    totalRow.createCell(2).setCellValue("總價:");
			    totalRow.createCell(3).setCellValue(totalSum);

			    // step5: 存檔
			    try (FileOutputStream out = new FileOutputStream("訂單明細.xls")) {
			        workbook.write(out);
			        out.flush();
			        JOptionPane.showMessageDialog(null, "匯出成功，檔名：訂單明細.xls");
			    } catch (IOException ex) {
			        ex.printStackTrace();
			        JOptionPane.showMessageDialog(null, "匯出失敗，請檢查權限或檔案是否開啟中");
			    }
				
			}
		});
		btnExportExcel.setBounds(445, 296, 94, 47);
		panel.add(btnExportExcel);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
