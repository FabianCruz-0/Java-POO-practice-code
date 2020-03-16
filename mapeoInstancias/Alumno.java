package mapeoInstancias;

public class Alumno {
	int mat_alu;
	String nom_alu;
	float prom_alu;
	
	public Alumno() {}
	public Alumno(int mat_alu, String nom_alu, float prom_alu)
	{
		this.mat_alu = mat_alu;
		this.nom_alu = nom_alu;
		this.prom_alu = prom_alu;
	}
	
	@Override
	public String toString() {
		return mat_alu+"\t\t" + nom_alu+"\t\t" + prom_alu;
	}
}
