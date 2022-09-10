/**
 * TAREA 8
 * @author Alvaro Benitez Carmona
 *
 */
public class Electrodomesticos {
	private float precioBase, peso;
	private String color, consumoEnergetico;
	static final String blanco = "Blanco";
	static final String negro = "Negro";
	static final String rojo = "Rojo";
	static final String azul = "Azuñ";
	static final String gris = "Gris";	
	static final String consumoF = "F";
	static final float precio =100;
	static final float pesoIni = 5;
	
	/**
	 * Constructor por defecto
	 */
	public Electrodomesticos(){
		this.precioBase=precio;
		this.color=blanco;
		this.peso=pesoIni;
		this.consumoEnergetico=consumoF;
	}
	/**
	 * Constructor que se pasa por parametro el precio y el peso
	 * @param precio 
	 * @param peso
	 */
	public Electrodomesticos(Float precio,Float peso){
		this.precioBase=precio;
		this.color=blanco;
		this.peso=peso;
		this.consumoEnergetico=consumoF;
	}
	/**
	 * Constructor con todo por parametro 
	 * @param precio
	 * @param color
	 * @param peso
	 * @param consumo
	 */
	public Electrodomesticos(Float precio,String color, Float peso, String consumo){
		this.precioBase=precio;
		this.color=color;
		this.peso=peso;
		this.consumoEnergetico=consumo;
	}
	
}
