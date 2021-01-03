package sp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Spalsh extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private static JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Spalsh frame = new Spalsh();
		frame.setVisible(true);
		
				try {
					
					for (int x=0;x<=100;x++) {
						Spalsh.progressBar.setValue(x);
						Thread.sleep(75);
						Spalsh.lblNewLabel_1.setText("Loading..."+Integer.toString(x)+" %");
						if(x==100) {
							frame.dispose();
						}
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	/**
	 * Create the frame.
	 */
	public Spalsh() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 800, 600);
		setSize(800,600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/j192.gif"));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(0, 10, 800, 520);
		contentPane.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		progressBar.setBackground(new Color(204, 204, 255));
		progressBar.setForeground(new Color(51, 255, 204));
		progressBar.setBounds(10, 573, 770, 17);
		contentPane.add(progressBar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(286, 534, 235, 43);
		contentPane.add(lblNewLabel_1);
	}
}
