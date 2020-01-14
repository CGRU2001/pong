/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class Table extends JPanel{
    Pelota pelota = new Pelota(0, 0);
    Raqueta izda = new Raqueta(10,200);
    Raqueta drcha = new Raqueta(774, 200);
    public Table(){
        setBackground(Color.BLACK); //Establecemos color de fondo
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);//Pinta G (pelota)
        Graphics2D g2 = (Graphics2D)g; //Hacemos un cast de g para poder usarlo en 2 dimensiones
        g2.setColor(Color.YELLOW); //Damos G2 (Donde guardamos g) un color amarillo
        this.dibujar(g2);//Pinta g2
        actualizar();
    }
    public void dibujar(Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(izda.getRaqueta());
        g.fill(drcha.getRaqueta());
    }
    public void actualizar(){
        this.pelota.mover(getBounds());
        izda.moverR1(getBounds());
        drcha.moverR2(getBounds());
    }
    public void iterarJuego(){
        while(true){
            try {
                this.repaint();
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private boolean colision(Rectangle2D r){
        return pelota.getPelota().intersects(r);
    }
}
