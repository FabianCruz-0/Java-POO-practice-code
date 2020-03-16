package HerenciaEncapsu;

public class funciones3 extends funciones2
{
	double O;
	public static void main(String[] args)
	{
		funciones3 fun3 = new funciones3();
		fun3.leerVariables();
		fun3.calcularP();
		fun3.calcularW();
		fun3.calcularM();
		fun3.calcularO();
	}
	
	protected void calcularM()
	{
		System.out.println("El valor de M es igual a: "+(3*N*(Math.pow(Z,2))/Math.pow(W, 3)));
	}
	protected void calcularO()
	{
		O = ((2*S)/3*Y);
		System.out.println("El valor de O es igual a: "+ O);
	}
}
