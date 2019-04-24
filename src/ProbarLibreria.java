/*
 * Tarea Interfaz
 * Crear clase abstracta,2 sub clases e implementar una Interfaz
 * - Constructores sobrecargados
 * - Atributos encapsulados con setters y getters 
 * - Uso de arrayLists 
 */
public class ProbarLibreria {

	public static void main(String[] args) {
			Libreria miLibreria = new Libreria("Biblioteca de Arte"); //Creamos una libreria con nombre 
		
		//Instantaciones de clases ##############
		Libro libA = new Libro("Como hacer feliz a la gente", "ciencia ficción");// Creamos un libro usando constructor sobrecargado con categoria
		Libro libB = new Libro("El tú de hoy");// creamos libro sin categoria
		libB.setCategoria("arte");//como creamos libro sin categoria, estamos usando el setter para asignarsela 
		Revista revA = new Revista("Vanidades");// creamos revista con titulo
		revA.setEditorial("Santillana");// asignamos editorial
		
		//inserciones #################### 
		miLibreria.agregarItem(libA);//insertamos libro a libreria
		miLibreria.agregarItem(libB);// insertar libB
		miLibreria.agregarItem(new Libro());// inserto libro sin asignarlo previamente
		miLibreria.agregarItem(revA);// Insertar revista
		miLibreria.agregarItem(new Revista("Caras"));//inserto revista sin asignarlo previamente, pasandolo titulo a constructor
		 
		//ya agregamos todo el catalogo imprimir inventario #####################
		miLibreria.imprimirCatalogo();
	}
		

}
