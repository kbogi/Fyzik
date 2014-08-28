/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operation;

import type.Physical;

/**
 *
 * @author Kryštof
 */
public abstract class Operation extends Physical{

    public Operation(String id) {
        super(id);
    }
    public abstract void refresh();
    public abstract void reverse();
    public abstract void reverse(double multiplier);
    public abstract void reverse(double multiplierX, double MultiplierY);
}
