package com.team.project.engine.managers;

import java.util.ArrayList;
import java.util.List;
import com.team.project.engine.entities.BaseEntity;

/**
 * Manages all game entities.
 * Handles entity registration and batch updates.
 */
public class EntityManager {
    private List<BaseEntity> entities;

    public EntityManager() {
        entities = new ArrayList<>();
    }

    public void addEntity(BaseEntity entity) {
        entities.add(entity);
    }

    public void update(float deltaTime) {
        for (BaseEntity entity : entities) {
            entity.update(deltaTime);
        }
    }
    
    public List<BaseEntity> getAllEntities() {
        return entities;
    }
}
