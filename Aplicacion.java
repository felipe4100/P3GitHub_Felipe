package Git;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionCase;

		do {
			mostrarMenu();
			opcionCase = sc.nextInt();

			switch (opcionCase) {
			case 1:
				opcionPrimos(sc);
				break;
			case 2:
				opcionCuentaAtras(sc);
				break;
			case 3:
				opcionSuma(sc);
				break;
			case 0:
				System.out.println("Hasta la proxima :)");
				break;
			default:
				System.out.println("La opcion no es valida intenta de nuevo anda");
			}
		} while (opcionCase != 0);
	}

	public static void mostrarMenu() {
		System.out.println("1-PRIMOS");
		System.out.println("2-CUENTA ATRAS");
		System.out.println("3-SUMA");
		System.out.println("0-Salir");
		System.out.print("Seleccione una opción: ");
	}

	public static void opcionPrimos(Scanner scanner) {
		System.out.print("Pon un numero: ");
		int n = scanner.nextInt();
		int contador = 0;
		int num = 2;

		while (contador < n) {
			if (esPrimo(num)) {
				System.out.println(num);
				contador++;
			}
			num++;
		}
	}

	public static boolean esPrimo(int num) {
		if (num <= 1) return false;
		for (int i = 2; i <= num / 2; i++) {  	   //verificar numeros primos
			if (num % i == 0) return false;
		}
		return true;
	}

	public static void opcionCuentaAtras(Scanner scanner) {
		System.out.println("Selecciona el tipo de cuenta atras que quieres:");
		System.out.println("1-Un parametro entero");
		System.out.println("2-Dos parametros enteros");
		System.out.println("3-Un parametro float");
		int tipo = scanner.nextInt();

		switch (tipo) {
		case 1:
			System.out.print("Pon un numero entero: ");
			int n = scanner.nextInt();
			cuentaAtras(n);
			break;
		case 2:
			System.out.print("Ingrese el primer numero entero: ");
			int primerNum = scanner.nextInt();
			System.out.print("Ingrese el segundo numero entero: ");
			int segundoNum = scanner.nextInt();
			cuentaAtras(primerNum, segundoNum);
			break;
		case 3:
			System.out.print("Ingrese un numero float: ");
			float numFloat = scanner.nextFloat();
			cuentaAtras(numFloat);
			break;
		default:
			System.out.println("PON UN NUMERO QUE VALGA!!!");
		}
	}

	public static void cuentaAtras(int n) {
		for (int i = n; i >= 0; i--) {            	// sobrecarga de metodos para cuenta atrás
			System.out.println(i);
		}
	}

	public static void cuentaAtras(int x, int y) {
		if (x > y) {
			for (int i = x; i >= y; i--) {
				System.out.println(i);
			}
		} else {
			for (int i = y; i >= x; i--) {
				System.out.println(i);
			}
		}
	}

	public static void cuentaAtras(float f) {
		for (float i = f; i >= 0.0; i -= 0.1) {
			System.out.printf("%.1f\n", i);
		}
	}

	public static void opcionSuma(Scanner scanner) {
		System.out.print("Ingresa un numero mayor a 0: ");
		int numSuma = scanner.nextInt();

		if (numSuma > 0) {
			System.out.print("1");
			sumaRecursiva(numSuma, 2, 1);
		} else {
			System.out.println("El numero debe ser mayor a 0, prueba otra vez");
		}
	}
	public static void sumaRecursiva(int x, int actual, int suma) {
		if (actual > x) {
			System.out.println(" = " + suma);                              
		} else {                                                         //metodo para sumar numeros desde 1 hasta N e imprimirlo
			System.out.print(" + " + actual);
			sumaRecursiva(x, actual + 1, suma + actual);
		}
	
		
	}

}
