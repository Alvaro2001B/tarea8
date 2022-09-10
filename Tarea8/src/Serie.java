
public class Serie {

	
	private String titulo, genero, creador;
	private int numTemporadas;
	private boolean entregado=false;
	
	public Serie() {
		this.titulo=null;
		this.numTemporadas=3;
		this.genero=null;
		this.creador=null;
	}
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.numTemporadas=3;
		this.genero=null;
		this.creador=creador;
	}
	public Serie(String titulo, String creador, int numTemporadas, String genero) {
		this.titulo=titulo;
		this.numTemporadas=numTemporadas;
		this.genero=genero;
		this.creador=creador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getNumTemporadas() {
		return numTemporadas;
	}
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
}
