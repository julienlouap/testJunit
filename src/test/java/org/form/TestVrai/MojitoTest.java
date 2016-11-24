package org.form.TestVrai;

import static org.junit.Assert.*;

import org.junit.Test;

public class MojitoTest {

	Mojito m = new Mojito();

	int menthe = 2;
	int sucre = 3;

	int cocktail = m.recette(sucre, menthe);

	@Test
	public void test() {
		assertTrue(cocktail == menthe + sucre);

	}

}
