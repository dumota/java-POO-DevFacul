package com.alfa;

public class Personagem {
	private String nome;
	private ClassePersonagem classe;
	private int passos;

	public Personagem(String nome, ClassePersonagem classe, int passos) {
		this.nome = nome;
		this.classe = classe;
		this.passos = passos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPassos() {
		return passos;
	}
	
	public String golpeComum() {
		return "Golpe normal";
	}
	
	public String golpeEspecial() {
		return classe.getEspecial().soltarESpecial();
	}	
}
