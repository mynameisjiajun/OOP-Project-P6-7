package com.team.project.engine.managers;

import java.util.List;
import com.team.project.engine.entities.BaseEntity;
import com.team.project.engine.entities.CollidableEntity;

/**
 * Handles collision detection between CollidableEntities.
 * Uses simple O(N^2) overlap checking.
 */
public class CollisionManager {
    public void checkCollisions(List<BaseEntity> entities) {
        // Simple O(N^2) collision check
         for (int i = 0; i < entities.size(); i++) {
            for (int j = i + 1; j < entities.size(); j++) {
                BaseEntity e1 = entities.get(i);
                BaseEntity e2 = entities.get(j);

                if (e1 instanceof CollidableEntity && e2 instanceof CollidableEntity) {
                    CollidableEntity c1 = (CollidableEntity) e1;
                    CollidableEntity c2 = (CollidableEntity) e2;

                    if (c1.getBounds().overlaps(c2.getBounds())) {
                        System.out.println("Collision detected!");
                    }
                }
            }
        }
    }
}
