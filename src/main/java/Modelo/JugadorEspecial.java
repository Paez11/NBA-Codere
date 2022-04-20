package Modelo;

public class JugadorEspecial extends Jugador {

    private int esquive;
    private int DefensaEspecial;
    private int TiroEspecial;

    public JugadorEspecial(String nombre, int defensa, int tiro, int ritmo, int pase, int faltas,
                           int altura, int esquive, int defensaEspecial, int tiroEspecial) {
        super(nombre, defensa, tiro, ritmo, pase, faltas, altura);
        this.esquive = esquive;
        DefensaEspecial = defensaEspecial;
        TiroEspecial = tiroEspecial;
    }

    public JugadorEspecial() {

    }

    public int getEsquive() {
        return esquive;
    }

    public void setEsquive(int esquive) {
        this.esquive = esquive;
    }

    public int getDefensaEspecial() {
        return DefensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        DefensaEspecial = defensaEspecial;
    }

    public int getTiroEspecial() {
        return TiroEspecial;
    }

    public void setTiroEspecial(int tiroEspecial) {
        TiroEspecial = tiroEspecial;
    }

}
