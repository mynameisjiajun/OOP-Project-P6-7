package com.team.project.simulation.objects;

import com.team.project.engine.entities.CollidableEntity;

/**
 * Enemy entity that chases a target.
 */
public class DemoEnemy extends CollidableEntity {
    private CollidableEntity target;

    public DemoEnemy(float x, float y, CollidableEntity target) {
        super(x, y, 32, 32);
        this.target = target;
    }

    @Override
    public void update(float deltaTime) {
        // Simple chase logic
        if (target != null) {
            if (transform.x < target.getTransform().x) transform.x += 50 * deltaTime;
            if (transform.x > target.getTransform().x) transform.x -= 50 * deltaTime;
            if (transform.y < target.getTransform().y) transform.y += 50 * deltaTime;
            if (transform.y > target.getTransform().y) transform.y -= 50 * deltaTime;
        }
    }
}
