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
		
		aulas.add("Matem�tica");
		aulas.add("Biologia");
		aulas.add("Hist�ria");
		aulas.add("Portugu�s");
		aulas.add("Ingl�s");
		
		Collections.sort(aulas);
		
		if (aulas.isEmpty()) {
			System.out.println("Est� vazio");
		} else {
			aulas.forEach(aula -> {
				System.out.println(aula);
			});
		}

	}

}
