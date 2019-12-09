package fasf;

import java.util.Scanner;

public class EjerciciosRepaso {
	/**
	 * 
	 * @author Raúl Manauta Jarque
	 * @version 1.0.0
	 * @date 05/12/2019 Contiene el ejercicio 4 de la ficha de repaso
	 */
	public static void ejer4() {
		/**
		 * Introduce un numero y comprobamos unos calculos.
		 * 
		 */
		Scanner leer = new Scanner(System.in);
		int num = 0;

		try {
			num = leer.nextInt();
			if ((num % 2 == 0) && (num > 10) || ((num % 3 == 0) && (num % 2 != 0))) {
				System.out.println("Prueba superada");
			} else {
				System.out.println("Prueba no superada");
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Datos introducidos incorrectamente");
		} catch (Exception e) {
			System.out.println("Error Desconocido");
		}

	}

	public static void ejer5() {
		for (int i = 200; i >= 0; i--) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void ejer6() {
		Scanner leer = new Scanner(System.in);
		double num1 = 0, num2 = 0, opc = 0;
		boolean correcto = true;

		do {
			try {
				leer = new Scanner(System.in);
				correcto = true;
				System.out.println("introduce 2 numeros");
				num1 = leer.nextDouble();
				num2 = leer.nextDouble();

			} catch (java.util.InputMismatchException e) {
				System.out.println("Datos mal introducidos");
				correcto = false;
			} catch (Exception e) {
				System.out.println("Datos mal introducidos");
				correcto = false;
			}
		} while (!correcto);

		do {
			System.out.println("1. Sumar Operandos");
			System.out.println("2. Restar Operandos.");
			System.out.println("3. Multiplicar Operandos.");
			System.out.println("4. Dividir Operandos");
			System.out.println("5. Resto división entera operandos");
			System.out.println("6.Salir");
			opc = leer.nextInt();
		} while (opc != 6);
	}

	public static void ejer7() {
		Scanner leer = new Scanner(System.in);
		int num = 0;
		try {
			num = leer.nextInt();
			if ((num > 10) && (num % 2 != 0)) {
				System.out.println("S1");
			}
			if ((num >= 10 && num <= 20) && (num % 2 == 0)) {
				System.out.println("S2");
			}
			if ((num % 3 == 0) && ((num > 10) && (num % 2 != 0))) {
				System.out.println("S4");
			}
			if (((num > 20) && (num % 7 == 0) || (num > 50))) {
				do {
					num = leer.nextInt();
				} while (num < 0);
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("datos introducidos no correctos");
		} catch (Exception e) {
			System.out.println("datos mal introducidos");
		}

	}

	public static void ejer8() {
		Scanner leer = new Scanner(System.in);
		int num = 0, suma = 0;

		try {
			do {
				suma = suma + leer.nextInt();

			} while (num >= 0);
			System.out.println("La suma total es " + suma);
		} catch (java.util.InputMismatchException e) {
			System.out.println("datos mal introducidos");
		} catch (Exception e) {
			System.out.println("datos mal introducidos");
		}

	}
	
	public static void ejer9() {
		Scanner leer = new Scanner(System.in);
		int mayor = -100, menor = 100, numero;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca número entre -100 y 100:");
			if ((numero = leer.nextInt()) > mayor) {
				mayor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		System.out.println("Mayor: " + mayor + "\nMenor: " + menor);
		
	}
	
	public static void ejer10() {
		Scanner leer = new Scanner(System.in);

		try {
			System.out.println("Introduzca número:");
			int numero = leer.nextInt();
			for (int i = 1; i < 11; i++) {
				System.out.println(i + " x " + numero + " = " + i * numero);
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("datos mal introducidos");
		} catch (Exception e) {
			System.out.println("datos mal introducidos");
		}
		
		
	}
	
	public static void ejer11() {
		Scanner leer = new Scanner(System.in);
		
			
		
	}
	
	public static void ejer12() {
		
	}
	
	
}
