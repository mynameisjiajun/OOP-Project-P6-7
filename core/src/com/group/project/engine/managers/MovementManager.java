package com.group.project.engine.managers;

import com.group.project.engine.base.BaseEntity;
import com.group.project.engine.components.Transform;
import com.group.project.engine.components.RigidBody;
import java.util.List;

public class MovementManager {
    public void updateMovement(List<BaseEntity> entities, float deltaTime) {
        for (BaseEntity entity : entities) {
            Transform t = entity.getTransform();
            RigidBody rb = entity.getRigidBody();
            
            if (rb != null && t != null) {
                t.x += rb.velocityX * deltaTime;
                t.y += rb.velocityY * deltaTime;
            }
        }
    }
}
