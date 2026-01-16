package AbstractEngine.Entities;

import AbstractEngine.Interfaces.IUpdatable;
import AbstractEngine.Interfaces.IRenderable;

// Parent class: X, Y, ID
public class GameObject implements IUpdatable, IRenderable {
    private int id;
    private int x;
    private int y;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    @Override
    public void update() {}

    @Override
    public void render() {}
}
