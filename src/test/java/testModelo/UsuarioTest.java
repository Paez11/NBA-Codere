package testModelo;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import Modelo.Usuario;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Usuario usuario1 = new Usuario("nombre1", null, null);
	
	@Test
	void existe_usuario() {
		try {
			assertEquals("nombre1", usuario1.getNombre());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	void asignar_nombre() {
		try {
			usuario1.setNombre("nombre2");
			assertEquals("nombre2", usuario1.getNombre());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*
	@Test
	void anadir_usuario() {
		assertThrows("Jugador no a�adido", usuario1.AnadirUsuario("Jugador1"));
	}
	
	@Test
	void sistema_de_apuestas() {
		assertThrows("Equipo no a�adido", usuario1.sistemadeaupestas(equipo1));
	}
	*/
}
