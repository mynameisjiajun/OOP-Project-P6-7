package com.team.project.engine.entities;

import com.badlogic.gdx.math.Vector2;
import com.team.project.engine.components.Transform;
import com.team.project.engine.components.SpriteData;

public class BaseEntity {
    private static int nextId = 0;
    protected int id;
    protected Transform transform;
    protected SpriteData spriteData;

    public BaseEntity(float x, float y) {
        this.id = nextId++;
        this.transform = new Transform(x, y);
    }
    
    public Transform getTransform() {
        return transform;
    }
    
    public void setSprite(String path) {
        this.spriteData = new SpriteData(path);
    }

    public void update(float deltaTime) {
        // Generic update
    }
}
