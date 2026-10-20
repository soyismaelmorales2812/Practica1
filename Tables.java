package segundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tables {

	private JFrame frmTablasDeMultiplicar;
	private JTextField textNumero;
	private JTextArea txtResultado;
	private JButton btnVer;
	private JButton btnBorrar;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tables window = new Tables();
					window.frmTablasDeMultiplicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tables() {
		initialize();
	}
	public void calcularTabla(){
		try {
			int n=Integer.parseInt(textNumero.getText().toString());
			txtResultado.setText(
							n+" X 1="+(n*1)+"\n"+
							n+" X 2="+(n*2)+"\n"+
							n+" X 3="+(n*3)+"\n"+
							n+" X 4="+(n*4)+"\n"+
							n+" X 5="+(n*5)+"\n"+
							n+" X 6="+(n*6)+"\n"+
							n+" X 7="+(n*7)+"\n"+
							n+" X 8="+(n*8)+"\n"+
							n+" X 9="+(n*9)+"\n"+
							n+" X 10="+(n*10)
					);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"error");
		}	}

	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setTitle("tablas de multiplicar");
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage(Tables.class.getResource("/imagen/e2379f091849a0abf9e9d56390953cfa.jpg")));
		frmTablasDeMultiplicar.setBounds(100, 100, 435, 408);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero.setBounds(10, 26, 77, 22);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
		textNumero.setBounds(79, 23, 120, 28);
		frmTablasDeMultiplicar.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		btnVer = new JButton("ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTabla();
				
			}
		});
		btnVer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVer.setBounds(212, 26, 89, 23);
		frmTablasDeMultiplicar.getContentPane().add(btnVer);
		
		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		txtResultado.setBounds(10, 80, 291, 236);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
				textNumero.setText("");
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(320, 27, 89, 23);
		frmTablasDeMultiplicar.getContentPane().add(btnBorrar);
	}
}
