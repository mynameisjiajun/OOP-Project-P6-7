package com.team.project.simulation.objects;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;
import com.team.project.engine.entities.CollidableEntity;

/**
 * Player-controlled entity.
 * Moves using WASD keys.
 */
public class DemoPlayer extends CollidableEntity {
    
    public DemoPlayer(float x, float y) {
        super(x, y, 32, 32); // 32x32 size
    }

    @Override
    public void update(float deltaTime) {
        float speed = 200 * deltaTime;
        
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            transform.y += speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            transform.y -= speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            transform.x -= speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            transform.x += speed;
        }
    }
}
