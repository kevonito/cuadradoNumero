package cuadradonumero;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num2= 0;
		
		
		while (num2 >= 0) {
			
			System.out.println("Introduzca un numero positivo para obtener el cuadrado y uno negativo para terminar el proceso");
			
			 num2 = sc.nextInt();
			
			int cuadrado = num2 * num2;
			
			if (num2 >= 0) {
				System.out.println(cuadrado);
				
			}
		}
			System.out.println("Proceso terminado");

	}

}
