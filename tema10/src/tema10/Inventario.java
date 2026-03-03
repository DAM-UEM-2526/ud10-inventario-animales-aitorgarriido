package tema10;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Mascotas> mascotas;
	
	public ArrayList<Mascotas> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascotas> mascotas) {
		this.mascotas = mascotas;
	}

	public Inventario(ArrayList<Mascotas> mascotas) {
		super();
		this.mascotas = new ArrayList<>();
	}

	// este metodo vacia el inventario entero
	public void vaciar() {
			mascotas.removeAll(mascotas);
		}

	// este metodo mete nuevas mascotas al inventario
	public void InsertaMascota(Mascotas a) {
		mascotas.add(a);
	}

	// recorre el inventario entero y si encuentra ese animal buscado lo elimina del
	// inventario
	public void eliminaMascota(String nombrel) {
		for (int i = 0; i < mascotas.size(); i++) {
			if (mascotas.get(i).equals(nombrel)) {
				mascotas.remove(i);
			}
		}
	}

	// muestra todos los animales del inventario
	public void imprimirTodos() {
		for (int i = 0; i < mascotas.size(); i++) {
			System.out.println( mascotas.get(i));
		}
	}
	@Override
	public String toString() {
		return "Inventario [mascotas=" + mascotas + "]";
	}

	//recorre el inventario entero y si encuentra perros los muestra
	public void imprimirPerros() {
		for (int i = 0; i < mascotas.size(); i++) {
			if (mascotas.get(i) instanceof Perro) {
				System.out.println( mascotas.get(i));
			}
		}
	}
}
