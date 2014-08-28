/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package type;

import java.awt.Dimension;
import java.util.LinkedList;
import operation.Operation;
import utils.EachPhysicalInterface;

/**
 *
 * @author Kryštof
 */
public abstract class Enviroment {
    protected Dimension dimension;
    protected LinkedList<Physical> physicals;
    public abstract LinkedList<Physical> getPhysicals();
    public void forEach(EachPhysicalInterface epi){
        for(Physical p: physicals){
            epi.EachElement(p);
        }
    }
    public Dimension getDimension(){
        return this.dimension;
    }
    public abstract void bounce(Operation o);
    public abstract void bounce(Operation o,int side);
}
