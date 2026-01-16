package com.team.project.engine.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class IOManager {
    private SpriteBatch batch;

    public IOManager() {
        batch = new SpriteBatch();
    }

    public void begin() {
        batch.begin();
    }

    public void end() {
        batch.end();
    }
    
    public SpriteBatch getBatch() {
        return batch;
    }

    public void dispose() {
        batch.dispose();
    }
    
    public boolean isKeyPressed(int key) {
        return Gdx.input.isKeyPressed(key);
    }
}
