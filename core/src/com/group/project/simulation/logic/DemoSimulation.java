package com.group.project.simulation.logic;

import com.group.project.engine.base.BaseScene;
import com.group.project.simulation.entities.PlayerEntity;
import com.group.project.simulation.entities.EnemyEntity;
import com.group.project.simulation.entities.ObstacleEntity;

public class DemoSimulation extends BaseScene {
    
    @Override
    public void initialize() {
        System.out.println("Simulating Demo Scene...");
        
        // Add specific actors
        this.addEntity(new PlayerEntity());
        this.addEntity(new EnemyEntity());
        this.addEntity(new ObstacleEntity());
    }
}
