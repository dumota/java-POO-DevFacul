package com.alfa;

public enum ClassePersonagem {
	arqueiro(new EspecialArqueiro()), mago(new EspecialMago()), guerreiro(new EspecialGuerreiro());
	
	private  Especial especial;
	
	private ClassePersonagem(Especial especial) {
		this.especial = especial;
	}
	
	public Especial getEspecial() {
		return especial;
	}
}
