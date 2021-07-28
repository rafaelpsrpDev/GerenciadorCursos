package br.com.course.alura.java;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}	
	
	public String toString() {
		return "Aula de " + this.titulo + " tem " + this.tempo + " min";
	}

	@Override
	public int compareTo(Aula outraAula) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(outraAula.titulo);
	}
}
