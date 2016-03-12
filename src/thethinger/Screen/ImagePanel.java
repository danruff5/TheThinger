/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thethinger.Screen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class ImagePanel extends JPanel {
    
    private final BufferedImage img;
    
    public ImagePanel(Dimension size) {        
        setPreferredSize(size);
        
        img = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
    }

    public BufferedImage getImg() {
        return img;
    }
    
    public void draw() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, null);
    }
}
