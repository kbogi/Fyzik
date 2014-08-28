/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package player;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import type.Enviroment;

/**
 *
 * @author Kryštof
 */
public class Player {
    Component c;

    public Player(Enviroment e) throws InterruptedException {
        Frame f = new JFrame();
        c = new Panel(e);
        f.add(c);
        f.addWindowListener(new WindowAdapter(){
            
    
        @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        f.setSize(c.getSize());
        f.setVisible(true);
        while(true){
            f.repaint();
            f.revalidate();
            Thread.sleep(100);
        }
    }
    public void show(){
        
    }
    
}
