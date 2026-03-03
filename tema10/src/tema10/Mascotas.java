package tema10;

public abstract class Mascotas {
	private String nombrel;
	private int edad;
	private String estado;
	private String fechanacimiento;
	public Mascotas(String nombrel, int edad, String estado, String fechanacimiento) {
		this.nombrel = nombrel;
		this.edad = edad;
		this.estado = estado;
		this.fechanacimiento = fechanacimiento;
	}
	@Override
	public String toString() {
		return "Mascotas [nombrel=" + nombrel + ", edad=" + edad + ", estado=" + estado + ", fechanacimiento="
				+ fechanacimiento + "]";
	}
	public String getNombrel() {
		return nombrel;
	}
	public void setNombrel(String nombrel) {
		this.nombrel = nombrel;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
}
