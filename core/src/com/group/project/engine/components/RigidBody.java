package com.group.project.engine.components;

public class RigidBody {
    public float velocityX;
    public float velocityY;
    public float mass;
    public boolean isStatic; // Bounds/Collidable check could use this
    
    public RigidBody() {
        this.mass = 1.0f;
    }
}
