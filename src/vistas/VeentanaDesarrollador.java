package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VeentanaDesarrollador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public VeentanaDesarrollador() {
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
