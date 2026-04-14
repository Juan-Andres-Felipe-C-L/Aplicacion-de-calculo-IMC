package modelo;

public class PersonaDTO {
	private String id;
	private String  nombre;
	private int edad;
	private double peso;
	private double estatura;
	private double IMC;
	private String clasificacion;
	
	public PersonaDTO() {
		
	}

	public PersonaDTO(String id, String nombre, int edad, double peso, double estatura, double IMC, String clasificacion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.IMC = IMC;
		this.clasificacion = clasificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		this.IMC = iMC;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\n\n-I.D.: " + id + ", \n-Nombre: " + nombre + ", \n-Edad: " + edad + ", \n-Peso: " + peso + ", \n-Estatura: " + estatura + ", \n-IMC: "
				+ IMC + "(IMC), \n-Clasificación: " + clasificacion + ".";
	}
	
}
