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
import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class Table extends JPanel{
    public Table(){
        setBackground(Color.BLACK); //Establecemos color de fondo
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);//Pinta G (pelota)
        Graphics2D g2 = (Graphics2D)g; //Hacemos un cast de g para poder usarlo en 2 dimensiones
        g2.setColor(Color.YELLOW); //Damos G2 (Donde guardamos g) un color amarillo
        g2.fill(new Rectangle2D.Double(0,0,20,20));//Posicion 0 y tamaño 20
        
        
    }
}
