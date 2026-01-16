package Simulation.Actors;

import AbstractEngine.Entities.MovableObject;

// Generic Entity
public class SimpleCar extends MovableObject {
    public SimpleCar() {
        System.out.println("SimpleCar created.");
    }
    
    @Override
    public void update() {
        // Generic movement logic
        System.out.println("SimpleCar updating...");
    }
}
