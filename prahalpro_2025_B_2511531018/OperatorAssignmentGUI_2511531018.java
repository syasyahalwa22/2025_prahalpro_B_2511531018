package pekan8_2511531018;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAssignmentGUI_2511531018 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAssignmentGUI_2511531018 frame = new OperatorAssignmentGUI_2511531018();
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
	public OperatorAssignmentGUI_2511531018() {
		setTitle("Operator Assignment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operasi Assignment");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 23, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(29, 74, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(29, 110, 63, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setBounds(29, 152, 63, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Hasil");
		lblNewLabel_1_1_2.setBounds(29, 203, 63, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(102, 71, 63, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(102, 107, 63, 20);
		contentPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setEnabled(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(102, 200, 63, 20);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOperator.setBounds(102, 148, 54, 22);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex(); //operator
						if (c==0) {
							a += b;
							hasil = a; 
						}
						if (c==1) {
							a -= b;
							hasil = a;
						}
						if (c==2) {
							a *= b;
							hasil = a;
						}
						if (c==3) {
							a /= b;
							hasil = a;
						}
						if (c==4) {
							a %= b;
							hasil = a;
						}
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
					
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(206, 148, 89, 23);
		contentPane.add(btnNewButton);

	}
}
