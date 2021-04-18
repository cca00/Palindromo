/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author CCA
 */
public class Palindromo {
	/** 
	Metodo que realiza el conteo del total de palindromos de un texto de aproximadamente 500 caracteres
	**/
    static void esPalindromo() {
        Scanner sc = new Scanner(System.in);
		//Se pide el texto a evaluar
        System.out.println("Escribe un texto (maximo: 500 caracteres): ");
        String cadena = sc.nextLine();
        System.out.println("\n");
		//Se inicializan los contadores
        int contadorCaracteres = 1;
        int totalCaracteres = 0;
        for (int i = 0; i < cadena.length(); i++) {
            totalCaracteres = contadorCaracteres++;
        }
		//Condición de un texto de maximo 500 caracteres
        if (totalCaracteres <= 500) {
            String[] vecPalabras = cadena.split(" ");
            int contadorPalindromos = 0;
			//Ciclo for que realiza la 
            for (String vecPalabra : vecPalabras) {
                StringBuffer revesCadena = new StringBuffer(vecPalabra);
                revesCadena.reverse();
				//Se pregunta sí la palabra es un palindromo y se añade al contador
                if (vecPalabra.equalsIgnoreCase(String.valueOf(revesCadena))) {
                    System.out.println(vecPalabra + " Es un palindromo");
                    contadorPalindromos++;
                } else {
                    System.out.println(vecPalabra + " No es palindromo");
                }
            }
			//Se imprime el total de palindromos  encontrados en el texto
            System.out.println("\n Total de palindromos: " + contadorPalindromos);
        } else {
            System.out.println("El texto o palabra ingresado supera el limite de 500 caracteres, por favor intenta de nuevo.");
        }
    }

    public static void main(String[] args) {
		//Se realiza el llamado al metodo que halla el total de palindromos
        esPalindromo();
    }
}
