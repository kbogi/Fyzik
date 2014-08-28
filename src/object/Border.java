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
public class Border extends Thing{
    double x1,x2,y1,y2;
    public Border(String id, double x1, double y1, double x2, double y2) {
        super(id);
        this.x1 = x1;
    }
    
}
