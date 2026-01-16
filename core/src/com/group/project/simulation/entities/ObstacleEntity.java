package com.group.project.simulation.entities;

import com.group.project.engine.base.BaseEntity;

public class ObstacleEntity extends BaseEntity {
    public ObstacleEntity() {
        super();
        this.getRigidBody().isStatic = true; // Example of "NonCollidable" or static behavior
        System.out.println("Obstacle created");
    }
    
    @Override
    public void update(float deltaTime) {
        // Static object, no update needed usually
    }
}
