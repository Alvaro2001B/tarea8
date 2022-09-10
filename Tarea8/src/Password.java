import java.security.SecureRandom;
import java.util.Random;

public class Password {

	private float longitud=8;
	private String contraseña;
	
	public Password() {
		contraseña=null;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=generarContraseña(longitud);
	}
	
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	private String generarContraseña(int longitud) {
		//Este es el rango para crear la contraseña
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 SecureRandom random = new SecureRandom();
	     StringBuilder sb = new StringBuilder();
	     
	     //Cada vez que hace una iteracion elegimos un nuevo elemento
	     for (int i = 0; i < longitud; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }
	 
	     return sb.toString();
		
	}
	
}
