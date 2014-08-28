/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object;

/**
 *
 * @author Kryštof
 */
public class Placed extends Thing{
    protected double x,y;
    public Placed(String id,  double x, double y) {
        super(id);
        this.x = x;
        this.y = y;
    }

    public Placed(String id) {
        super(id);
        this.x = 0;
        this.y = 0;
    }
    

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
