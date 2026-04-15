package controlador;

import modelo.PersonaDAO;
import modelo.Procesos;
import vistas.VentanaCalculo;
import vistas.VentanaDesarrollador;
import vistas.VentanaRegistros;

public class Relaciones {
	
	public Relaciones() {
		VentanaCalculo ventanaPrincipal = new VentanaCalculo();
		VentanaRegistros ventanaRegistros = new VentanaRegistros(ventanaPrincipal, true);
		VentanaDesarrollador ventanaInfo = new VentanaDesarrollador(ventanaPrincipal, true);
		Procesos procesos = new Procesos();
		PersonaDAO personaDao = new PersonaDAO();
		Coordinador coordinador = new Coordinador();
		
		ventanaPrincipal.setCoordinador(coordinador);
		ventanaRegistros.setCoordinador(coordinador);
		ventanaInfo.setCoordinador(coordinador);
		procesos.setCoordinador(coordinador);
		personaDao.setCoordinador(coordinador);
		
		coordinador.setVentanaCalculo(ventanaPrincipal);
		coordinador.setVentanaRegistros(ventanaRegistros);
		coordinador.setVentanaDesarrollador(ventanaInfo);
		coordinador.setProcesos(procesos);
		coordinador.setPersonaDAO(personaDao);
		
		coordinador.mostrarVentanaCalculo();
	}
}
