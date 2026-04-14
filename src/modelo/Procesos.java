package modelo;

public class Procesos {
	
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
	
	//VALIDAR TEXTO
	
	//PORCESO IMC
	
	//CLASIFICACIÓN
}
