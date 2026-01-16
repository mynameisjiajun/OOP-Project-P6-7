package AbstractEngine.Entities;

// Child class: Speed, Direction
public class MovableObject extends GameObject {
    private int speed;
    private int direction;

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; }
}
