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
import javax.swing.ButtonGroup;

public class GUI_START extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitel;
	private JTextField txtSpielername1;
	private JTextField txtSpielername2;
	private JTextField txtSpielername3;
	private JButton btnStart;
	private JButton btnLaden;
	private JLabel lblRegeln;
	private JButton btn1Spieler;
	private JButton btn2Spieler;
	private JButton btn3Spieler;
	private final ButtonGroup buttonGroupSpielerzahl = new ButtonGroup();

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
		
		txtSpielername1 = new JTextField();
		txtSpielername1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielername1(txtSpielername1.getText());
			}
		});
		txtSpielername1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtSpielername1.setBounds(146, 447, 96, 20);
		contentPane.add(txtSpielername1);
		txtSpielername1.setColumns(10);
		
		txtSpielername2 = new JTextField();
		txtSpielername2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielername2(txtSpielername2.getText());
			}
		});
		txtSpielername2.setBounds(146, 505, 96, 20);
		contentPane.add(txtSpielername2);
		txtSpielername2.setColumns(10);
		
		txtSpielername3 = new JTextField();
		txtSpielername3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielername3(txtSpielername3.getText());
			}
		});
		txtSpielername3.setBounds(146, 564, 96, 20);
		contentPane.add(txtSpielername3);
		txtSpielername3.setColumns(10);
		
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
		
		btn1Spieler = new JButton("Spieler 1");
		buttonGroupSpielerzahl.add(btn1Spieler);
		btn1Spieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(1);
			}
		});
		btn1Spieler.setBounds(146, 420, 96, 23);
		contentPane.add(btn1Spieler);
		
		btn2Spieler = new JButton("Spieler 2");
		buttonGroupSpielerzahl.add(btn2Spieler);
		btn2Spieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(2);
			}
		});
		btn2Spieler.setBounds(146, 478, 96, 23);
		contentPane.add(btn2Spieler);
		
		btn3Spieler = new JButton("Spieler 3");
		buttonGroupSpielerzahl.add(btn3Spieler);
		btn3Spieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(3);
			}
		});
		btn3Spieler.setBounds(146, 536, 96, 23);
		contentPane.add(btn3Spieler);
	}
}
