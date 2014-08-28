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
public class Gravity extends Acceleration {
    public static final int G = 2;
    private static int id = 0;
    private Velocity v;
    public Gravity(Placed object) {
        super(object, 0, G);
    }
    
}
