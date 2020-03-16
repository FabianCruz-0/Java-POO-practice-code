package mapeoInstancias;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class salonPOO {
	
	//Alumno[] lista;
	ArrayList<Alumno> lista = new ArrayList<Alumno>();
	
	public static void main(String[] args) {
		salonPOO poo = new salonPOO();
		poo.leerAlumnos();
		poo.menu();
	}
	
	//Método para introducir alumnos a la tabla (ArrayList).
	private void leerAlumnos()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de alumnos: ");
		int n = Integer.parseInt(sc.nextLine());
		/*lista = new Alumno[n];
		Los ArrayList no necesitan especificar el tamaño, a diferencia de los arrays Normales. */
		for(int i = 0; i<n;i++)
		{
			System.out.print("Matricula: ");
			int mat = Integer.parseInt(sc.nextLine());
			System.out.print("Nombre: ");
			String nom = sc.nextLine();
			System.out.print("Promedio: ");
			float prom = Float.parseFloat(sc.nextLine());
			Alumno al = new Alumno(mat, nom, prom);
			lista.add(al);
		}
	}
	
	//Método para imprimir los alumnos junto con su info.
	private void imprimirAlumnos()
	{
		System.out.println("\n");
		System.out.println("Matricula\t\tNombre\t\tPromedio");
		
		//--------------------------------------------- SYNTAXIS RECORRIDO DE UN ARRAYLIST --------------------------------------------------//
		Iterator<Alumno> num_Alum = lista.iterator();
		while(num_Alum.hasNext())
		{
			Alumno alumno = num_Alum.next();
			System.out.println(alumno.toString()); 
			
			/*
			OTRA ALTERNATIVA, EL IMPRIMIR "alumno" LLAMA DIRÉCTAMENTE AL MÉTODO ToString()   
			System.out.println(alumno);
			*/
		}
		this.menu();
	}
	
	//Método que despliega un menú en consola.
	private void menu()
	{
		System.out.println("\n");
		int decision = 0;
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<25; i++){System.out.print("*");}
		
		System.out.println("\n*  ¿Qué desea hacer?\t*");
		System.out.println("* 1.- Imprimir Alumnos. *");
		System.out.println("* 2.- Borrar Alumno.\t*");
		System.out.println("* 3.- Editar Alumno.\t*");
		System.out.println("* 4.- Salir.\t\t*");
		for(int i =0; i<25; i++){System.out.print("*");}
		decision = Integer.parseInt(sc.nextLine());
		if(decision <= 0 || decision >4)
		{
			System.out.println("Introducir un valor válido.");
			menu();
		}
		switch(decision)
		{
		case 1:
			this.imprimirAlumnos();
			break;
		case 2:
			this.borrarAlumno();
			break;
		case 3:
			this.editarAlumno();
			break;
		}
	}
	
	//Método para borrar a un alumno
	private void borrarAlumno()
	{
		Scanner sc = new Scanner(System.in);
		Iterator<Alumno> num_Alum = lista.iterator();
		
		System.out.println("Introducir la matrícula del alumno que será borrado: ");
		int aBorrar = Integer.parseInt(sc.nextLine());
		while(num_Alum.hasNext())
		{
			Alumno alumno = num_Alum.next();
			if(aBorrar == alumno.mat_alu)
			{
				lista.remove(alumno.mat_alu-1);
				this.menu();
				break;
			}			
		}
	}
	
	//Método para editar un alumno 
	private void editarAlumno()
	{
		Scanner sc = new Scanner(System.in);
		Iterator<Alumno> num_Alum = lista.iterator();
		
		System.out.println("Introducir la matrícula del alumno que será editado: ");
		int aEditar = Integer.parseInt(sc.nextLine());
		while(num_Alum.hasNext())
		{
			Alumno alumno = num_Alum.next();
			if(aEditar == alumno.mat_alu)
			{
				System.out.println("Introducir nuevamente los datos del alumno a editar: ");
				System.out.print("Matricula: ");
				int mat = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre: ");
				String nom = sc.nextLine();
				System.out.print("Promedio: ");
				float prom = Float.parseFloat(sc.nextLine());
				Alumno al = new Alumno(mat, nom, prom);
				lista.set(alumno.mat_alu-1, al);
				this.menu();
				break;
			}
		}
	}
}
