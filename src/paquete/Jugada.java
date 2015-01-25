/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Random;

/**
 *
 * @author Ignacio
 */
public class Jugada {
    //Constantes
    public static final int PIEDRA = 1;
    public static final int PAPEL  = 2;
    public static final int TIJERA = 3;
    public static final int GANA_A = 1;
    public static final int EMPATE = 2;
    public static final int GANA_B = 3;

    //Variables Dinamicas
    private int    numJugada      = 0;
    private String nombreJugadorA = "";
    private int    jugadaA        = 0;
    private int    ganadasA        = 0;
    private String nombreJugadorB = "";
    private int    jugadaB        = 0;
    private int    ganadasB        = 0;
    
    //Variables Estaticas
    //private static int numJugadores  = 0;
    
    //Constructor
    Jugada(String nombreJugadorA, String nombreJugadorB){
        this.nombreJugadorA = nombreJugadorA;
        this.nombreJugadorB = nombreJugadorB;
        this.numJugada = 0;
        this.ganadasA   = 0;
        this.ganadasB   = 0;
    }
    
    public String getNombreJugadorA() {
        return nombreJugadorA;
    }
    public String getNombreJugadorB() {
        return nombreJugadorB;
    }

    public int getNumJugada() {
        return numJugada;
    }
    public void setNuevaJugada() {
        this.numJugada++;
    }

    public void setJugadaA(int jugada){
        
        //Establecemos la Jugada
        switch(jugada){
            case PIEDRA:
                jugadaA = PIEDRA;
                break;
            case PAPEL:
                jugadaA = PAPEL;
                break;
            case TIJERA:
                jugadaA = TIJERA;
                break;
            default:
                System.out.println("Error 'setManoJugadorA': No Existe: " + jugada);
        }
    }
    
    public void setJugadaB(int jugada){
        
        //Establecemos la Jugada
        switch(jugada){
            case PIEDRA:
                jugadaB = PIEDRA;
                break;
            case PAPEL:
                jugadaB = PAPEL;
                break;
            case TIJERA:
                jugadaB = TIJERA;
                break;
            default:
                System.out.println("Error 'setManoJugadorB': No Existe: " + jugada);
        }
    }
    
    public int getGanador(){
        int ganador = 0;
        
        //Establecemos la Jugada
        switch(jugadaA){
            case PIEDRA:
                //Comprobamos quien ha ganado
                switch (jugadaB) {
                    case PIEDRA:
                        ganador = EMPATE;
                        break;
                    case PAPEL:
                        ganador = GANA_B;
                        ganadasB++;
                        break;
                    case TIJERA:
                        ganador = GANA_A;
                        ganadasA++;
                        break;
                }
                break;
            case PAPEL:
                //Comprobamos quien ha ganado
                switch (jugadaB) {
                    case PIEDRA:
                        ganador = GANA_A;
                        ganadasA++;
                        break;
                    case PAPEL:
                        ganador = EMPATE;
                        break;
                    case TIJERA:
                        ganador = GANA_B;
                        ganadasB++;
                        break;
                }
                break;
            case TIJERA:
                //Comprobamos quien ha ganado
                switch (jugadaB) {
                    case PIEDRA:
                        ganador = GANA_B;
                        ganadasB++;
                        break;
                    case PAPEL:
                        ganador = GANA_A;
                        ganadasA++;
                        break;
                    case TIJERA:
                        ganador = EMPATE;
                        break;
                }
                break;
        }
        //Retornamos quien ha ganado
        return ganador;
    }

    /**
     * @return the jugadaA
     */
    public int getJugadaA() {
        return jugadaA;
    }

    /**
     * @return the jugadaB
     */
    public int getJugadaB() {
        return jugadaB;
    }

    /**
     * @return the ganadaA
     */
    public int getGanadasA() {
        return ganadasA;
    }

    /**
     * @return the ganadaB
     */
    public int getGanadasB() {
        return ganadasB;
    }
}
