import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CadastroEventoPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CadastroEventoPanel() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TELA DE LOGIN");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel.setBounds(353, 31, 90, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(68, 190, 34, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(68, 255, 34, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(112, 187, 209, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 252, 209, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(353, 393, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(354, 427, 89, 23);
		add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.info);
		textField_2.setForeground(SystemColor.textHighlight);
		textField_2.setBounds(280, 47, 244, 4);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Controle de Vacinas");
		lblNewLabel_3.setBounds(353, 56, 102, 28);
		add(lblNewLabel_3);

	}
}
