package com.team.project.simulation.states;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.team.project.engine.managers.EntityManager;
import com.team.project.engine.managers.CollisionManager;
import com.team.project.engine.managers.IOManager;
import com.team.project.simulation.objects.DemoPlayer;
import com.team.project.simulation.objects.DemoEnemy;
import com.team.project.simulation.objects.DemoWall;

public class SimulationScreen implements Screen {
    
    private EntityManager entityManager;
    private CollisionManager collisionManager;
    private IOManager ioManager;

    @Override
    public void show() {
        entityManager = new EntityManager();
        collisionManager = new CollisionManager();
        ioManager = new IOManager();

        DemoPlayer player = new DemoPlayer(100, 100);
        entityManager.addEntity(player);
        entityManager.addEntity(new DemoEnemy(300, 300, player));
        entityManager.addEntity(new DemoWall(200, 200));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Update logic
        entityManager.update(delta);
        collisionManager.checkCollisions(entityManager.getAllEntities());

        // Draw
        ioManager.begin();
        // Here you would normally draw the entities using ioManager.getBatch()
        ioManager.end();
    }

    @Override
    public void resize(int width, int height) {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}
    @Override
    public void dispose() {
        ioManager.dispose();
    }
}
