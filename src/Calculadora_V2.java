import java.util.Scanner;


public class Calculadora_V2 {

	public static void main(String[] args) {
		
		float valor1;
		String operacion;
		float valor2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("PROGRAMA CALCULADORA \n Para empezar, introduce un valor por consola: ");
		valor1 = teclado.nextFloat();
		System.out.print("Ahora, introduce la operación que desee realizar entre las posibles (+,-,*,/,%,S): ");
		operacion = teclado.next();
		
		/*Para que el programa se termine al introducir la S y no nos pida un segundo valor, hacemos una salida if
		e icluimos el resto del programma si no se cumple */
		
		if (operacion.equals("S")){
			System.out.println("Al introducir S se termina el programa");}
		else {
			System.out.print("Para terminar, introduce un segundo valor por consola: ");
			valor2 = teclado.nextFloat();
			
			if (operacion.equals("+")){
				System.out.println("El resultado es: " + (valor1 + valor2));}
			
			if (operacion.equals("-")){
				System.out.println("El resultado es: " + (valor1 - valor2));}
			
			if (operacion.equals("*")){
				System.out.println("El resultado es: " + (valor1 * valor2));}
			
			if (operacion.equals("/")){
				System.out.println("El resultado es: " + (valor1 / valor2));}
			
			if (operacion.equals("%")){
				System.out.println("El resultado es: " + ((valor1 / valor2)*100) + "%");}
		}
		teclado.close();
	}

}
