package com.group.project.simulation.entities;

import com.group.project.engine.base.BaseEntity;

public class PlayerEntity extends BaseEntity {
    public PlayerEntity() {
        super(); // Initialize components
        System.out.println("Player created");
        // Collidable logic would go here
    }
    
    @Override
    public void update(float deltaTime) {
        System.out.println("Player updating...");
    }
}
