package Ahorcado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mensajes {

	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Se imprime: ---- PERSONAJE DE FICCI�N ----
	 */
	public void mensaje_inicial() {
		System.out.println("---- PERSONAJE DE FICCI�N ----");
	}

	/**
	 * M�todo que solicita al jugador una nueva letra con el mensaje: Introduzca una
	 * letra:
	 * 
	 * @return devuelve el car�cter que ha introducido el usuario. En caso de
	 *         introducir m�s de un car�cter, el juego SOLO se quedar� con la
	 *         primera de ellas, despreciando el resto
	 */
	public char pedir_letra() {
		// IMPLEMENTAR
		String palabra;
		char letra = 0;
		System.out.print("Introducza una leta: ");
		try {
			palabra = in.readLine();
			letra = palabra.charAt(0);
			letra = Character.toUpperCase(letra);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return letra;
	}

	/**
	 * Se imprime: ACIERTO!
	 */
	public void acierto() {
		System.out.println("ACIERTO!");
	}

	/**
	 * Se imprime: FALLO!
	 */
	public void fallo() {
		System.out.println("FALLO!");
	}

	/**
	 * Se imprime: GANASTE !!!!!!!
	 */
	public void ganar() {
		System.out.println("GANASTE !!!!!!!");
	}

	/**
	 * Se imprime: PERDISTE !!!!!!!
	 */
	public void perder() {
		System.out.println("PERDISTE !!!!!!!");
	}
}
