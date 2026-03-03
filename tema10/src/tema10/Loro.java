package tema10;

public class Loro extends Aves {

	@Override
	public String toString() {
		return "Loro []";
	}

	public Loro(String nombrel, int edad, String estado, String fechanacimiento) {
		super(nombrel, edad, estado, fechanacimiento);
	}

}
