package com.alfa;

public class Rpg {

	public static void main(String[] args) {

		try {
			Personagem personagem = new Personagem("Saitama", ClassePersonagem.guerreiro, 50);

			System.out.println(personagem.golpeComum());
			System.out.println(personagem.golpeEspecial());

			if (personagem.getPassos() == 50) {
				throw new ArmadilhaException();
			}

		} catch (ArmadilhaException e) {
			System.out.println(e.toString());
		}

	}

}
