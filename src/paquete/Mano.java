/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Ignacio
 */
public class Mano {
    //Constantes
    static final int PIEDRA = 1;
    static final int PAPEL  = 2;
    static final int TIJERA = 3;

    //Variables Dinamicas
    private String nombreJugador = "";
    private int    numJugada     = 0;
    private int    jugadaElegida = 0;
    
    //Variables Estaticas
    private static int numJugadores  = 0;
    
    //Constructor
    Mano(String nombreJugador){
        this.nombreJugador = nombreJugador;
        this.numJugadores++;
    }
    
    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getNumJugada() {
        return numJugada;
    }
    public void setNuevaJugada() {
        this.numJugada++;
    }
    
    public static int getNumJugadores() {
        return numJugadores;
    }

    public int getJugadaElegida() {
        return jugadaElegida;
    }
    public void setPiedra() {
        this.jugadaElegida = PIEDRA;
    }
    public void setPapel() {
        this.jugadaElegida = PAPEL;
    }
    public void setTijera(){
        this.jugadaElegida = TIJERA;
    }
}
