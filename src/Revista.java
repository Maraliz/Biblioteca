
public class Revista extends Literatura implements Categorizable {

	public Revista() {
		super();
	}
	public Revista (String titulo) {
		super.setTitulo(titulo);
	}
	public String getCategoria() {
		return super.getCategoria();
	}
	

}

