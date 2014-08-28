/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operation;

import object.Placed;
import type.Physical;
import utils.Time;

/**
 *
 * @author Kryštof
 */
public class Velocity extends Operation{
    public static final int BOTTOM = 0;
    public static final int TOP = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;
    protected Placed object;
    protected double speedX,speedY;
    protected Time begin;
    private static int id = 0;

    public Velocity(Placed object, double speedX, double SpeedY) {
        super("v" + id++);
        this.object = object;
        this.speedX = speedX;
        this.speedY = SpeedY;
        begin = new Time();
    }
    public void setVelocity(double x, double y){
        this.speedX = x;
        this.speedY = y;
    }

    public double getSpeedX() {
        return speedX;
    }

    public double getSpeedY() {
        return speedY;
    }
    
    public Placed calculatePos(){
        object.setX(object.getX()+(this.speedX));
        object.setY(object.getY()+(this.speedY));
        if(object.getX()>Physical.getEnviroment().getDimension().getWidth()){
            Physical.getEnviroment().bounce(this,RIGHT);
            object.setX(Physical.getEnviroment().getDimension().getWidth()-1);
        }
        if(object.getY()>Physical.getEnviroment().getDimension().getHeight()){
            Physical.getEnviroment().bounce(this,BOTTOM);       
            object.setY(Physical.getEnviroment().getDimension().getHeight()-1);
        }
        if(object.getY()<0){
            Physical.getEnviroment().bounce(this,TOP);       
            object.setY(1);
        }
        if(object.getX()<0){
            Physical.getEnviroment().bounce(this,LEFT);
            object.setX(1);
        }
        return this.object;
    }

    @Override
    public void refresh() {
        calculatePos();
    }

    @Override
    public void reverse() {
        reverse(1);
    }

    @Override
    public void reverse(double multiplierX, double multiplierY) {
        this.speedX = -multiplierX*this.speedX;
        this.speedY = -multiplierY*this.speedY;
    }

    @Override
    public void reverse(double multiplier) {
        reverse(multiplier, multiplier);
    }
}
