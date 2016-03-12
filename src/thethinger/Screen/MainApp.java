/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thethinger.Screen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class MainApp {    
    private final Dimension windowSize;
    
    private final JFrame frame;
    private final ImagePanel imagePanel;
    
    public MainApp() {    
        windowSize = new Dimension(500, 500);
        
        frame = new JFrame();
        frame.resize(windowSize);
        frame.setTitle("Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension d = new Dimension(1920, 1080);
        imagePanel = new ImagePanel(d);
        frame.add(imagePanel);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public Graphics getImageGraphics() { 
        return this.imagePanel.getImg().getGraphics();
    }
    
    public void paintIt() {        
        this.imagePanel.draw();
    }
}
