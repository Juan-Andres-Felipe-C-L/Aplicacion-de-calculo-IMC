package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PersonaDAO {
		
	ArrayList<PersonaDTO> listaPersonas; 
	
	public PersonaDAO() {
		listaPersonas = new ArrayList<PersonaDTO>();
	}

	public boolean registrarPersona(PersonaDTO persona) {
		boolean variable = true;
		for(PersonaDTO u : listaPersonas) {
			if(u.getId() == persona.getId()) {
				variable = true;
			} else {
				listaPersonas.add(persona);
				variable = false;
			}			
		}
		return variable;
	}
				
	public PersonaDTO consultarUsuarioDocumento(String id) {
		PersonaDTO persona = null;
		if(listaPersonas.size() == 0) {
			JOptionPane.showMessageDialog(null, "No hay datos registrados aún.");
		} else {
			for(PersonaDTO p : listaPersonas) {
				if(p.getId() == id) {
					persona = p;
					System.out.println("\nRESULTADOS DE LA BÚSQUEDA:");
					System.out.println(persona);
				} else {
					System.out.println("\nLA PERSONA NO ESTÁ REGISTRADA.");
				}		
			}
		}
		return persona;
	}
	
	public ArrayList<PersonaDTO> consultarPersonasLista() {
		if(listaPersonas.size() == 0) {
			JOptionPane.showMessageDialog(null, "No hay datos registrados aún.");
			return null;
		} else {
			System.out.println("\n <<<<<< LISTA DE OPERARIOS >>>>>>");
			System.out.println(listaPersonas);
			return listaPersonas;
		}
	}
	
	public boolean actualizarPersona(PersonaDTO persona) {
		if(listaPersonas.size() == 0) {
			JOptionPane.showMessageDialog(null, "No hay datos registrados aún.");
			return false;
		} else {
		    for (int i = 0; i < listaPersonas.size(); i++) {
		        if (listaPersonas.get(i).getId() == persona.getId()) {
		            listaPersonas.set(i, persona);
		            return true;
		        }
		    }
		}
	    return false;
	}
	
	public boolean eliminarPersona(String id) {
		if(listaPersonas.size() == 0) {
			JOptionPane.showMessageDialog(null, "No hay datos registrados aún.");
			return false;
		} else {
		    for (int i = 0; i < listaPersonas.size(); i++) {
		        if (listaPersonas.get(i).getId() == id) {
		            listaPersonas.remove(i);
		            return true;
		        }
		    }
		}
	    return false;
	}
}
