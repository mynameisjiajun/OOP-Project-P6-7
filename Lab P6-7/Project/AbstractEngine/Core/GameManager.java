package AbstractEngine.Core;

import AbstractEngine.Managers.*;

// The base class for any game
public abstract class GameManager {
    protected ObjectManager objectManager;
    protected InputManager inputManager;
    protected RenderManager renderManager;
    protected CollisionManager collisionManager;

    protected GameManager() {
        objectManager = new ObjectManager();
        inputManager = new InputManager();
        renderManager = new RenderManager();
        collisionManager = new CollisionManager();
    }

    public abstract void initialize();
    public abstract void startGame();
}
