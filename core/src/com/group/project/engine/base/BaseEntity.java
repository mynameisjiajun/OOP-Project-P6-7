package com.group.project.engine.base;

import com.group.project.engine.components.Transform;
import com.group.project.engine.components.RigidBody;
import com.group.project.engine.components.Sprite;

public abstract class BaseEntity implements IUpdatable {
    protected Transform transform;
    protected RigidBody rigidBody;
    protected Sprite sprite;
    
    public BaseEntity() {
        this.transform = new Transform(0, 0);
        this.rigidBody = new RigidBody();
        this.sprite = new Sprite("default.png");
    }
    
    public Transform getTransform() { return transform; }
    public RigidBody getRigidBody() { return rigidBody; }
    public Sprite getSprite() { return sprite; }
}
