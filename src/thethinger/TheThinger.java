/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thethinger;

import thethinger.Game.Game;

/**
 *
 * @author daniel
 */
public class TheThinger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        Thread main = new Thread(game);
        
        game.setRunning(true);
        
        main.start();
    }
}
