/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thethinger.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import thethinger.Animal.Animals.Cat;
import thethinger.Animal.Animals.Cow;
import thethinger.Animal.Animals.Dog;
import thethinger.Animal.Animals.Pig;
import thethinger.Entity.Animal;
import thethinger.Screen.MainApp;

/**
 *
 * @author daniel
 */
public class Game implements Runnable {
    private final MainApp mainApp;
    private final Graphics g;
    private boolean running;
    
    private int x;
    private int y;
    private int xDir;
    private int yDir;
    private int xAm;
    private int yAm; // A  change...
    private int count;
    private Random rand;
    
    private Animal[] animals;
    private int randAn;
    
    public Game() {
        mainApp = new MainApp();
        g = mainApp.getImageGraphics();

        rand = new Random();

        
        animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Cow();        
        
        running = false;
        
        x = 15;
        xDir = 1;
        yDir = 1;
        xAm = 1;
        yAm = 1;
        count = 0;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        while (running) {
            this.doStuff();
            // draw stuff
            
            switch(rand.nextInt(13)) {
                case 0: g.setColor(Color.BLACK); break;
                case 1: g.setColor(Color.BLUE); break;
                case 2: g.setColor(Color.CYAN); break;
                case 3: g.setColor(Color.DARK_GRAY); break;
                case 4: g.setColor(Color.GRAY); break;
                case 5: g.setColor(Color.GREEN); break;
                case 6: g.setColor(Color.LIGHT_GRAY); break;
                case 7: g.setColor(Color.MAGENTA); break;
                case 8: g.setColor(Color.ORANGE); break;
                case 9: g.setColor(Color.PINK); break;
                case 10: g.setColor(Color.RED); break;
                case 11: g.setColor(Color.WHITE); break;
                case 12: g.setColor(Color.YELLOW); break;
            }
            
            g.drawLine(x, y, x, y);
            mainApp.paintIt();
        }
        g.dispose();
    }
    
    public void doStuff() {
        if (count > 10) {
            count = 0;
            
            xAm = rand.nextInt(20) + 1;
            yAm = rand.nextInt(20) + 1;
            
            if ((x + xAm * xDir) >= 1920 || (x + xAm * xDir) <= 0) {
                xDir *= -1;
                
                randAn = rand.nextInt(animals.length);
                
                animals[randAn].MakeSound();
                //System.out.println(animals[randAn].getName());
            }
            
            if ((y + yAm * yDir) >= 1080 || (y + yAm * yDir) <= 0) {
                yDir *= -1;
                
                randAn = rand.nextInt(animals.length);
                
                animals[randAn].MakeSound();
                //System.out.println(animals[randAn].getName());
            }
            
            x += xAm * xDir;
            y += yAm * yDir;
            
            //System.out.println("x: " + x + "+" + xAm * xDir + " y:" + y + "+" + yAm * yDir);
        }
        count += 1;
    }
}
