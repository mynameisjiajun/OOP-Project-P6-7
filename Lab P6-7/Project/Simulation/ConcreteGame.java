package Simulation;

import AbstractEngine.Core.GameManager;
import Simulation.Actors.SimpleCar;

// Generic Game Implementation
public class ConcreteGame extends GameManager {
    
    @Override
    public void initialize() {
        System.out.println("Initializing Concrete Game...");
        
        // Example: Add a player object
        SimpleCar player1 = new SimpleCar();
        player1.setX(10);
        player1.setY(10);
        player1.setId(1);
        player1.setSpeed(100);
        
        // In a real scenario, we would register this object with ObjectManager
        // objectManager.addObject(player1);
        
        System.out.println("Created Player at " + player1.getX() + ", " + player1.getY());
    }

    @Override
    public void startGame() {
        System.out.println("Game Started!");
    }
}
