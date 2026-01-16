package AbstractEngine.Managers;

import AbstractEngine.Entities.GameObject;
import java.util.ArrayList;
import java.util.List;

// List of all GameObjects
public class ObjectManager {
    private List<GameObject> objects = new ArrayList<>();

    public void addObject(GameObject obj) {
        objects.add(obj);
    }

    public List<GameObject> getObjects() {
        return objects;
    }
}
