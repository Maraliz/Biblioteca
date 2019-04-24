import java.util.ArrayList;

public class Libreria {
	private ArrayList<Literatura> Inventario;

	private String Nombre;

	public void agregarItem(Literatura Item) {
		Inventario.add(Item);
	}

	public Libreria(String Nombre) {
		this.setNombre(Nombre);
		Inventario = new ArrayList<Literatura>();
	}

	public Libreria(String Nombre, ArrayList<Literatura> InventarioInicial) {
		this.setNombre(Nombre);
		this.Inventario = InventarioInicial;
		

	}

	public Libreria() {
		this.setNombre("Libreria del Estado");
	

	}
public void imprimirCatalogo() {
	System.out.println("Inventario de la libreria "+this.getNombre()+" - "+this.getNumeroDeLibros()+" titulos.");
	for(Literatura chingaderita:Inventario) {
		System.out.println("\n\""+chingaderita.getTitulo()+"\"\nCategoria: "+chingaderita.getCategoria()+"\nEditorial: "+chingaderita.getEditorial()+"\nAutor: "+chingaderita.getAutor());
		
	}
}
	public String getNombre() {
		return Nombre;
	}

	private void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNumeroDeLibros() {
		return Inventario.size();
	}
}
