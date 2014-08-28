/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operation;

import object.Placed;

/**
 *
 * @author Kryštof
 */
public class Acceleration extends Velocity{
    double accelerationX, accelerationY;
    public Acceleration(Placed object, double accelerationX, double accelerationY) {
        super(object, 0, 0);
        this.accelerationX = accelerationX;
        this.accelerationY = accelerationY; 
    }
    @Override
    public Placed calculatePos(){
        super.speedX = super.speedX+accelerationX;
        super.speedY = super.speedY+accelerationY;
        return super.calculatePos();
    }
    
}
