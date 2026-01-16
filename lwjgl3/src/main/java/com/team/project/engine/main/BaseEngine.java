package com.team.project.engine.main;

import com.badlogic.gdx.Game;
import com.team.project.engine.managers.SceneManager;
import com.team.project.simulation.states.SimulationScreen;

/**
 * Main entry point for the game engine.
 * Extends LibGDX Game class and manages screen transitions.
 */
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
