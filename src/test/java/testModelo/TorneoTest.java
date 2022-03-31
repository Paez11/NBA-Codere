package testModelo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TorneoTest {
    @Test
    void PruebaCrearTorneo(){
        Equipo A= new Equipo();
        Equipo B= new Equipo();
        Equipo C= new Equipo();
        Equipo D= new Equipo();
        Equipo E= new Equipo();
        Equipo F= new Equipo();
        ArrayList<Equipo> primero= new ArrayList<Equipo>();
        primero.add(A);
        primero.add(B);
        primero.add(C);
        primero.add(D);
        primero.add(E);
        primero.add(F);
        Torneo prueba = new Torneo(primero);
        assertEquals(12,prueba.getEquipos);
    }
    
    @Test
    void PruebaGanador(){
        Equipo ganador= new Equipo();
        Equipo perdedor= new Equipo();
        ArrayList<Equipo> primero= new ArrayList<Equipo>();
        primero.add(ganador);
        primero.add(perdedor);
        Equipo gana=primero.JugarPartido;
        assertEquals(ganador,gana);
    }
}