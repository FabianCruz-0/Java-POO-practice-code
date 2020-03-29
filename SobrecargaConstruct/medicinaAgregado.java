package pack1_ExMedioCurso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class medicinaAgregado extends medicina 
{
	@Override
	public String toString() {
		return "medicamento: "+nombre+", gramaje: "+gramaje+"g, cantidad: "+cantidad+", precio: "+precio+"$.";
	}

	public medicinaAgregado() {}
	String via;
	ArrayList<medicinaAgregado> listaMed = new ArrayList<medicinaAgregado>();
	static Scanner sc = new Scanner(System.in);

	public medicinaAgregado(String nom_med, float gramaje,float precio,float cantidad, String via)
	{
		super.nombre = nom_med;
		super.gramaje = gramaje;
		super.precio = precio;
		super.cantidad = cantidad;
		this.via = via;

	}
	
	private void crearLista()
	{
			System.out.println("Introducir el nombre del medicamento: ");
			String nombre = sc.nextLine();
			System.out.println("Introducir el gramaje: ");
			float gramaje = Float.parseFloat(sc.nextLine());
			System.out.println("Introducir el precio: ");
			float precio = Float.parseFloat(sc.nextLine());
			System.out.println("Introducir la cantidad a llevar: ");
			float cantidad = Float.parseFloat(sc.nextLine());
			System.out.println("Introducir la via de administración: ");
			String via =sc.nextLine();
			medicinaAgregado medicamento = new medicinaAgregado(nombre,gramaje,precio,cantidad,via);
			listaMed.add(medicamento);
	}
	
	
	
	private void generarReceta()
	{
		for(medicinaAgregado medicamento : listaMed)
		{
			System.out.println(medicamento.toString());
		}
	}
	
	public static void main(String[] args)
	{
		medicinaAgregado clase1 = new medicinaAgregado();
		System.out.println("Introducir el nombre del paciente:");
		String paciente = sc.nextLine();
		System.out.println("Introducir el nombre del doctor:");
		String doctor = sc.nextLine();
		System.out.println("¿cuántas medicinas va a necesitar?");
		int max = Integer.parseInt(sc.nextLine());
		for(int i=0; i<max;i++)
		{
			clase1.crearLista();
		}
		System.out.println("Paciente: "+paciente);
		System.out.println("Doctor: "+doctor);
		clase1.generarReceta();
	}	
	
	
	
}
