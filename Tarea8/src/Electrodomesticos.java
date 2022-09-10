
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
	
	
	public Electrodomesticos(){
		this.precioBase=precio;
		this.color=blanco;
		this.peso=pesoIni;
		this.consumoEnergetico=consumoF;
	}
	
	public Electrodomesticos(Float precio,Float peso){
		this.precioBase=precio;
		this.color=blanco;
		this.peso=peso;
		this.consumoEnergetico=consumoF;
	}
	public Electrodomesticos(Float precio,String color, Float peso, String consumo){
		this.precioBase=precio;
		this.color=color;
		this.peso=peso;
		this.consumoEnergetico=consumo;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public static String getBlanco() {
		return blanco;
	}

	public static String getNegro() {
		return negro;
	}

	public static String getRojo() {
		return rojo;
	}

	public static String getAzul() {
		return azul;
	}

	public static String getGris() {
		return gris;
	}

	public static String getConsumof() {
		return consumoF;
	}

	public static float getPrecio() {
		return precio;
	}

	public static float getPesoini() {
		return pesoIni;
	}
	
}
