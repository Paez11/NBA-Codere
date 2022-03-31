package testModelo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Usuario usuario1 = new Usuario("nombre1", false, 1);
	
	@Test
	void existe_usuario() {
		try {
			assertEquals("nombre1", usuario1.getName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	void asignar_nombre() {
		try {
			usuario1.setName("nombre2");
			assertEquals("nombre2", usuario1.getName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	void anadir_usuario() {
		assertThrows("Jugador no añadido", usuario1.AnadirUsuario("Jugador1"));
	}
	
	@Test
	void sistema_de_apuestas() {
		assertThrows("Equipo no añadido", usuario1.sistemadeaupestas(equipo1));
	}
}
