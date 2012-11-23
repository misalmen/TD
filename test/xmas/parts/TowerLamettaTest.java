package xmas.parts;

import junit.framework.TestCase;

public class TowerLamettaTest extends TestCase {

	TowerLametta lametta;

	protected void setUp() throws Exception {
		super.setUp();
		 lametta = new TowerLametta(1,2);
	}
		
	public void testGetValue() {
		assertEquals(5, lametta.getRange());
		assertEquals(10, lametta.getDamage());
		assertEquals("L|", lametta.getSymbol());
	}

}