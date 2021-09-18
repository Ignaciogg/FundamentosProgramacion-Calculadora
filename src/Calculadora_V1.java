import java.util.Scanner;


public class Calculadora_V1 {

	public static void main(String[] args) {
		
		float valor1;
		String operacion;
		float valor2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("PROGRAMA CALCULADORA \n Para empezar, introduce un valor por consola: ");
		valor1 = teclado.nextFloat();
		System.out.print("Ahora, introduce la operación que desee realizar entre las posibles (+,-,*,/,%): ");
		operacion = teclado.next();
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
		
		teclado.close();
	}

}
