package Refactorizar;
import java.util.Scanner;

public class CodigoRefactorizado {
	public static void CargarNumeros(int num[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Ingrese un numero: ");
			num[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void MostarNumeros(int num[]) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Numero " + (i + 1) + ":" + num[i]);
		}
	}
	
	//Creo un metodo que me devuelva el numero mayor
	public static int BuscarMayor(int num[]) {
		int MAYOR;
		MAYOR = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > MAYOR) 
			{
				MAYOR = num[i];
			}
		}
		return MAYOR;
	}
	
	//Creo un metodo que me devuelva el numero menor
	public int BuscarMenor(int num[]) {
		int MENOR;
		MENOR = num[0];
		
		for (int i = 0; i < num.length; i++){
			if (num[i] < MENOR) 
			{
				MENOR = num[i];
			}
		}
		return MENOR;
	}
	
	//Creo un metodo para que sume todos los numeros positivos
	public static int SumarPositivos(int num[]) {
		int sumaPositivos = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]>= 0) 
			{
				sumaPositivos += num[i];		
			}
		}
			return sumaPositivos;
	}
	
	//Creo un metodo para que sume todos los numeros negativos
		public static int SumarNegativos(int num[]) {
			int sumaNegativos = 0;
			
			for (int i = 0; i < num.length; i++) {
				if (num[i] <= 0) 
				{
					sumaNegativos += num[i];		
				}
			}
			return sumaNegativos;
		}
		
		//Creo un metodo que devuelva la media
		public static double Promedio(int num[]) {
			double promedio = 0.0;
			for (int i = 0; i < num.length; i++) {
				promedio = promedio + num[i];
			}
			promedio = promedio / num.length;
			return promedio;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros a procesar: ");
		int tamano = sc.nextInt();
		int[] num = new int [tamano];
		CargarNumeros(num);
		int sumaTodos = SumarPositivos(num) + SumarNegativos(num);
		System.out.println("Mayor numero:" + BuscarMayor(num));
		System.out.println("Menor numero:" + BuscarMayor(num));
		System.out.println("Suma total:" + sumaTodos);
		System.out.println("Suma de los números positivos: " + SumarPositivos(num));
		System.out.println("Suma de los números negativos: " + SumarNegativos(num));
		System.out.println("La media es: " + Promedio(num));
		sc.close();
		}
}
