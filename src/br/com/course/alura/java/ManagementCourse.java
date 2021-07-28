/**
 * 
 */
package br.com.course.alura.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Rafael Paulo
 *
 */
public class ManagementCourse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> aulas = new ArrayList<String>();
		
		aulas.add("Matemática");
		aulas.add("Biologia");
		aulas.add("História");
		aulas.add("Português");
		aulas.add("Inglês");
		
		Collections.sort(aulas);
		
		if (aulas.isEmpty()) {
			System.out.println("Está vazio");
		} else {
			aulas.forEach(aula -> {
				System.out.println(aula);
			});
		}

	}

}
