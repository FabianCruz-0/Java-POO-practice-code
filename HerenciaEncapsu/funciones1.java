package HerenciaEncapsu;

import java.util.Scanner;

public class funciones1 
{
	double Z,Y,N,W,X;
		public static void main(String[] args)
		{
			funciones1 fun = new funciones1();
			fun.leerVariables();
			fun.calcularW();
		}
		protected void leerVariables()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Ingresar el valor de X: ");
			 X = s.nextDouble();		
			System.out.println("Ingresar el valor de Y: ");
			Y = s.nextDouble();	
			calcularZ();
		}
		private void calcularZ()
		{
			Z = 2*X+(3*Math.pow(Y, 2));
			System.out.println("El valor de Z es: "+Z);
		}
		
		protected void calcularW()
		{
			W = 2*Z + 3*Y;
			System.out.println("El valor de W es: "+W);
			calcularN(W);
		}
		private void calcularN(Double W)
		{
			N = ((Z*Y)/W);
			System.out.println("El valor de N es:" +N);
		}
}
