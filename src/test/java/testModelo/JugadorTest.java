package testModelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	//static Jugador jugador = new jugador("prueba","50","50","50","50","50","50");
	
	@Test
	void testTiraCanasta(int tiro) {
		boolean result=false;
		if(tiro>0) {
			assertEquals(result, true);
		}
	}
	
	
	@Test
	void testPasarBalon(int pase) {
		boolean result=false;
		if(pase>0) {
			assertEquals(result, true);
		}
	}
	
	@Test
	void testFalta(int probabilidad) {
		boolean result=false;
		if(probabilidad>60) {
			assertEquals(result, true);
		}
	}
	
	@Test
	void testDefender(int ataque, int defensa) {
		boolean result=false;
		if(defensa>ataque) {
			assertEquals(result, true);
		}
	}
	

}
