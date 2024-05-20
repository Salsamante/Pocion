package pocion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PocionTest {
	Pocion instance;
	
	@Test
	void testSetIdentificador() {
		Pocion instance=new Pocion(1000);
		
		//caso 1
		instance.setIdentificador(1000);
		assertEquals(1000,instance.getIdentificador());
		
		//caso 2
		instance.setIdentificador(1100);
		assertEquals(1100,instance.getIdentificador());
	}
	


	@Test
	void testSetIngrediente1() {
		fail("Not yet implemented");
	}

}