package com.group.project.engine.managers;

import com.group.project.engine.base.BaseScene;

public class SceneManager {
    private BaseScene currentScene;
    
    public void loadScene(BaseScene scene) {
        if (currentScene != null) {
            // cleanup
        }
        currentScene = scene;
        currentScene.initialize();
    }
    
    public BaseScene getCurrentScene() {
        return currentScene;
    }
}
