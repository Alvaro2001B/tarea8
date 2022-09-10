import java.security.SecureRandom;
import java.util.Random;

public class Password {

	private float longitud=8;
	private String contrase�a;
	
	public Password() {
		contrase�a=null;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrase�a=generarContrase�a(longitud);
	}
	
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	private String generarContrase�a(int longitud) {
		//Este es el rango para crear la contrase�a
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
