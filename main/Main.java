/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true); //Decimos que la ventana sea visible
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Decimos que se cierre el programa completo al pulsar la X
    }
}
