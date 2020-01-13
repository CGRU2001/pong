/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JFrame;

/**
 *
 * @author carlos
 */
public class Ventana extends JFrame {
    public static final int ANCHO=800, ALTO=500;
    private Table tablero; //Creamos el tablero
    public Ventana(){

        setTitle("Pong (By Carlos Rodríguez)");
        setSize(ANCHO,ALTO); 
        setLocationRelativeTo(null); //Ubicamos la pantalla en el centro de la pantalla
        setResizable(false); //Impide que modifique el tamaño de la ventana
    }
}
