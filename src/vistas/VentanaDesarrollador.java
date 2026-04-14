package vistas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaDesarrollador extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public VentanaDesarrollador() {
		setTitle("Aplicación para IMC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 663, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
				
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		
	}

}
