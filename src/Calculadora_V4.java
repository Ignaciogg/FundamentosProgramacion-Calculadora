import java.util.Scanner;


public class Calculadora_V4 {

	public static void main(String[] args) {
		
		/*En este ejercicio me parece que lo más lógico es elegir primero con cuantos valores
		 vamos a querer trabajar, y esto fácilmente se puede hacer con un if y un else       */
		
		String eleccion;
		String valor1;
		String operacion;
		String valor2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("PROGRAMA CALCULADORA \nPara empezar, introduce '1' si quieres realizar operaciones con un valor o un '2' si quieres con dos valores: ");
		eleccion = teclado.next();
		
		//Operaciones con un solo valor
		
		if (eleccion.equals("1")){
			System.out.print("Has elegido operar un valor.\n Introduce a continuación este valor: ");
			valor1 = teclado.next();
			
			if (valor1.equals("S")){
				System.out.print("Al introducir S se termina el programa");}
				
			else{
				System.out.print("Ahora, introduce la operación que desee realizar entre las posibles (sen,cos,^2,^3): ");
				operacion = teclado.next();
				
				if (operacion.equals("S")){
					System.out.println("Al introducir S se termina el programa");}
				
				else {
					float valornum1 = Float.parseFloat(valor1);
					
					if (operacion.equals("sen")){
						System.out.println("El resultado es: " + Math.sin(valornum1));}
					
					if (operacion.equals("cos")){
						System.out.println("El resultado es: " + Math.cos(valornum1));}
					
					if (operacion.equals("^2")){
						System.out.println("El resultado es: " + (valornum1 * valornum1));}
					
					if (operacion.equals("^3")){
						System.out.println("El resultado es: " + (valornum1 * valornum1 * valornum1));}
				}
				
			}
		}
		
		//Operaciones con dos valores
		
		if (eleccion.equals("2")){
			System.out.print("Has elegido operar con dos valores.\n Introduce a continuación uno de estos: ");
			valor1 = teclado.next();
			
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
							//Otra vez, pasamos los valores de String a Float para operar con ellos
							
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
		}
		
		//Opción por si no se introduce de primeras ni '1' ni '2', para realizar esto de manera relativamente sencilla, transformaré "eleccion" a un valor entero
		int entero = Integer.parseInt(eleccion);
		
		if (entero !=1 && entero !=2){
			System.out.println("No se han introducido valores válidos");
		}
		
		teclado.close();
		}	
	}