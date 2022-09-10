import java.security.SecureRandom;
import java.util.Random;
/**
 * TAREA 8
 * @author Alvaro Benitez Carmona
 *
 */
public class Password {

	private float longitud=8;
	private String contraseña;
	/**
	 * Constructor por defecto
	 */
	public Password() {
		contraseña=null;
	}
	/**
	 * Constructor con parametros, generamos una contraseña aleatoria. 
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=generarContraseña(longitud);
	}
	/**
	 * Metodo que genera una contraseña aleatoria segun la longitud.
	 * @param longitud Longitud de la contraseña.
	 * @return Devuelve una contraseña aleatoria. 
	 */
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
