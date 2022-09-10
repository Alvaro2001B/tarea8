
public class Persona {

	private String nombre, DNI, sexo;
	private int edad;
	private double peso, altura;
	static final String H = "H";
	static final String M = "M";
	
	//Constructor por defecto
	public Persona() {
		this.nombre=null;
		this.DNI=null;
		this.sexo=H;
		this.edad=0;
		this.peso=0.0;
		this.altura=0.0;
				
	}
	
	//Constructor nombre, edad y sexo, lo demas por defecto;
	public Persona(String nombre, int edad, String Sexo) {
		this.nombre=nombre;
		this.DNI=null;

		if(Sexo.equalsIgnoreCase("hombre")) {
			this.sexo=H;
		}else {
			this.sexo=M;
		}
		
		this.edad=edad;
		this.peso=0.0;
		this.altura=0.0;
	}
	
	
	//Constructor con todos los atributos como parametro
	public Persona(String nombre, String DNI,String Sexo,int edad, double peso, double altura) {
		this.nombre=nombre;
		this.DNI=DNI;
		
		if(Sexo.equalsIgnoreCase("hombre")) {
			this.sexo=H;
		}else {
			this.sexo=M;
		}
		
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static String getH() {
		return H;
	}

	public static String getM() {
		return M;
	}
	
	
}
