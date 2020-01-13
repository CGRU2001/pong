/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author carlos
 */
public class Pelota {
    public static final int ANCHO=20,ALTO=20;
    private int posicionx;
    private int posiciony;
    public Pelota(){
        //Constructor por defecto
    }

    public Pelota(int posicionx, int posiciony) {
        this.posicionx = posicionx;
        this.posiciony = posiciony;
    }
    public Rectangle2D getPelota(){
        return new Rectangle2D.Double(posicionx, posiciony, this.ANCHO, this.ALTO );
    }
}
