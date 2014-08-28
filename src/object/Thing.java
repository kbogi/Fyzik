/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object;

import type.Physical;

/**
 *
 * @author Kryštof
 */
public abstract class Thing extends Physical{

    public Thing(String id) {
        super(id);
    }
    
}
