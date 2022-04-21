package interfaces;

import java.util.Collection;

public interface IUsuario {
	void AnadirEquipo(Collection e);
	void setDinero(Object d);
	Object getDinero();
	void SistemadeApuestas();
}
