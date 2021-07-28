/**
 * 
 */
package br.com.course.alura.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Rafael Paulo
 *
 */
public class TestaListaAulas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Aula a1 = new Aula("Biologia", 50);
		Aula a2 = new Aula("Português", 140);
		Aula a3 = new Aula("Matemática", 70);
		Aula a4 = new Aula("História", 12);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);

		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
