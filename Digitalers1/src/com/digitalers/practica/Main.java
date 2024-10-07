package com.digitalers.practica;

public class Main {

	public static void main(String[] args) {
		
		//###################### CLASE 1 ########################
		
		
		// Variables PRIMITIVAS Java:
		
		boolean verdadero = true; // 1 byte || valor: true or false
		char caracter = '@';	 //  2 byte || compuesto de código ASCII   (va en comillas simple)
		byte megabyte = 127;	//   1 byte || valor entero: -128 a 127
		short corto = -32768;   //   2 byte || valor entero: -32768 a 32767
		int entero = 2147483647; //  4 byte || valor entero: -2147483648 a 2147483647
		long largo = 9223372036854775807l;  //  8 byte || valor entero: -9223372036854775808 a 9223372036854775807
		float flotante = 1.40156476757298f;          //  4 byte || valor entre 6 y 7 cifras decimales equivalentes 
		double doble = 17.97697675764598980313486232308;          //  8 byte || 15 cifras decimales equivalentes
		
			//	Declaracion Constante
		
		final String palConst= "gay el q leé";
		
		// Operador Logico
		
		boolean chupapi = true;
		boolean gay = false;
		
		// Declaracion de Variable
		String palabra = "Hola Mundo";
		
		// Impresion de Variable
		System.out.println(palabra);
		
		
		
		
		
		// ######################################################################################################
		/*
		 *   Los OPERADORES son una expresion q producen otro valor 
		 */
		
		// ################ OPERADORES ARITMETICOS ########################
		
		//    Suma: +  Resta: -  Multiplicacion: *   Division:  /    Resto de la Division: %
		  
		byte num1 = 5;
		byte num2 = 7;
		
		int suma = num1 + num2;
		
		int resta = num1 - num2;
		
		int multip = num1 * num2;
		
		int div = num1 / num2;
		
		int restD = num1 % num2;
		
		
		// ##########OPERADOR CONCATENADOR###################
		
		System.out.println("Resultado de la suma: "+ suma);
		
		//########################## PRESEDENCIA DE PARENTESIS Y USO DEL PARENTESIS ######################
		
		// java resuelve los problemas matematicos de derecha a izquierda e inicia x la multiplicacion/division  
		//para dar prioridad a otra parte del problema se debe usar parentesis
		   
		//   PROBLEMA ARITMETICO EJEMPLO:
		int prueb1 = 3 + 7 * 8; 
		int prueb2 = (3 + 7) * 8;
		
		
		   //############## OPERADORES DE ASIGNACION###############	
		
			 /*
			  *   =      +=      -=          *=         /=     %=
			  */
		
			byte n = 10;
			System.out.println(n);
			n += 15;
			System.out.println(n);
			n -= 5;
			System.out.println(n);
			n /= 4;
			System.out.println(n);
		
			
			//################# OPERADOR DE DECREMENTO E INCREMENTO #######################
			
			
			//      Incremento: ++        Decremento: --
			
			// aumenta/disminuye el valor de la varible de 1 en 2 segun el operador empleado
			 
			// Incremento
			byte aum = 5;
			aum ++;
			System.out.println(aum);
			// Decremento
			byte dec = 10;
			dec--;
			System.out.println(dec);
			
			
			// OPERADOREES RELACIONALES
			
			// sirven para comparar valores numericos y el resultado siempre  da un valor booleano
			
			//      Mayor: >   |  Mayor o Igual: >=  |   Menor : <   |   Menor o Igual: <=   |   Igual a Igual: ==   |    Diferente: !=
			
			
			// Ejemplo
			byte op1 = 10;
			byte op2 = 45;
			boolean compar;
			
			compar = op1 > op2;
			
			if (compar == true) {
				System.out.println("es mayor");
			}else {
				System.out.println("es menor");
			}
			
			
			// ########################### OPERADORES LOGICOS y ######################
			
			
			
			
			
		
		
		
		
	}

}
