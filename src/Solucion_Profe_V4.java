import java.util.Scanner;

/*
 * Autor:		Javier S�nchez Soriano (5064)
 * Ejercicio:	Actividad Individual: Calculadora V4
 * Fecha: 		23/10/2020
 */
public class Solucion_Profe_V4 {
	public static void main(String[] args) {
		// Variables para los valores (tipos definidos enunciado)
		float valor1=0;
		float valor2=0;
		String operacion= ""; // Se cambia de char a String para soportar nuevas operaciones
		boolean datosCorrectos = false;
		Scanner teclado = new Scanner(System.in); // Para leer consola

		// Solicitar al usuario los datos por consola
		System.out.println("-------- Bienvenido a la Calculadora V4.0 --------");
		System.out.println("            Introduzca s/S para salir\n");

		System.out.print("Introduzca un valor (puede ser ser decimal): ");
		// Realizar las operacioes e informar del resultado
		if (teclado.hasNextFloat()) {
			// Leer el valor 1
			valor1 = teclado.nextFloat();

			// Leer la operaci�n
			System.out.println("Operaciones: +, -, *, /, %, x2, x3, COS, SEN, TAN");
			System.out.print("Introduzca operaci�n: ");


			operacion = teclado.next(); // Podr�a no ser valida
			// Operaciones originales
			if (operacion.equals("+") || operacion.equals("-") || operacion.equals("*") ||
				operacion.equals("/") || operacion.equals("%") ) { //Si la operaci�n es correcta

				// Leer el valor 2
				System.out.print("Introduzca un valor (puede ser ser decimal): ");
				if (teclado.hasNextFloat()) {
					valor2 = teclado.nextFloat();

					// Si he llegado aqu�, es que valor1, valor2 y operaci�n son v�lidos
					datosCorrectos = true;
				}
				else {	// Error valor2
					// NO ES FLOAT: Error valor2, O BIEN SE HA INTRODUCIDO s/S
					String valor = teclado.next();
					if( valor.equals("S") || valor.equals("s")) {
						// JDK primitiva no se puede comparar Strings con ==
						System.out.println("Ha solicitado salir.");
					}
					else {
						System.out.println("ERROR valor 2. Debe introducir un valor decimal.");
					}
				}
			}
			// Operaciones �nico valor (V4): x2, x3, COS, SEN, ACOS
			else if (operacion.equals("x2") || operacion.equals("x3") ||
					operacion.equals("COS") || operacion.equals("SEN") ||
					operacion.equals("TAN") ) {
				// Simplemente indicamos que todo est� bien pero no pedimos valor2
				datosCorrectos = true;
			}
			else if (operacion.equals("s") || operacion.equals("S")) { // HA SOLICITADO SALIR (s)
				System.out.println("Ha solicitado salir.");
			}
			else {	// La operaci�n no es correcta
				System.out.println("ERROR operaci�n incorrecta.");
			}
		}
		else {	// NO ES FLOAT: Error valor1, O BIEN SE HA INTRODUCIDO s/S
			String valor = teclado.next();
			if( valor.equals("S") || valor.equals("s")) {
				// JDK primitiva no se puede comparar Strings con ==
				System.out.println("Ha solicitado salir.");
			}
			else {
				System.out.println("ERROR valor 1. Debe introducir un valor decimal.");
			}
		}

		// Operar (si todo es correcto)
		if (datosCorrectos) { // valor1, valor2 y operaci�n son correctos..
			if (operacion.equals("+")) {
				System.out.println("Resultado: " + (valor1 + valor2));
			}
			else if (operacion.equals("-")) {
				System.out.println("Resultado: " + (valor1 - valor2));
			}
			else if (operacion.equals("*")) {
				System.out.println("Resultado: " + (valor1 * valor2));
			}
			else if (operacion.equals("/")) {
				System.out.println("Resultado: " + (valor1 / valor2));
			}
			else if (operacion.equals("%")) {
				System.out.println("Resultado: " + (valor1 / valor2 * 100) + "%");
			}
			// Empiezan las nuevas con �nico valor
			else if (operacion.equals("x2")) {
				System.out.println("Resultado: " + (valor1*valor1));
			}
			else if (operacion.equals("x3")) {
				System.out.println("Resultado: " + (valor1*valor1*valor1));
			}
			else if (operacion.equals("COS")) {
				Double cos = Math.cos(valor1 * Math.PI / 180);
				System.out.println("Resultado (datos convertidos a radianes): " + cos);
			}
			else if (operacion.equals("SEN")) {
				Double sin = Math.sin(valor1 * Math.PI / 180);
				System.out.println("Resultado (datos convertidos a radianes): " + sin);
			}
			else if (operacion.equals("TAN")) {
				Double tan = Math.tan(valor1 * Math.PI / 180);
				System.out.println("Resultado (datos convertidos a radianes): " + tan);
			}
		}

		System.out.println("\n�Hasta pronto!");
		teclado.close();
	}

}