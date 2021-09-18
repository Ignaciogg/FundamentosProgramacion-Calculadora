import java.util.Scanner;

public class Calculadora_V3 {

	public static void main(String[] args) {

		/*Para este ejercicio, he buscado cómo poder introducir cualquier carácter en los valores numerales (string)
		 para así poder ver si se introduce por consola una S para terminar el programa       */

		String valor1;
		String operacion;
		String valor2;
		Scanner teclado = new Scanner(System.in);

		System.out.print("PROGRAMA CALCULADORA \n Para empezar, introduce un valor por consola: ");
		valor1 = teclado.next();

		//Ahora, utilizaré tres ifs con sus respectivos else para ver en cada entrada por consola si se introduce una S

		if (valor1.equals("S")){
			System.out.print("Al introducir S se termina el programa");}

		else{
			System.out.print("Ahora, introduce la operación que desee realizar entre las posibles (+,-,*,/,%,S): ");
			operacion = teclado.next();

				if (operacion.equals("S")){
					System.out.println("Al introducir S se termina el programa");}

				else {
					System.out.print("Para terminar, introduce un segundo valor por consola: ");
					valor2 = teclado.next();

					if (valor2.equals("S")){
						System.out.println("Al introducir S se termina el programa");}

					else{
						//Para acceder las operaciones, necesitaré transformar los valores de String a Float

						float valornum1 = Float.parseFloat(valor1);
						float valornum2 = Float.parseFloat(valor2);

						if (operacion.equals("+")){
							System.out.println("El resultado es: " + (valornum1 + valornum2));}

						if (operacion.equals("-")){
							System.out.println("El resultado es: " + (valornum1 - valornum2));}

						if (operacion.equals("*")){
							System.out.println("El resultado es: " + (valornum1 * valornum2));}

						if (operacion.equals("/")){
							System.out.println("El resultado es: " + (valornum1 / valornum2));}

						if (operacion.equals("%")){
							System.out.println("El resultado es: " + ((valornum1 / valornum2)*100) + "%");}
					}
				}
			}
		teclado.close();
		}
	}