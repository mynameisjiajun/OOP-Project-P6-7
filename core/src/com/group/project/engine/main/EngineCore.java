package com.group.project.engine.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.group.project.engine.managers.*;
import com.group.project.simulation.logic.DemoSimulation;

public class EngineCore extends ApplicationAdapter {
    private SceneManager sceneManager;
    private EntityManager entityManager;
    private CollisionManager collisionManager;
    private MovementManager movementManager;
    private IOManager ioManager;
    
    public EngineCore() {
        // Constructor is empty now, we verify in create()
    }
    
    @Override
    public void create() {
        sceneManager = new SceneManager();
        entityManager = new EntityManager();
        collisionManager = new CollisionManager();
        movementManager = new MovementManager();
        ioManager = new IOManager();

        // Load the demo scene
        sceneManager.loadScene(new DemoSimulation());
        
        // Register entities from scene to manager
        if (sceneManager.getCurrentScene() != null) {
            for(BaseEntity entity : sceneManager.getCurrentScene().getEntities()) {
                entityManager.registerEntity(entity);
            }
        }
        
        System.out.println("Engine Loop Started (LibGDX)...");
    }
    
    @Override
    public void render() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        
        // Clear screen (Standard GDX)
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // 1. Input
        ioManager.processInput();
        
        // 2. Update Movement
        movementManager.updateMovement(entityManager.getAllEntities(), deltaTime);
        
        // 3. Update Entities Custom Logic
        for(BaseEntity entity : entityManager.getAllEntities()) {
            entity.update(deltaTime);
        }
        
        // 4. Collision
        collisionManager.checkCollisions(entityManager.getAllEntities());
        
        // 5. Render (Placeholder)
        // renderManager.draw(entityManager.getAllEntities());
    }
    
    @Override
    public void dispose() {
        // Cleanup resources here
    }
}
