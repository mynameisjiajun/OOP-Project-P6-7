package Simulation;

import AbstractEngine.Core.EngineManager;

// The entry point
public class Main {
    public static void main(String[] args) {
        ConcreteGame game = new ConcreteGame();
        EngineManager engine = new EngineManager(game);
        
        // Run the engine
        // Note: The current run() implementation is an infinite loop.
        // In a real application, you might run this in a separate thread 
        // or have a clear exit condition.
        Thread gameThread = new Thread(() -> engine.run());
        gameThread.start();
        
        System.out.println("Main thread continues...");
    }
}
