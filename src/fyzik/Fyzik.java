/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fyzik;

import enviroment.Bouncy;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import object.Placed;
import operation.Acceleration;
import operation.Gravity;
import operation.Velocity;
import player.Player;
import type.Physical;

/**
 *
 * @author Kryštof
 */
public class Fyzik {

    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Bouncy b = new Bouncy(new Dimension(500,500));
        Physical.setEnviroment(b);
        Placed pl = new Placed("bod", 50,50);
        b.add(pl);
        b.add(new Velocity(pl, 5,-5));
        b.add(new Gravity(pl));
        Player p = new Player(b);
    }
    
}
