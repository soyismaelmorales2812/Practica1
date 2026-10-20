package segundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;

public class Holamundogit {

	private JFrame frmGitMundo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Holamundogit window = new Holamundogit();
					window.frmGitMundo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Holamundogit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGitMundo = new JFrame();
		frmGitMundo.setTitle("GIT mundo");
		frmGitMundo.setIconImage(Toolkit.getDefaultToolkit().getImage(Holamundogit.class.getResource("/imagen/e2379f091849a0abf9e9d56390953cfa.jpg")));
		frmGitMundo.setBounds(100, 100, 450, 300);
		frmGitMundo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGitMundo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("hsolaaaaa panico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(10, 38, 414, 153);
		frmGitMundo.getContentPane().add(lblNewLabel);
	}
}
