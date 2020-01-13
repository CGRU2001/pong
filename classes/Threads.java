/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author carlos
 */
public class Threads extends Thread{
    Table tablero;
    public Threads(Table tablero){
        this.tablero = tablero;
    }
    @Override
    public void run(){
        while(true){
            this.tablero.repaint();
        }
    }
}

