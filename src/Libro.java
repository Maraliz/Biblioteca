
public class Libro extends Literatura implements Categorizable {

	public Libro() {
		super();
	}
	public Libro (String titulo) {
		super.setTitulo(titulo);
	}
	public Libro (String titulo, String categoria) {
		super.setTitulo(titulo);
		super.setCategoria(categoria);
	}
	public String getCategoria() {
		return super.getCategoria();
	}
	

}
