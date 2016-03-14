/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thethinger.Entity;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Glados
 */
public abstract class Animal extends Entity {
    private Types.AnimalTypes animalType;
    private String soundLocation;
    
    public Animal(String name, Types.AnimalTypes animalType, String soundLocation) {
        super.setName(name);
        this.animalType = animalType;
        this.soundLocation = soundLocation;
    }

    public Types.AnimalTypes getAnimalType() {
        return animalType;
    }

    public void setAnimalType(Types.AnimalTypes animalType) {
        this.animalType = animalType;
    }
    
    public void MakeSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(this.soundLocation));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
