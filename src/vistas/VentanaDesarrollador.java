package vistas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Desarrollador;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaDesarrollador extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblPrograma;
	private JLabel lblFecha;
	private JLabel lblDescripcion;
	private JLabel Nombre;
	private JLabel Programa;
	private JLabel Fecha;
	private JLabel Descripcion;
	private JButton btnAtras;
	private Coordinador coordinador;

	
	public VentanaDesarrollador(VentanaCalculo ventanaPrincipal, boolean modal) {
		super(ventanaPrincipal, modal);
		setTitle("Aplicación para IMC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);	
				
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		lblTitulo = new JLabel("Acerca del desarrollador");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setForeground(new Color(0, 128, 0));
		lblTitulo.setBounds(84, 11, 316, 98);
		contentPane.add(lblTitulo);
		
		panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 105, 464, 299);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(76, 5, 75, 20);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblNombre);
		
		lblPrograma = new JLabel("Programa: ");
		lblPrograma.setBounds(43, 70, 91, 20);
		lblPrograma.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblPrograma);
		
		lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(141, 131, 58, 20);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblFecha);
		
		lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setBounds(30, 166, 99, 20);
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblDescripcion);
		
		Nombre = new JLabel(Desarrollador.nombre);
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Nombre.setBounds(146, 8, 283, 14);
		panel.add(Nombre);
		
		Programa = new JLabel(Desarrollador.programa);
		Programa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Programa.setBounds(126, 66, 317, 28);
		panel.add(Programa);
		
		Fecha = new JLabel(Desarrollador.fecha.toString());
		Fecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Fecha.setBounds(198, 134, 91, 14);
		panel.add(Fecha);
		
		Descripcion = new JLabel(Desarrollador.descripcion);
		Descripcion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Descripcion.setBounds(30, 188, 408, 100);
		panel.add(Descripcion);
		
		btnAtras = new JButton("Volver atrás");
		btnAtras.setForeground(new Color(0, 128, 0));
		btnAtras.setBounds(186, 415, 130, 23);
		contentPane.add(btnAtras);
		btnAtras.addActionListener(this);
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAtras) {
			coordinador.mostrarVentanaCalculo();
			
		}
		
	}
	
	
}
