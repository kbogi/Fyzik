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
public class Turned extends Placed{
    protected double angle;

    public Turned(String id, double x, double y, double angle) {
        super(id, x, y);
        this.angle = angle;
    }

    public Turned(String id, double x, double y) {
        super(id, x, y);
        this.angle = 0;
    }

    public Turned(String id) {
        super(id);
        this.angle = 0;
    }

    public Turned(String id, double angle) {
        super(id);
        this.angle = angle;
    }

    public double getR() {
        return angle;
    }

    public void setR(double r) {
        this.angle = r;
    }
    
}
