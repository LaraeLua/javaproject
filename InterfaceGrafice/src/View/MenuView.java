package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class MenuView extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView frame = new MenuView();
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
	public MenuView() {
		getContentPane().setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 345);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estoque de vacinas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(101, 39, 215, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gripe");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(SystemColor.window);
		lblNewLabel_1.setBounds(38, 113, 46, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Febre Amarela");
		lblNewLabel_2.setForeground(SystemColor.window);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(38, 144, 116, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hepatite");
		lblNewLabel_3.setForeground(SystemColor.window);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(38, 174, 84, 20);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("HPV");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(SystemColor.window);
		lblNewLabel_4.setBounds(40, 205, 37, 20);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Validade");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_6.setForeground(SystemColor.window);
		lblNewLabel_6.setBounds(355, 91, 62, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("14/09/18");
		lblNewLabel_7.setForeground(SystemColor.window);
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(254, 116, 62, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("22/12/22");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_1.setBounds(254, 144, 56, 14);
		getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("20/11/20");
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_2.setBounds(254, 177, 56, 14);
		getContentPane().add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("12/01/22");
		lblNewLabel_7_3.setForeground(Color.WHITE);
		lblNewLabel_7_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_3.setBounds(254, 208, 56, 14);
		getContentPane().add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("Fabrica\u00E7\u00E3o");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(244, 91, 72, 14);
		getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_4 = new JLabel("14/02/20");
		lblNewLabel_7_4.setForeground(Color.WHITE);
		lblNewLabel_7_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_4.setBounds(361, 116, 56, 14);
		getContentPane().add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("22/09/24");
		lblNewLabel_7_5.setForeground(Color.WHITE);
		lblNewLabel_7_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_5.setBounds(361, 144, 56, 14);
		getContentPane().add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_7_6 = new JLabel("20/05/22");
		lblNewLabel_7_6.setForeground(Color.WHITE);
		lblNewLabel_7_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_6.setBounds(361, 177, 56, 14);
		getContentPane().add(lblNewLabel_7_6);
		
		JLabel lblNewLabel_7_7 = new JLabel("12/11/23");
		lblNewLabel_7_7.setForeground(Color.WHITE);
		lblNewLabel_7_7.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7_7.setBounds(361, 208, 56, 14);
		getContentPane().add(lblNewLabel_7_7);

		
	}
}
