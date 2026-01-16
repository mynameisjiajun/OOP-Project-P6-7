package com.group.project.engine.managers;

import com.group.project.engine.base.BaseEntity;
import java.util.ArrayList;
import java.util.List;

public class EntityManager {
    private List<BaseEntity> entities;
    
    public EntityManager() {
        this.entities = new ArrayList<>();
    }
    
    public void registerEntity(BaseEntity entity) {
        entities.add(entity);
    }
    
    public List<BaseEntity> getAllEntities() {
        return entities;
    }
}
