/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enviroment;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.LinkedList;
import operation.Operation;
import operation.Velocity;
import type.Enviroment;
import type.Physical;
import utils.EachPhysicalInterface;

/**
 *
 * @author Kryštof
 */
public class Bouncy extends Enviroment{
    public Bouncy(Dimension d) {
    super.physicals = new LinkedList<Physical>();
    this.dimension = d;
    }

    public Bouncy(LinkedList<Physical> physicals, Dimension d) {
        this(d);
        this.physicals = physicals;
    }

    @Override
    public LinkedList<Physical> getPhysicals() {
        return physicals;
    }    
    public void add(Physical p){
        physicals.add(p);
    }
    public Physical removeLast(){
        return super.physicals.removeLast();
    }
    @Override
    public void forEach(EachPhysicalInterface epi){
        for(Physical p:super.physicals){
            epi.EachElement(p);
        }
    }

    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public void bounce(Operation o){
        o.reverse();
    }
    public void bounce(Operation o,int side){
        if(side == Velocity.BOTTOM){
            o.reverse(-1,0.75);
        }
        else if(side == Velocity.TOP){
            o.reverse(-1,0.75);
        }
        else if(side == Velocity.LEFT){
            o.reverse(0.75,-1);
        }
        else if(side == Velocity.RIGHT){
            o.reverse(0.75,-1);
        }
    }
       
    
}
