package segundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Signosodiacal {

	private JFrame frmSignoSodiacal;
	private JLabel lblSigno;
	private JSlider sldDia;
	private JLabel lblNumero;
	private JLabel lblMes;
	private JComboBox cdmMes;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signosodiacal window = new Signosodiacal();
					window.frmSignoSodiacal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Signosodiacal() {
		initialize();
	}
	public void calcularSigno() {
	    int dia = sldDia.getValue();
	    lblNumero.setText("" + dia);
	    String mes = cdmMes.getSelectedItem().toString();
	    lblMes.setText(dia + " de " + mes);
	    
	    String ruta = "";
	    
	    switch(mes) {
        case "Enero":
            ruta = (dia >= 20) ? "/Signos/Acuario.jpeg" : "/Signos/Capicornio.jpeg";
            break;
        case "Febrero":
            ruta = (dia >= 19) ? "/Signos/Pircis.jpeg" : "/Signos/Acuario.jpeg";
            break;
        case "Marzo":
            ruta = (dia >= 21) ? "/Signos/Aries.jpeg" : "/Signos/Pircis.jpeg";
            break;
        case "Abril":
            ruta = (dia >= 20) ? "/Signos/Tauro.jpeg" : "/Signos/Aries.jpeg";
            break;
        case "Mayo":
            ruta = (dia >= 21) ? "/Signos/Geminis.jpeg" : "/Signos/Tauro.jpeg";
            break;
        case "Junio":
            ruta = (dia >= 21) ? "/Signos/Cancer.jpeg" : "/Signos/Geminis.jpeg";
            break;
        case "Julio":
            ruta = (dia >= 23) ? "/Signos/Leo.jpeg" : "/Signos/Cancer.jpeg";
            break;
        case "Agosto":
            ruta = (dia >= 23) ? "/Signos/Virgo.jpeg" : "/Signos/Leo.jpeg";
            break;
        case "Septiembre":
            ruta = (dia >= 23) ? "/Signos/Libra.jpeg" : "/Signos/Virgo.jpeg";
            break;
        case "Octubre":
            ruta = (dia >= 23) ? "/Signos/Escorpio.jpeg" : "/Signos/Libra.jpeg";
            break;
        case "Noviembre":
            ruta = (dia >= 22) ? "/Signos/sagitario.jpeg" : "/Signos/Escorpio.jpeg";
            break;
        case "Disiembre":
            ruta = (dia >= 22) ? "/Signos/Capicornio.jpeg" : "/Signos/sagitario.jpeg";
            break;
    }
    ponerImagen(ruta);
}
	

	private void ponerImagen(String ruta) {
	    java.net.URL url = Signosodiacal.class.getResource(ruta);
	    if(url == null) return;
	    
	    ImageIcon iconoOriginal = new ImageIcon(url);
	    java.awt.Image img = java.awt.Toolkit.getDefaultToolkit().getImage(url);

	    int wLabel = lblSigno.getWidth();
	    int hLabel = lblSigno.getHeight();
	    if(wLabel <= 0) wLabel = 300;
	    if(hLabel <= 0) hLabel = 400;

	    int wImg = iconoOriginal.getIconWidth();
	    int hImg = iconoOriginal.getIconHeight();

	    double escala = Math.min((double)wLabel/wImg, (double)hLabel/hImg);
	    int nw = (int)(wImg * escala);
	    int nh = (int)(hImg * escala);

	    java.awt.Image imgAjustada = img.getScaledInstance(nw, nh, java.awt.Image.SCALE_SMOOTH);
	    lblSigno.setIcon(new ImageIcon(imgAjustada));
	    lblSigno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	}
	private void initialize() {
		frmSignoSodiacal = new JFrame();
		frmSignoSodiacal.setResizable(false);
		frmSignoSodiacal.setTitle("Signo sodiacal");
		frmSignoSodiacal.setIconImage(Toolkit.getDefaultToolkit().getImage(Signosodiacal.class.getResource("/imagen/e2379f091849a0abf9e9d56390953cfa.jpg")));
		frmSignoSodiacal.setBounds(100, 100, 610, 707);
		frmSignoSodiacal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignoSodiacal.getContentPane().setLayout(null);
		frmSignoSodiacal.setLocationRelativeTo(null);
		
		
		
		JLabel lblmes = new JLabel("Mes");
		lblmes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblmes.setBounds(10, 67, 81, 26);
		frmSignoSodiacal.getContentPane().add(lblmes);
		
		lblNumero = new JLabel("1");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNumero.setBounds(409, 21, 115, 45);
		frmSignoSodiacal.getContentPane().add(lblNumero);
		
		lblSigno = new JLabel("");
		lblSigno.setIcon(new ImageIcon(Signosodiacal.class.getResource("/Signos/Portadaxd-removebg-preview.png")));
		lblSigno.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSigno.setBounds(0, 226, 584, 431);
		frmSignoSodiacal.getContentPane().add(lblSigno);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDia.setBounds(10, 0, 81, 20);
		frmSignoSodiacal.getContentPane().add(lblDia);
		
		
		
		lblMes = new JLabel("");
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMes.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMes.setBounds(10, 147, 509, 60);
		frmSignoSodiacal.getContentPane().add(lblMes);
		frmSignoSodiacal.setLocationRelativeTo(null);
		
		cdmMes = new JComboBox();
		cdmMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Disiembre"}));
		cdmMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularSigno();
			}
		});
		cdmMes.setBounds(20, 96, 147, 40);
		frmSignoSodiacal.getContentPane().add(cdmMes);
		
		sldDia = new JSlider();
		sldDia.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				calcularSigno();
			}
		});
		sldDia.setValue(0);
		sldDia.setPaintLabels(true);
		sldDia.setPaintTicks(true);
		sldDia.setMaximum(30);
		sldDia.setMajorTickSpacing(2);
		sldDia.setBounds(10, 21, 375, 45);
		frmSignoSodiacal.getContentPane().add(sldDia);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldDia.setValue(1);
				lblNumero.setText("1");
				cdmMes.setSelectedIndex(0);
				
				
				
			}
		});
		btnBorrar.setBounds(215, 96, 89, 23);
		frmSignoSodiacal.getContentPane().add(btnBorrar);
	}
}
