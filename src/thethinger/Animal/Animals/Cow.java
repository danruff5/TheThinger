/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thethinger.Animal.Animals;

import thethinger.Entity.Animal;
import thethinger.Entity.Types;

/**
 *
 * @author Glados
 */
public class Cow extends Animal {
    
    public Cow() {
        super("Cow", Types.AnimalTypes.Herbivore, "/Assets/cow22.wav");
    }
}
