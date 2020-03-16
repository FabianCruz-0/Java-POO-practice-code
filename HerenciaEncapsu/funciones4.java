package HerenciaEncapsu;

import java.util.Scanner;

public class funciones4 extends funciones3
{

	public static void main(String[] args)
	{
		funciones4 fun4 = new funciones4();
		fun4.leerVariables();
		fun4.calcularP();
		fun4.calcularW();
		fun4.calcularM();
		fun4.calcularO();
		fun4.calcularR();
		fun4.calcularC();
	}
	private void calcularR()
	{
		System.out.println("El valor de R es igual a: "+((5*W)/2*N*X*Y));
	}
	private void calcularC()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de A: ");
		Double A = sc.nextDouble();
		System.out.println("El valor de C es igual a: "+((Math.pow(A, 2)+Math.pow((X+Y),2)/3*O*S)));
	}

}
