package org.form.TestVrai;

public class Mojito {

	private int menthe;
	private int sucre;

	public int getMenthe() {
		return menthe;
	}

	public void setMenthe(int menthe) {
		this.menthe = menthe;
	}

	public int getSucre() {
		return sucre;
	}

	public void setSucre(int sucre) {
		this.sucre = sucre;
	}

	public Mojito(int menthe, int sucre) {
		super();
		this.menthe = menthe;
		this.sucre = sucre;
	}

	public Mojito() {
		super();
	}
	
	
	public int recette(int sucre, int menthe){
		int cocktail = sucre + menthe;
		return cocktail;
	}

}
