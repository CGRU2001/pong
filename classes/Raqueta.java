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
public class Raqueta {
    
    public static final int ANCHO=10, ALTO=25;
    
    private int x, y;
    
    public Raqueta(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }
}
