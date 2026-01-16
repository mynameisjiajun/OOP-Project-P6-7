package com.team.project.engine.managers;

import com.badlogic.gdx.Screen;

/**
 * Manages screen/scene transitions.
 * Provides abstraction over LibGDX screen switching.
 */
public class SceneManager {
    private com.badlogic.gdx.Game game;

    public SceneManager(com.badlogic.gdx.Game game) {
        this.game = game;
    }

    public void setScreen(Screen screen) {
        game.setScreen(screen);
    }
}
