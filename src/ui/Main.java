package ui;
import model.*;
import java.util.Scanner;

public class Main{
		
	public static int[] getData(Scanner sc){
		
		int[] numeros = new int [2];
		System.out.println("Ingrese el primer numero");
		numeros[0]=sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		numeros[1]=sc.nextInt();
		sc.nextLine();
		return numeros;
	}
	public static void mostrarDatos(Scanner sc){
	int numeros[] = getData(sc);
		System.out.println("La suma de los numeros es "+Calculadora.Adition(numeros[0],numeros[1]));
		System.out.println("La resta de los numeros es "+Calculadora.Rest(numeros[0],numeros[1]));
		System.out.println("La Multiplicacion de los numeros es "+Calculadora.Multiplication(numeros[0],numeros[1]));
		System.out.println("La Division de los numeros es "+Calculadora.Division(numeros[0],numeros[1]));
	}
	
	
	
	public static void main (String[]args){ 
	Scanner sc = new Scanner (System.in);
		mostrarDatos(sc);
		
	
	}
}