/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.Color;

/**
 *
 * @author Ignacio
 */
public class Opciones {
    //Constantes
    private final int NUM_PARTIDAS_DEF      = 10;
    private final Color COLOR_JUGADOR_DEF   = Color.decode("0X3F87E9");
    private final Color COLOR_ORDENADOR_DEF = Color.decode("0XFF4444");
    private final String NOM_JUGADOR        = "Jugador";
    public  final String NOM_OPONENTE       = "Ordenador";
    

    //Atributos
    private String nombre       = NOM_JUGADOR;
    private int    numPartidas  = NUM_PARTIDAS_DEF;
    private Color  colorJugador = COLOR_JUGADOR_DEF;
    private Color  colorPC      = COLOR_ORDENADOR_DEF;
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numPartidas
     */
    public int getNumPartidas() {
        return numPartidas;
    }

    /**
     * @param numPartidas the numPartidas to set
     */
    public void setNumPartidas(int numPartidas) {
        this.numPartidas = numPartidas;
    }

    /**
     * @return the colorJugador
     */
    public Color getColorJugador() {
        return colorJugador;
    }

    /**
     * @param colorJugador the colorJugador to set
     */
    public void setColorJugador(Color colorJugador) {
        this.colorJugador = colorJugador;
    }

    /**
     * @return the colorPC
     */
    public Color getColorPC() {
        return colorPC;
    }

    /**
     * @param colorPC the colorPC to set
     */
    public void setColorPC(Color colorPC) {
        this.colorPC = colorPC;
    }
}
