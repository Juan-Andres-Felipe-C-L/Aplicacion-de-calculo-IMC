package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.Coordinador;

public class PersonaDAO {
	private Coordinador coordinador;
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
		
	ArrayList<PersonaDTO> listaPersonas; 
	
	public PersonaDAO() {
		listaPersonas = new ArrayList<PersonaDTO>();
	}

	public boolean registrarPersona(PersonaDTO persona) {
	    for (PersonaDTO u : listaPersonas) {
	        if (u.getId().equals(persona.getId())) {
	            return false;
	        }
	    }
	    listaPersonas.add(persona);
	    return true;
	}
				
	public PersonaDTO consultarUsuarioDocumento(String id) {
	    for (PersonaDTO p : listaPersonas) {
	        if (p.getId() != null && p.getId().equals(id)) {
	            return p;
	        }
	    }
	    return null;
	}
	
	public ArrayList<PersonaDTO> consultarPersonasLista() {
		return listaPersonas;
	}
	
	public int actualizarPersona(PersonaDTO persona) {
		if(listaPersonas.size() == 0) {
			return 0;
		} else {
		    for (int i = 0; i < listaPersonas.size(); i++) {
		        if (listaPersonas.get(i).getId().equals(persona.getId())) {
		            listaPersonas.set(i, persona);
		            return 1;
		        }
		    }
		}
	    return 2;
	}
	
	public int eliminarPersona(String id) {
		if(listaPersonas.size() == 0) {
			return 0;
		} else {
		    for (int i = 0; i < listaPersonas.size(); i++) {
		        if (listaPersonas.get(i).getId().equals(id)) {
		            listaPersonas.remove(i);
		            return 1;
		        }
		    }
		}
	    return 2;
	}
}
