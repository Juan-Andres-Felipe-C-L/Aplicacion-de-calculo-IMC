package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaRegistros extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JTextArea txtAreaRegistros;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JButton btnAtras;
	private JLabel lblBuscar;
	private JButton btnBuscar;
	private JButton btnEliminar;


	public VentanaRegistros() {
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
	
	private void iniciarComponentes() {		
		lblTitulo = new JLabel("PERSONAS REGISTRADAS");
		lblTitulo.setBounds(196, 11, 214, 20);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblTitulo);
		
		txtAreaRegistros = new JTextArea();
		txtAreaRegistros.setEditable(false); // opcional (solo lectura)
		scrollPane = new JScrollPane(txtAreaRegistros);
		scrollPane.setBounds(10, 57, 604, 253);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
		
		btnAtras = new JButton("Volver atrás");
		btnAtras.setBounds(498, 393, 116, 23);
		contentPane.add(btnAtras);
		btnAtras.addActionListener(this);
		
		lblBuscar = new JLabel("Buscar por I.D.: ");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBuscar.setBounds(167, 321, 116, 14);
		contentPane.add(lblBuscar);	
		
		textField = new JTextField();
		textField.setBounds(285, 320, 167, 20);
		contentPane.add(textField);
		textField.setColumns(30);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(0, 64, 128));
		btnBuscar.setBounds(196, 346, 89, 23);
		contentPane.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(255, 0, 0));
		btnEliminar.setBounds(321, 346, 89, 23);
		contentPane.add(btnEliminar);
		btnBuscar.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnBuscar) {
			//buscarCompra();
		} else if(e.getSource() == btnAtras) {
			//atras();
		} else if(e.getSource() == btnEliminar) {
			//Eliminar
		}
		
	}
}
