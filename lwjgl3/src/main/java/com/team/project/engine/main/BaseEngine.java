package com.team.project.engine.main;

import com.badlogic.gdx.Game;
import com.team.project.engine.managers.SceneManager;
import com.team.project.simulation.states.SimulationScreen;

public class BaseEngine extends Game {
    private SceneManager sceneManager;
    
    @Override
    public void create() {
        sceneManager = new SceneManager(this);
        // Load the initial simulation screen
        sceneManager.setScreen(new SimulationScreen());
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
}
