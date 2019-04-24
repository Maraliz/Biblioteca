
public abstract class Literatura {
	private String titulo;
	private String autor;
	private String editorial;
	private String categoria;

	public Literatura() {
		this.titulo = "No tiene, Titulo";
		this.autor = "No tiene Autor";
		this.editorial = "No tiene, Editorial";
		this.categoria = "No tiene, Categoria";
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getEditorial() {
		return editorial;
	}

	protected void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	protected String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}