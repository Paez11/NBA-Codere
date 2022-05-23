package DAO;

import Modelo.Jugador;

import java.util.List;

public class JugadorDao {

    private List<Jugador> jugadores;


    public boolean addJugador(Jugador j){
        boolean result=false;

        if (!this.jugadores.contains(j)){
            jugadores.add(j);
            result=true;
        }

        return result;
    }

    public boolean deleteJugador(String nombre){
        boolean result=false;
        Jugador j = null;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equals(nombre)){
                j=jugadores.get(i);
                jugadores.remove(j);
            }
        }
        return result;
    }

    public boolean editJugador(Jugador j){
        boolean result=false;
        if (j!= null && jugadores.contains(j)){
            j.setNombre();
        }
        return result;
    }

}
