package HerenciaEncapsu;

import java.util.Scanner;

public class funciones2 extends funciones1
{
	double S;
	public static void main(String[]args)
	{
		System.out.println("clase funcion2: ");
		funciones2 fun2 = new funciones2();
		fun2.leerVariables();
		fun2.calcularP();
		fun2.calcularW();
	}
	public void calcularP()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de L: ");
		Double L = sc.nextDouble();
		Double P = ((3*Z)/L);
		System.out.println("El valor de P es: "+P);
		calcularS(P);
	}
	public void calcularS( Double P)
	{
		S = (Z*Y)/Math.pow(P,2);
		System.out.println("El valor de S es :"+S);
	}
	
}
