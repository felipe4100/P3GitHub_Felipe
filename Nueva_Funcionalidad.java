package Git;

import java.util.Scanner;

public class Nueva_Funcionalidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pon una opcion: ");
		System.out.println("1: Cuentas Pares o Impares");
		System.out.println("2: Estadisticas");
		System.out.println("3: Fibonacci");
		System.out.println("4: Salir del programa");
		int x = sc.nextInt();

		switch (x){
		case 1: System.out.println("Pon un numero: ");
		int numnum = sc.nextInt();
		int cifraT = 0;
		int cifraP = 0;
		int cifraI = 0;
		while (numnum !=0) {
			int cifra = numnum % 10;
			if (cifra % 2 == 0) {
				cifraP++;
			} else {
				cifraI++;
			}
			numnum /= 10;
			cifraT++;
		}
		System.out.println("El numero "+ cifraT + " tiene " + cifraT + " cifras " + "y tiene " + cifraP + " Pares"+ " y " + cifraI + " Impares");



		case 2: 
			System.out.println("Introduce una cantidad de numeros: ");
			int cantidadNum = sc.nextInt();
			System.out.print("Introduce el número 1: ");
			int numSolicitado = sc.nextInt();
			int numMax = numSolicitado;
			int numMin = numMax;
			int sumaNum = numMax;

			for (int z = 1; z < cantidadNum; z++) {
				System.out.print("Introduce el número " + (z + 1) + ": ");
				numSolicitado = sc.nextInt();
				if (numSolicitado > numMax ) numMax = numSolicitado;
				if (numSolicitado < numMin) numMin = numSolicitado;
				sumaNum += numSolicitado;
			}	

			double mediaAritmetica =  (double)sumaNum / cantidadNum;


			System.out.println("El número mayor es: " + numMax);
			System.out.println("El número menor es: " + numMin);
			System.out.println("La media aritmetica es: " + mediaAritmetica);

			break;
		case 3: 
			System.out.println("Pon un numero ");
			int numUno = sc.nextInt();
			System.out.println("Pon otro numero: ");
			int numDos = sc.nextInt();
			System.out.println("Introduce la cantidad de numeros que quieres en tu sucesion: ");
			int numSucesion = sc.nextInt();
			System.out.print(numUno + " " + numDos + " "); // Añade los primeros dos números a la sucesión
			for (int i = 2; i < numSucesion; i++) {
				int suma = numUno + numDos;	
				System.out.print( suma + " ");
				numUno = numDos;
				numDos = suma;

			}

			break;

		case 4: System.out.println("Venga hasta luego :) ");
		System.exit(4); 	//termina directamente con la ejecucion

		default: System.out.println("El numero que has escogido no vale, espabila");




		}

	}



		
		
	}


