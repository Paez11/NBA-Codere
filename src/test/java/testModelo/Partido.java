package testModelo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestPartido {
	Equipo e1 = new Equipo (Jugadores[]);
	Equipo e2 = new Equipo (Jugadores[]);
	new Equipos e = new Equipos[2];
	new Torneo t = new Torneo(
			new ArrayList <Equipo>(e1,e2));
	
	@Test
	void test_2equipos(){
		
		assertEquals(Equipos.lenght, 2);
	}
	
	
	@Test
	void test_EqualEquipo() {

		assertNotEquals(Equipo[0], Equipo[1]);
		
	}
	void test_TiempoPartido() {
		assertArrayEquals(ArrayList<Equipo>(e1), ArrayList<Equipo>(e1,e2));
		
	}
	
	
	
}
