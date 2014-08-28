/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package player;

import java.awt.*;
import java.awt.Component;
import java.awt.geom.Ellipse2D;
import object.Placed;
import operation.Operation;
import type.Enviroment;
import type.Physical;
import utils.EachPhysicalInterface;

/**
 *
 * @author Kryštof
 */
public class Panel extends Component{
    protected Enviroment enviroment;
    public final int BALL_SIZE = 20;
    public Panel(Enviroment e){
        super();
        this.enviroment = e;
        super.setSize(this.enviroment.getDimension());
    }
    private Shape circle(double x, double y, double r){
        return new Ellipse2D.Double(x,y,r,r);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        enviroment.forEach(new EachPhysicalInterface(){

            @Override
            public void EachElement(Physical p) {
            if (p instanceof Operation){
                ((Operation)p).refresh();                
            } }
        });     
        
        enviroment.forEach(new EachPhysicalInterface(){

            @Override
            public void EachElement(Physical p) {
            if (p instanceof Placed){
                Placed pl = (Placed)p;
                g.setColor(Color.RED);
                
                g.fillOval((int)(pl.getX())-BALL_SIZE/2, (int)(pl.getY())-BALL_SIZE/2, BALL_SIZE, BALL_SIZE);
            } }
        });         
        
    }
    
    
}
