package com.group.project.engine.base;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseScene {
    protected List<BaseEntity> entities;
    
    public BaseScene() {
        this.entities = new ArrayList<>();
    }
    
    public void addEntity(BaseEntity entity) {
        entities.add(entity);
    }
    
    public List<BaseEntity> getEntities() {
        return entities;
    }
    
    public abstract void initialize();
}
