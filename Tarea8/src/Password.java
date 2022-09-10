import java.security.SecureRandom;
import java.util.Random;
/**
 * TAREA 8
 * @author Alvaro Benitez Carmona
 *
 */
public class Password {

	private float longitud=8;
	private String contrase�a;
	/**
	 * Constructor por defecto
	 */
	public Password() {
		contrase�a=null;
	}
	/**
	 * Constructor con parametros, generamos una contrase�a aleatoria. 
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrase�a=generarContrase�a(longitud);
	}
	/**
	 * Metodo que genera una contrase�a aleatoria segun la longitud.
	 * @param longitud Longitud de la contrase�a.
	 * @return Devuelve una contrase�a aleatoria. 
	 */
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
