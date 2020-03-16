package InterfazInstancias;

public class Alumno {
	int mat_alu;
	String nom_alu;
	float prom_alu;
	
	public Alumno(int mat_alu, String nom_alu, float prom_alu)
	{
		this.mat_alu = mat_alu;
		this.nom_alu = nom_alu;
		this.prom_alu = prom_alu;
	}
	
	public int getMat_alu() {
		return mat_alu;
	}
	public void setMat_alu(int mat_alu) {
		this.mat_alu = mat_alu;
	}
	public String getNom_alu() {
		return nom_alu;
	}
	public void setNom_alu(String nom_alu) {
		this.nom_alu = nom_alu;
	}
	public float getProm_alu() {
		return prom_alu;
	}
	public void setProm_alu(float prom_alu) {
		this.prom_alu = prom_alu;
	}
	@Override
	public String toString() {
		return mat_alu+"\t\t" + nom_alu+"\t\t" + prom_alu;
	}
}
