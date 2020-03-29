package pack1_ExMedioCurso;

public class medicina 
{

	protected String nombre;
	protected float gramaje;
	protected float precio;
	protected float cantidad;
	
	@Override
	public String toString() {
		return "medicina [nombre=" + nombre + ", gramaje=" + gramaje + ", precio=" + precio + ", cantidad=" + cantidad
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getGramaje() {
		return gramaje;
	}
	public void setGramaje(float gramaje) {
		this.gramaje = gramaje;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public medicina()
	{}
	public medicina(String nom_med, float gramaje,float precio,float cantidad)
	{
		this.nombre = nom_med;
		this.gramaje = gramaje;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
}
