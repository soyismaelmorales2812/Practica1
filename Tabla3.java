package segundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla3 {

	private JFrame frmCalculadora;
	private JTextArea textResultado;
	private JScrollBar sclNumero;
	private JButton btnBorrar;
	private JLabel lblNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla3 window = new Tabla3();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tabla3() {
		initialize();
	}

	public void calcularTabla(){
		try {
			int n=sclNumero.getValue();
			lblNumero.setText(""+sclNumero.getValue());
			textResultado.setText(
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
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora 3");
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(Tabla3.class.getResource("/imagen/copia/e2379f091849a0abf9e9d56390953cfa.jpg")));
		frmCalculadora.setBounds(100, 100, 438, 506);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		frmCalculadora.setLocationRelativeTo(null);
		sclNumero = new JScrollBar();
		sclNumero.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				calcularTabla();
			}
		});
		sclNumero.setBlockIncrement(2);
		sclNumero.setOrientation(JScrollBar.HORIZONTAL);
		sclNumero.setBounds(10, 58, 295, 23);
		frmCalculadora.getContentPane().add(sclNumero);
		
		textResultado = new JTextArea();
		textResultado.setEditable(false);
		textResultado.setBounds(10, 106, 251, 263);
		frmCalculadora.getContentPane().add(textResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sclNumero.setValue(0);
				textResultado.setText("");
			}
		});
		btnBorrar.setBounds(267, 107, 89, 23);
		frmCalculadora.getContentPane().add(btnBorrar);
		
		lblNumero = new JLabel("0");
		lblNumero.setBounds(353, 58, 59, 38);
		frmCalculadora.getContentPane().add(lblNumero);
	}

}
