package com.team.project.simulation.objects;

import com.team.project.engine.entities.CollidableEntity;

/**
 * Static obstacle entity.
 */
public class DemoWall extends CollidableEntity {
    
    public DemoWall(float x, float y) {
        super(x, y, 64, 64);
    }
    
    @Override
    public void update(float deltaTime) {
        // I sit still
    }
}
