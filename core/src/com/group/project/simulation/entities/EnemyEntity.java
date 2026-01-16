package com.group.project.simulation.entities;

import com.group.project.engine.base.BaseEntity;

public class EnemyEntity extends BaseEntity {
    public EnemyEntity() {
        super();
        System.out.println("Enemy created");
    }
    
    @Override
    public void update(float deltaTime) {
        // System.out.println("Enemy AI...");
    }
}
