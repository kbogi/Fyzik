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
public class Weighted extends Turned{
    protected double m;

    public Weighted(double m, String id, double x, double y, double r) {
        super(id, x, y, r);
        this.m = m;
    }

    public Weighted(double m, String id, double x, double y) {
        super(id, x, y);
        this.m = m;
    }

    public Weighted(double m, String id) {
        super(id);
        this.m = m;
    }

    public Weighted(String id, double x, double y, double r) {
        super(id, x, y, r);
        this.m = 0;
    }

    public Weighted(String id, double x, double y) {
        super(id, x, y);
        this.m = 0;
    }

    public Weighted(String id) {
        super(id);
        this.m = 0;
    }
    
}
