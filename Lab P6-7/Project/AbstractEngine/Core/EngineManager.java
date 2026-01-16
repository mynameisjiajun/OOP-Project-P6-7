package AbstractEngine.Core;

// The main loop
public class EngineManager {
    private GameManager game;
    private boolean isRunning;

    public EngineManager(GameManager game) {
        this.game = game;
    }

    public void run() {
        game.initialize();
        game.startGame();
        isRunning = true;

        // Simple game loop
        while (isRunning) {
            // TODO: Calculate delta time if needed
            
            // Update cycle
            // In a real engine, we'd update checking inputs, then game logic
            // game.getInputManager().processInput(); // If exposed
            
            // For now, let's assume GameManager has a method to update all its objects
            // But GameManager doesn't expose that yet. We should probably add an update/render to GameManager.
            // For this basic template, we'll just keep the loop running.
            
            // Break to prevent infinite loop hanging the IDE in this example
            // In a real app, you'd have an exit condition.
            try {
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // System.out.println("Engine Step..."); // Debug
        }
    }
    
    public void stop() {
        isRunning = false;
    }
}
