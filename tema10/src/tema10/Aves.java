package tema10;

public abstract class Aves extends Mascotas {

	@Override
	public String toString() {
		return "Aves []";
	}

	public Aves(String nombrel, int edad, String estado, String fechanacimiento) {
		super(nombrel, edad, estado, fechanacimiento);
	}

}
