package modelo;

import javax.swing.JTextField;

import controlador.Coordinador;

public class Procesos {
	private Coordinador coordinador;
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
	
	public boolean validarEdad(int edad) {
		if(edad>0 && edad<=120) {
			return true;
		}
		return false;
	}

	public boolean validarNumeros(double n1, double n2) {
		if(n1>0 && n2>0) {
			return true;
		}
		return false;
	}
	
	public double calcularIMC(double peso, double estatura) {
		double resultado;
		resultado = (peso/(Math.pow(estatura, 2)));
		return resultado;		
	}
	
	public String clasificar(double imc) {
		String clasificacion = "";
		if(imc>0 && imc<18.5) {
			clasificacion = "Peso bajo.";
		}else if(imc>=18.5 && imc<=24.9) {
			clasificacion = "Peso normal.";
		}else if(imc>=25 && imc<=29.9) {
			clasificacion = "Sobrepeso.";
		}else if(imc>=30) {
			clasificacion = "Obesidad.";
		}
		return clasificacion;
	}	

	public boolean esTextoValido(JTextField campo) {
	    String texto = campo.getText().trim(); // Captura el texto
	    // Validar que no esté vacío y que solo tenga letras (y espacios)
	    if (texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
