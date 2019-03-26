import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_START extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitel;
	private JTextField txtSpielername;
	private JTextField txtSpielername_1;
	private JTextField txtSpielername_2;
	private JButton btnStart;
	private JButton btnLaden;
	private JLabel lblRegeln;
	private JButton btnSpieler;
	private JButton btnNewButton;
	private JButton btnSpieler_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_START frame = new GUI_START();
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
	public GUI_START() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitel = new JLabel("MCG Quizchampion");
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTitel.setBounds(331, 100, 354, 47);
		contentPane.add(lblTitel);
		
		txtSpielername = new JTextField();
		txtSpielername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtSpielername.setText("Spielername");
		txtSpielername.setBounds(146, 447, 96, 20);
		contentPane.add(txtSpielername);
		txtSpielername.setColumns(10);
		
		txtSpielername_1 = new JTextField();
		txtSpielername_1.setText("Spielername");
		txtSpielername_1.setBounds(146, 505, 96, 20);
		contentPane.add(txtSpielername_1);
		txtSpielername_1.setColumns(10);
		
		txtSpielername_2 = new JTextField();
		txtSpielername_2.setText("Spielername");
		txtSpielername_2.setBounds(146, 564, 96, 20);
		contentPane.add(txtSpielername_2);
		txtSpielername_2.setColumns(10);
		
		btnStart = new JButton("Start");
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStart.setBounds(744, 600, 112, 47);
		contentPane.add(btnStart);
		
		btnLaden = new JButton("Laden");
		btnLaden.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnLaden.setBounds(744, 658, 112, 47);
		contentPane.add(btnLaden);
		
		lblRegeln = new JLabel("Regeln");
		lblRegeln.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRegeln.setBounds(299, 187, 62, 20);
		contentPane.add(lblRegeln);
		
		btnSpieler = new JButton("Spieler 1");
		btnSpieler.setBounds(146, 420, 96, 23);
		contentPane.add(btnSpieler);
		
		btnNewButton = new JButton("Spieler 2");
		btnNewButton.setBounds(146, 478, 96, 23);
		contentPane.add(btnNewButton);
		
		btnSpieler_1 = new JButton("Spieler 3");
		btnSpieler_1.setBounds(146, 536, 96, 23);
		contentPane.add(btnSpieler_1);
	}
}
