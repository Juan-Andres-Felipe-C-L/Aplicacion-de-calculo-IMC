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
	
	public double calcularIMC(double peso, double estatura) {
		double resultado;
		resultado = ((Math.pow(estatura, 2))/peso );
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
	
	
}
