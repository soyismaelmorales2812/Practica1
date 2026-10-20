package segundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla2 {

	private JFrame frmTablasDos;
	private JTextArea textResultado;
	private JSlider sldNumero;
	private JLabel lblNumero;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla2 window = new Tabla2();
					window.frmTablasDos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tabla2() {
		initialize();
	}

	public void calcularTabla(){
		try {
			int n=sldNumero.getValue();
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
		frmTablasDos = new JFrame();
		frmTablasDos.setTitle("Tablas dos");
		frmTablasDos.setIconImage(Toolkit.getDefaultToolkit().getImage(Tabla2.class.getResource("/imagen/e2379f091849a0abf9e9d56390953cfa.jpg")));
		frmTablasDos.setBounds(100, 100, 454, 393);
		frmTablasDos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDos.getContentPane().setLayout(null);
		frmTablasDos.setLocationRelativeTo(null);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumero.setBounds(365, 11, 59, 45);
		frmTablasDos.getContentPane().add(lblNumero);
		
		sldNumero = new JSlider();
		sldNumero.setValue(0);
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumero.setText(""+sldNumero.getValue());
				calcularTabla();
			}
		});
		sldNumero.setSnapToTicks(true);
		sldNumero.setPaintTicks(true);
		sldNumero.setPaintLabels(true);
		sldNumero.setMajorTickSpacing(10);
		sldNumero.setBounds(10, 11, 332, 45);
		frmTablasDos.getContentPane().add(sldNumero);
		
		
		
		textResultado = new JTextArea();
		textResultado.setEditable(false);
		textResultado.setFont(new Font("Monospaced", Font.BOLD, 14));
		textResultado.setBounds(23, 78, 319, 254);
		frmTablasDos.getContentPane().add(textResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldNumero.setValue(0);
				textResultado.setText("");
			}
		});
		btnBorrar.setBounds(352, 80, 89, 23);
		frmTablasDos.getContentPane().add(btnBorrar);
	}
}
