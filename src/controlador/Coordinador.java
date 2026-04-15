package controlador;

import java.util.ArrayList;

import javax.swing.JTextField;

import modelo.PersonaDAO;
import modelo.PersonaDTO;
import modelo.Procesos;
import vistas.VentanaCalculo;
import vistas.VentanaDesarrollador;
import vistas.VentanaRegistros;

public class Coordinador {
	private VentanaCalculo ventanaPrincipal;
	private VentanaRegistros ventanaRegistros;
	private VentanaDesarrollador ventanaInfo;
	private Procesos procesos;
	private PersonaDAO personaDao;
	
	public void setVentanaCalculo(VentanaCalculo ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
	public void setVentanaRegistros(VentanaRegistros ventanaRegistros) {
		this.ventanaRegistros = ventanaRegistros;
	}
	public void setVentanaDesarrollador(VentanaDesarrollador ventanaInfo) {
		this.ventanaInfo = ventanaInfo;
	}
	public void setProcesos(Procesos procesos) {
		this.procesos = procesos;
	}
	public void setPersonaDAO(PersonaDAO personaDao) {
		this.personaDao = personaDao;
	}
	
	public void mostrarVentanaCalculo() {
		ventanaPrincipal.setVisible(true);
		ventanaRegistros.setVisible(false);
		ventanaInfo.setVisible(false);
	}
	
	public void mostrarVentanaRegistros() {
		ventanaRegistros.mostrarLista();
		ventanaRegistros.setVisible(true);
	}
	
	public void mostrarVentanaDesarrollador() {
		ventanaInfo.setVisible(true);
	}
	
	public boolean validarEdad(int edad) {
		boolean validacion = procesos.validarEdad(edad);
		return validacion;
	}
	
	public boolean validarNumeros(double n1, double n2) {
		boolean validacion = procesos.validarNumeros(n1, n2);
		return validacion;
	}
	
	public double calcularIMC(double peso, double estatura) {
		double IMC = procesos.calcularIMC(peso, estatura);
		return IMC;
	}
	
	public String clasificar(double imc) {
		String clasificacion = procesos.clasificar(imc);
		return clasificacion;
	}
	
	public boolean esTextoValido(JTextField campo) {
		boolean validacion = procesos.esTextoValido(campo);
		return validacion;
	}
	
	public boolean registrarPersona(PersonaDTO persona) {
		return personaDao.registrarPersona(persona);
	}
	
	public PersonaDTO consultarUsuarioDocumento(String id) {
		return personaDao.consultarUsuarioDocumento(id);
	}
	
	public ArrayList<PersonaDTO> consultarPersonasLista() {
		return personaDao.consultarPersonasLista();
	}
	
	public int actualizarPersona(PersonaDTO persona) {
		return personaDao.actualizarPersona(persona);
	}

	public int eliminarPersona(String id) {
		return personaDao.eliminarPersona(id);
	}
	
}
