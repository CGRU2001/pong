/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author carlos
 */
public class Raqueta {

    public static final int ANCHO = 10, ALTO = 40;

    private int x, y;

    public Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }

    public void moverR1(Rectangle limites) {
        if (Events.w && y > limites.getMinY()) {
            y--;
        }
        if (Events.s && y < limites.getMaxY() - ALTO) {
            y++;
        }
    }

    public void moverR2(Rectangle limites) {
        if (Events.up && y > limites.getMinY()) {
            y--;
        }
        if (Events.down && y < limites.getMaxY() - ALTO) {
            y++;
        }
    }
}
