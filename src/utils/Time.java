/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.util.Date;

/**
 *
 * @author Kryštof
 */
public class Time {
    private Date t;
    public Time(){
        this.t = new Date();
    }
    public Time(long t){
        this.t = new Date(t);
    }

    public long getT() {
        return (new Date().getTime()-t.getTime());
    }
    
}
