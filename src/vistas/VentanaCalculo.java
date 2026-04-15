package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.PersonaDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombres;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtEstatura;
	private JLabel lblTitulo;
	private JLabel lblID;
	private JLabel lblNombres;
	private JLabel lblEdad;
	private JLabel lblPeso;
	private JLabel lblEstatura;
	private JPanel panelOpciones;
	private JLabel lblOpciones;
	private JButton btnCalcular;
	private JButton btnListar;
	private JButton btnLimpiar;
	private JButton btnActualizar;
	private JPanel panelResultados;
	private JLabel lblResultado;
	private JLabel Resultado;
	private JLabel lblClasificacion;
	private JLabel Clasificacion;
	private JLabel lblResults;
	private JButton btnDesarrollador;
	private Coordinador coordinador;

	public VentanaCalculo() {
		setTitle("Aplicación para IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
	
	public void iniciarComponentes() {
		
		lblTitulo = new JLabel("Cálculo del Índice de Masa Corporal (IMC)");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTitulo.setBounds(75, 11, 488, 65);
		contentPane.add(lblTitulo);
		
		lblID = new JLabel("I.D.:");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblID.setBounds(20, 106, 46, 14);
		contentPane.add(lblID);
		
		lblNombres = new JLabel("Nombres: ");
		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombres.setBounds(218, 106, 83, 14);
		contentPane.add(lblNombres);
		
		lblEdad = new JLabel("Edad: ");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEdad.setBounds(20, 175, 51, 14);
		contentPane.add(lblEdad);
		
		lblPeso = new JLabel("Peso (Kg): ");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPeso.setBounds(131, 172, 90, 20);
		contentPane.add(lblPeso);
		
		lblEstatura = new JLabel("Estatura (m):");
		lblEstatura.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstatura.setBounds(282, 175, 117, 14);
		contentPane.add(lblEstatura);
		
		txtID = new JTextField();
		txtID.setBounds(55, 105, 153, 20);
		contentPane.add(txtID);
		txtID.setColumns(30);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(298, 105, 171, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(50);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(67, 174, 46, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(3);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(218, 174, 51, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(3);
		
		txtEstatura = new JTextField();
		txtEstatura.setBounds(394, 174, 75, 20);
		contentPane.add(txtEstatura);
		txtEstatura.setColumns(10);
		
		panelOpciones = new JPanel();
		panelOpciones.setBackground(new Color(255, 255, 255));
		panelOpciones.setBounds(489, 87, 136, 152);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		lblOpciones = new JLabel("Opciones:");
		lblOpciones.setBounds(28, 5, 79, 20);
		lblOpciones.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelOpciones.add(lblOpciones);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 30, 107, 23);
		btnCalcular.setForeground(new Color(0, 0, 255));
		panelOpciones.add(btnCalcular);
		btnCalcular.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(10, 58, 107, 23);
		btnListar.setForeground(new Color(0, 255, 0));
		panelOpciones.add(btnListar);
		btnListar.addActionListener(this);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(10, 118, 107, 23);
		btnLimpiar.setForeground(new Color(255, 128, 0));
		panelOpciones.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 92, 107, 23);
		panelOpciones.add(btnActualizar);
		btnActualizar.addActionListener(this);
		
		panelResultados = new JPanel();
		panelResultados.setBackground(new Color(192, 192, 192));
		panelResultados.setBounds(20, 250, 605, 121);
		contentPane.add(panelResultados);
		panelResultados.setLayout(null);
		
		lblResultado = new JLabel("I.M.C.: ");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblResultado.setBounds(50, 49, 81, 27);
		panelResultados.add(lblResultado);
		
		Resultado = new JLabel("0,0");
		Resultado.setForeground(new Color(0, 0, 255));
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Resultado.setBounds(131, 49, 111, 27);
		panelResultados.add(Resultado);
		
		lblClasificacion = new JLabel("Clasificación: ");
		lblClasificacion.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblClasificacion.setForeground(new Color(0, 0, 0));
		lblClasificacion.setBounds(252, 49, 154, 27);
		panelResultados.add(lblClasificacion);
		
		Clasificacion = new JLabel("Ninguna.");
		Clasificacion.setForeground(new Color(0, 0, 255));
		Clasificacion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Clasificacion.setBounds(404, 49, 180, 27);
		panelResultados.add(Clasificacion);
		
		lblResults = new JLabel("RESULTADOS:");
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResults.setBounds(20, 225, 153, 25);
		contentPane.add(lblResults);
		
		btnDesarrollador = new JButton("Acerca del desarrollador");
		btnDesarrollador.setForeground(new Color(0, 128, 64));
		btnDesarrollador.setBounds(214, 393, 185, 23);
		contentPane.add(btnDesarrollador);
		btnDesarrollador.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCalcular) {
			calcular();
		} else if(e.getSource() == btnListar) {
			coordinador.mostrarVentanaRegistros();
		} else if(e.getSource() == btnLimpiar) {
			limpiarCampos();
		} else if(e.getSource() == btnActualizar) {
			actualizar();
		} else if(e.getSource() == btnDesarrollador) {
			coordinador.mostrarVentanaDesarrollador();
		}
		
	}	
	
	private void limpiarCampos() {
		txtID.setText("");
		txtNombres.setText("");
		txtEdad.setText("");
		txtPeso.setText("");
		txtEstatura.setText("");
		Resultado.setText("0,0");
		Clasificacion.setText("Ninguna.");
	}
	
	private void calcular() {
		int edad = Integer.parseInt(txtEdad.getText());
		double peso = Double.parseDouble(txtPeso.getText());
		double estatura = Double.parseDouble(txtEstatura.getText());
		if(coordinador.esTextoValido(txtNombres) && coordinador.validarEdad(edad) && coordinador.validarNumeros(peso, estatura)) {
			double IMC = coordinador.calcularIMC(peso, estatura);
			String clasificacion = coordinador.clasificar(IMC);
			Resultado.setText(Double.toString(IMC));
			Clasificacion.setText(clasificacion);
			PersonaDTO personaDto = new PersonaDTO(txtID.getText(), txtNombres.getText(), edad, peso, estatura, IMC, clasificacion);
			if(coordinador.registrarPersona(personaDto)) {
				JOptionPane.showMessageDialog(null, "Persona registrada exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "Ya hay una persona registrada con ese I.D.");
				limpiarCampos();
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "<html>Usuario, por favor, revise los campos de los datos: El nombre solo debe contener letras, la edad deben"
					+ " de ser números mayores a 0 y menores o iguales a 120, y, el peso y la estatura deben ser números mayores a 0.</html>");
			limpiarCampos();
		}
	}
	
	private void actualizar() {
		int edad = Integer.parseInt(txtEdad.getText());
		double peso = Double.parseDouble(txtPeso.getText());
		double estatura = Double.parseDouble(txtEstatura.getText());
		if(coordinador.esTextoValido(txtNombres) && coordinador.validarEdad(edad) && coordinador.validarNumeros(peso, estatura)) {
			double IMC = coordinador.calcularIMC(peso, estatura);
			String clasificacion = coordinador.clasificar(IMC);
			Resultado.setText(Double.toString(IMC));
			Clasificacion.setText(clasificacion);
			PersonaDTO personaDto = new PersonaDTO(txtID.getText(), txtNombres.getText(), edad, peso, estatura, IMC, clasificacion);
			if(coordinador.actualizarPersona(personaDto) == 0) {
				JOptionPane.showMessageDialog(null, "No hay registros aún.");
				limpiarCampos();
			} else if (coordinador.actualizarPersona(personaDto) == 1) {
				JOptionPane.showMessageDialog(null, "Actualización exitosa.");
			} else if (coordinador.actualizarPersona(personaDto) == 2) {
				JOptionPane.showMessageDialog(null, "No se encontró una persona con el I.D. consultado.");
				limpiarCampos();
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "<html>Usuario, por favor, revise los campos de los datos: El nombre solo debe contener letras, la edad deben"
					+ " de ser números mayores a 0 y menores o iguales a 120, y, el peso y la estatura deben ser números mayores a 0.</html>");
			limpiarCampos();
		}
	}
	
}
