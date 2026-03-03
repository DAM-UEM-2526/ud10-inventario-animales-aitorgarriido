package tema10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creo un objeto perro y uno gato
		Perro r= new Perro("Rocky",1,"OK","11/02/2017");
		Gato g=new Gato("Negro", 2,"OK","05/01/2016");
		//muestro el nombre del perro y el estado del gato
		System.out.println(r.getNombrel());
		System.out.println(g.getEstado());
		//creo un inventario vacio al que meto mi perro y mi gato
		Inventario i=new Inventario(null);
		i.InsertaMascota(g);
		i.InsertaMascota(r);
		//muestro primero los dos y luego solo el perro
		i.imprimirTodos();
		i.imprimirPerros();
		//vacio el inventario entero
		i.vaciar();
		//trato de mostrar lo mismo que antes pero al estar vacio no muestra nada
		i.imprimirTodos();
		i.imprimirPerros();
	}

}
